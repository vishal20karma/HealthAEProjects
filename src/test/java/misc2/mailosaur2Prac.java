package misc2;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mailosaur2Prac {

@Test
public void OTPTesting() throws IOException, MailosaurException, InterruptedException   {
String subOTP = getSubjectOTP();
System.out.println("Subject OTP: "+subOTP);
String bdOTP = getBodyOTP();
System.out.println("Body OTP: "+bdOTP);
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://rahulshettyacademy.com/practice-project");
driver.findElement(By.id("name")).sendKeys(subOTP);
driver.findElement(By.id("email")).sendKeys(bdOTP);
Thread.sleep(2000);
driver.quit();
}

public static Message emailDetails() throws IOException, MailosaurException   {
String apiKey="CXqygIzQruwRriWNMCmov8qWUtPRV3y1";
String serverId="xbbcpxis";
String serverDomain="xbbcpxis.mailosaur.net";
try {
MailosaurClient mailosaur = new MailosaurClient(apiKey);
MessageSearchParams params = new MessageSearchParams();
params.withServer(serverId);
SearchCriteria criteria = new SearchCriteria();
criteria.withSentTo("anything@"+serverDomain);
Message message = mailosaur.messages().get(params, criteria);
return message;
}
catch (MailosaurException e)   {
return null;
}
}

public String getSubjectOTP() throws IOException, MailosaurException   {
Message msg1 = emailDetails();
assertTrue(msg1!=null);
String emailSubOTP = msg1.from().get(0).email();
System.out.println(emailSubOTP);
assertEquals("vishal.vishwakarma20@gmail.com", emailSubOTP);
String subject = msg1.subject();
Pattern pattern = Pattern.compile("Emails for Testing OTP .*([0-9]{6}).*");
Matcher matcher = pattern.matcher(subject);
matcher.find();
String subjectOTP = matcher.group(1);
return subjectOTP;
}

public String getBodyOTP() throws IOException, MailosaurException   {
Message msg2 = emailDetails();
assertTrue(msg2!=null);
String emailBodyOTP = msg2.from().get(0).email();
System.out.println(emailBodyOTP);
assertEquals("vishal.vishwakarma20@gmail.com", emailBodyOTP);
String body = msg2.text().body();
Pattern pattern = Pattern.compile("Your six digit OTP is .*([0-9]{6}).*");
Matcher matcher = pattern.matcher(body);
matcher.find();
String bodyOTP = matcher.group(1);
return bodyOTP;
}

}
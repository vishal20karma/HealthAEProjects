package misc2;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.Messages;
import com.mailosaur.models.Attachment;
import com.mailosaur.models.Code;
import com.mailosaur.models.Link;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

public class mailosaur1 {
/*
@Test
public void testEmail() throws IOException, MailosaurException   {
//These are important to setup
String apiKey="CXqygIzQruwRriWNMCmov8qWUtPRV3y1";
String serverId="xbbcpxis";
String serverDomain="xbbcpxis.mailosaur.net";

MailosaurClient mailosaur = new MailosaurClient(apiKey);

MessageSearchParams params = new MessageSearchParams();
params.withServer(serverId);

SearchCriteria criteria = new SearchCriteria();
criteria.withSentTo("anything@"+serverDomain);

Message message = mailosaur.messages().get(params, criteria);

System.out.println("*************** Testing Email 'From/To/CC/Subject' ***************");
//Testing for From/To/CC/Subject
System.out.println("Email Subject: "+message.subject());   //How to get Email subject
System.out.println("Email from: "+message.from().get(0).email());
System.out.println("Email sent to: "+message.to().get(0).email());   //How to get 'To' list
System.out.println("Email copied to: "+message.cc());   //How to get 'CC' list, if there is no 'CC' in actual then it will return exception of 'index out of bound' if 'get(0)' used
assertNotNull(message);
assertEquals("Top Jobs from Leading IT/Tech Companies like Amazon, Ola, Paytm etc", message.subject());

//Testing for Body
System.out.println("*************** Testing Email Body ***************");
System.out.println("Email Body: "+message.text().body());
assertTrue(message.text().body().contains("Publicis Sapient"));

System.out.println("*************** Testing Email 1st Link ***************");
System.out.println("Total Email Links: "+message.html().links().size());
Link firstLink = message.html().links().get(0);
System.out.println("First Link: "+firstLink.text());
System.out.println("First Link URL: "+firstLink.href());

System.out.println("*************** Testing Email All the Links ***************");
List<Link> allLinks = message.html().links();
for (Link URL:allLinks)   {
System.out.println(URL.text());
System.out.println(URL.href());
}

System.out.println("*************** Testing Attachments ***************");
Attachment firstAttachment = message.attachments().get(1);   //Purposely used '1' index as at '0th' index we have attached image
System.out.println("Total attachments: "+message.attachments().size());
System.out.println("Attachment's name: "+firstAttachment.fileName());
System.out.println("Attachment's type: "+firstAttachment.contentType());
System.out.println("Attachment's size: "+firstAttachment.length());

System.out.println("*************** Testing Images ***************");
System.out.println("Total images: "+message.html().images().size());   //Testing how many images attached in email

System.out.println("*************** Testing Codes/OTP ***************");
Code otp = message.html().codes().get(0);   //Direct way to fetch the OTP
System.out.println("Four Digit Code: "+otp.value());

System.out.println("*************** Testing Codes/OTP Alternate Ways ***************");
//This is used when above code does not work or alternate way to get your OTP, it is also called regular expression way
Pattern pattern = Pattern.compile("Your six digit OTP is .*([0-9]{6}).*");
Matcher matcher = pattern.matcher(message.text().body());
matcher.find();
System.out.println("Six Digit OTP: "+matcher.group(1));   //Here 'group' extracts matched substrings after applying a regular expression. If used group(0) then it returns the entire string, if used group(1) then returns the remaining string wich is OTP in this case
}   */

//For Practice
@Test	
public void testEmail() throws IOException, MailosaurException   {
String apiKey="CXqygIzQruwRriWNMCmov8qWUtPRV3y1";
String serverId="xbbcpxis";
String serverDomain="xbbcpxis.mailosaur.net";

MailosaurClient mailosaur = new MailosaurClient(apiKey);
MessageSearchParams params = new MessageSearchParams();
params.withServer(serverId);
SearchCriteria criteria = new SearchCriteria();
criteria.withSentTo("anything@"+serverDomain);
Message message = mailosaur.messages().get(params, criteria);

System.out.println("*************** Testing Email 'From/To/CC/Subject' ***************");
assertNotNull(message);
System.out.println("Email from: "+message.from().get(0).email());
System.out.println("Email sent to: "+message.to().get(0).email());
System.out.println("Email copied to: "+message.cc());
System.out.println("Email subject: "+message.subject());
assertEquals("Emails for Testing OTP 985674", message.subject());

//Testing for Body
System.out.println("*************** Testing Email Body ***************");
System.out.println("Email body: "+message.text().body());
assertTrue(message.text().body().contains("Publicis Sapient"));

System.out.println("*************** Testing Email 1st Link ***************");
Link firstLink = message.html().links().get(0);
System.out.println("First link: "+firstLink.text());
System.out.println("First link URL: "+firstLink.href());

System.out.println("*************** Testing Email All the Links ***************");
List<Link> allLinks = message.html().links();
System.out.println("Total links: "+allLinks.size());
for (Link URL:allLinks)   {
System.out.println(URL.text());
System.out.println(URL.href());
}

System.out.println("*************** Testing Attachments ***************");
Attachment firstAttachment = message.attachments().get(1);
System.out.println("Attachment's name: "+firstAttachment.fileName());
System.out.println("Attachment's type: "+firstAttachment.contentType());
System.out.println("Attachment's size: "+firstAttachment.length());

System.out.println("*************** Testing Images ***************");
System.out.println("Total images: "+message.html().images().size());

System.out.println("*************** Testing Codes/OTP ***************");
Code otp = message.html().codes().get(0);
System.out.println("Four digit OTP: "+otp.value());

System.out.println("*************** Testing Codes/OTP Alternate Ways ***************");
Pattern pattern = Pattern.compile("Your six digit OTP is .*([0-9]{6}.*)");
Matcher matcher = pattern.matcher(message.text().body());
matcher.find();
System.out.println("Six digit OTP: "+matcher.group(1));
}

}

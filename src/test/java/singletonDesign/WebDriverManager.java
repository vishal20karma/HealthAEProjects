package singletonDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {
//How to achieve singleton design patter in real time
/*
private volatile static WebDriverManager instance;
private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

private WebDriverManager()   {
}

public void setDriver(String browser)   {
switch (browser)   {
case "chrome" : tlDriver.set(new ChromeDriver());
break;
case "firefox" : tlDriver.set(new FirefoxDriver());
break;
case "edge" : tlDriver.set(new EdgeDriver());
break;
default : System.out.println(browser+": Incorrect browser has been passed");
}
}

public static WebDriverManager getInstance(String browser)   {
if (instance==null)   {
synchronized (WebDriverManager.class)   {
if (instance==null)   {
instance = new WebDriverManager();
}
}
}
if (tlDriver.get()==null)   {
instance.setDriver(browser);	
}
return instance;
}

public WebDriver getDriver()   {
return tlDriver.get();
}

public static void quitDriver()   {
if (tlDriver.get()!=null)   {
tlDriver.get().quit();
tlDriver.remove();
}
}   */
	
// For Practice
private volatile static WebDriverManager instance;
private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

private WebDriverManager()   {
}

public void setDriver(String browser)   {
switch(browser)   {
case "chrome" : tlDriver.set(new ChromeDriver());
break;
case "firefox" : tlDriver.set(new FirefoxDriver());
break;
case "edge" : tlDriver.set(new EdgeDriver());
break;
default : throw new IllegalArgumentException(browser+": Invalid Browser");
}
}

public static WebDriverManager getInstance(String browser)   {
if (instance==null)   {
synchronized (WebDriverManager.class)   {
if (instance==null)   {	
instance = new WebDriverManager();
}
}
}	
if (tlDriver.get()==null)   {
instance.setDriver(browser);
}
return instance;
}

public WebDriver getDriver()   {
return tlDriver.get();
}

public static void quitDriver()   {
if (tlDriver.get()!=null)   {
tlDriver.get().quit();
tlDriver.remove();
}
}

}
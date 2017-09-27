package com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass1 {

	public static void main(String[] args)  {
	System.setProperty("webdriver.gecko.driver","D://geckodriver//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	//Thread.sleep(1000);
	driver.get("https://tutorialspoint.com");
	}
}

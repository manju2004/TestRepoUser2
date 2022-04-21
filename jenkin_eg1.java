package testpackage;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class jenkin_eg1 {
public String baseUrl = "https://facebook.com";
String driverpath = "D://Selenium-2022//Drivers//chromedriver.exe";
public WebDriver driver;

 @Test
 public void test() {
 System.setProperty("webdriver.chrome.driver", driverpath);
 driver = new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.manage().window().maximize();
 driver.get(baseUrl);
 String URL =driver.getCurrentUrl();
 System.out.print(URL);
 String title = driver.getTitle();
 System.out.println(title);
 }
 
 @BeforeTest
 public void beforeTest() {
	 System.out.println("before test");
 }
	 
 @AfterTest
 public void afterTest() {
	 driver.quit();
	 System.out.println("after test");
 }
 
}
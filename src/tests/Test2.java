package tests;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Test2 {

	private DesiredCapabilities caps = new DesiredCapabilities();
	private AppiumDriver driver;
  
	@Before
  public void setUp() throws Exception {
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "ad09160350562f0b2a"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.0");
		caps.setCapability("appPackage", "com.pioneer.encirca.android.qa"); //Give AppPackage
		caps.setCapability("appActivity", "com.pioneer.encirca.ui.splash.SplashActivity"); //Give appActivity
		caps.setCapability("noReset", "true");
	}
	@Test
  public void test_01() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.id("com.pioneer.encirca.android.qa:id/login_username_field")).sendKeys("admin2@testing.encirca.pioneer.com");
		driver.findElement(By.id("com.pioneer.encirca.android.qa:id/login_password_field")).sendKeys("test123$");
		driver.findElement(By.id("com.pioneer.encirca.android.qa:id/text_input_password_toggle")).click();
		driver.hideKeyboard();
		driver.findElement(By.id("com.pioneer.encirca.android.qa:id/sign_in_action_btn")).click();
  	}
	@After
  public void tearDown() throws Exception {
		driver.quit();
	  
    }
}

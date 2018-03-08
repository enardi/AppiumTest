package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
public class Test1 {

public static void main(String[] args) throws InterruptedException {
		
		
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "ad09160350562f0b2a"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.0");
		caps.setCapability("appPackage", "com.pioneer.encirca.android.qa"); //Give AppPackage
		caps.setCapability("appActivity", "com.pioneer.encirca.ui.splash.SplashActivity"); //Give appActivity
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		try {
				AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
				Thread.sleep(3000);
				driver.findElement(By.id("com.pioneer.encirca.android.qa:id/login_username_field")).sendKeys("admin2@testing.encirca.pioneer.com");
				driver.findElement(By.id("com.pioneer.encirca.android.qa:id/login_password_field")).sendKeys("test123$");
				driver.findElement(By.id("com.pioneer.encirca.android.qa:id/text_input_password_toggle")).click();
				driver.hideKeyboard();
				driver.findElement(By.id("com.pioneer.encirca.android.qa:id/sign_in_action_btn")).click();
				
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
 
}
package appiumTest;

import java.awt.RenderingHints.Key;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class googleSearch {
DesiredCapabilities caps = new DesiredCapabilities() ;
@Test () 
public void googleSearchTest () throws Exception {
	caps.setCapability(MobileCapabilityType.DEVICE_NAME, "karam");
	caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	caps.setCapability("chromedriverExecutable", "C:\\Users\\DELL\\Desktop\\chromeWebDriver\\chromedriver.exe");
	@SuppressWarnings("deprecation")
	AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub")  , caps);
driver.get("http://www.google.com") ; 
String title = driver.getTitle() ;
System.out.println(title);
//	driver.findElement(By.id("com.android.chrome:id/search_box_text")).sendKeys("karam srouji"+Keys.ENTER) ; 
	
} 
}

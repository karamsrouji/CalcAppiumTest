package appiumTest;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class appium {
	DesiredCapabilities caps = new DesiredCapabilities();
	AndroidDriver driver ; 

	@BeforeTest
	public void startTest  () {
		File app = new File("src/appiumTest/calculator.apk") ; 
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "karam");
//		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
//		caps.setCapability("chromedriverExecutable", "C:\\Users\\DELL\\Desktop\\chromeWebDriver\\chromedriver.exe");
		caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	} 


//@Test () 
//public void myTestOne () throws MalformedURLException, InterruptedException { 
//
//	@SuppressWarnings("deprecation")
 // AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub")  , caps);
//
//driver.findElement(By.id("com.google.android.calculator:id/digit_7")).click();
//driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
//driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
//
//Thread.sleep(2000) ;
//String expectedvalue = driver.findElement(By.id("com.google.android.calculator:id/result_preview")).getText();
//Boolean valuemsg = expectedvalue.contains("9") ; 
//SoftAssert myassertiion = new SoftAssert ();
//myassertiion.assertEquals(valuemsg, true) ; 
//myassertiion.assertAll();
//
//}
	
	
	@Test(priority = 2) 
	public void clickAllDigits () throws MalformedURLException {
		@SuppressWarnings("deprecation")
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub")  , caps);
		List<WebElement> mydigit = driver.findElements(By.className("android.widget.ImageButton")); 
		for (int i=0 ; i<mydigit.size() ;i++) {
			if (mydigit.get(i).getAttribute("resource-id").contains("digit_8")) {
				mydigit.get(i).click();
			}
			if (mydigit.get(i).getAttribute("resource-id").contains("digit_4")) {
				mydigit.get(i).click();
			}
			if (mydigit.get(i).getAttribute("resource-id").contains("digit_6")) {
				mydigit.get(i).click();
			}
			if (mydigit.get(i).getAttribute("resource-id").contains("digit_2")) {
				mydigit.get(i).click();
			}
			
		}
		SoftAssert myassertion =  new SoftAssert() ;
		String expectedvalue = "8462" ;
		String actualvalue = driver.findElement(By.id("com.google.android.calculator:id/formula")).getText(); 
		myassertion.assertEquals(actualvalue, expectedvalue) ; 
		myassertion.assertAll(); 
		
	}




}

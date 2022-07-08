package Programs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PerformAddInCalculator {
@Test
public void  performAddition() throws MalformedURLException, InterruptedException {
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "POCO M3");
	dc.setCapability(MobileCapabilityType.UDID, "2bf1ab3a0421");
	dc.setCapability("appPackage", "com.miui.calculator");
	dc.setCapability("appActivity", ".cal.CalculatorActivity");
	URL url= new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url, dc);
	driver.findElementById( "android:id/button1").click();
	Thread.sleep(2000);
	driver.findElementById("com.miui.calculator:id/btn_7_s").click();
	//Thread.sleep(2000);
	driver.findElementById("com.miui.calculator:id/btn_plus_s").click();
	//Thread.sleep(2000);
	driver.findElementById("com.miui.calculator:id/btn_5_s").click();
	//Thread.sleep(2000);
	 String value = driver.findElementById("com.miui.calculator:id/result").getText();
	System.out.println(value);
	
	
	
	
}
}

package Programs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
//anuradha
public class CalculatorAdd {
	public void  performAddition() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "POCO M3");
		dc.setCapability(MobileCapabilityType.UDID, "2bf1ab3a0421");
		dc.setCapability("appPackage","com.miui.calculator");
		dc.setCapability("appActivity", ".cal.CalculatorActivity");
		URL url= new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, dc);
		driver.findElementById( "android:id/button1").click();
		 WebElement seven = driver.findElementById("com.miui.calculator:id/btn_7_s");
		WebElement plus = driver.findElementById("com.miui.calculator:id/btn_plus_s");
		WebElement five = driver.findElementById("com.miui.calculator:id/btn_5_s");
		TouchAction tc = new TouchAction(driver);
	tc.tap(TapOptions.tapOptions().withElement(ElementOption.element(seven))).perform();
	tc.tap(TapOptions.tapOptions().withElement(ElementOption.element(plus))).perform();
	tc.tap(TapOptions.tapOptions().withElement(ElementOption.element(five))).perform();
	
	
	
		
		
}
}

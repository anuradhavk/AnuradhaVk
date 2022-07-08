package Programs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchTouchScreen {
@Test
public void touchScreen() throws MalformedURLException {
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "POCO M3");
	dc.setCapability("appActivity", ".TouchScreenTestActivity");
	dc.setCapability(MobileCapabilityType.UDID,"2bf1ab3a0421");
	dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url, dc);
	
}
}

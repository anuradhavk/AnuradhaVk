package Programs;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileCapabilityType;

public class UninstallGeneralStore {
@Test
public void unistallGeneralStore() {
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "POCO M3");
	dc.setCapability(MobileCapabilityType.UDID, "2bf1ab3a0421");
	dc.setCapability("appPackage", "");
	
}
}

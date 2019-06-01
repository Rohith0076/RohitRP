import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Launching {

	 public static String va ="//div[@id='rohith']";
	 
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabilities=DesiredCapabilities.android();
		 
		 
		// set the capability to execute test in chrome browser
		 capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
		 
		// set the capability to execute our test in Android Platform
		   capabilities.setCapability(MobileCapabilityType.PLATFORM,Platform.ANDROID);
		 
		// we need to define platform name
		  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		 
		// Set the device name as well (you can give any name)
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"my phone");
		 
		 // set the android version as well 
		   capabilities.setCapability(MobileCapabilityType.VERSION,"9");
		 
		 // Create object of URL class and specify the appium server address
		 URL url= new URL("http://0.0.0.0:4723/wd/hub");
		 
		
		// Create object of  AndroidDriver class and pass the url and capability that we created
		 WebDriver driver = new AndroidDriver(url, capabilities);
		 
		// Open url
		  driver.get("http://www.facebook.com");
		 
		 // print the title
		
		
		
	}
}

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class WinAppDriverTrial {
	public static WindowsDriver driver = null;

	@BeforeMethod
	public void setup() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("app", "C:\\Windows\\notepad.exe");
		cap.setCapability("platform", "windows");
		cap.setCapability("device", "WindowsPC");
		try {
			driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), cap);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void cleanUp() {
		driver.close();
		driver.quit();
	}

	@Test
	public void checkHelpAboutTest() {
		//driver.manage().window().maximize();
		try {
			//driver.switchTo().defaultContent();
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.findElementByName("Help").click();
			Thread.sleep(2000);
			driver.findElementByName("About Notepad").click();
			Thread.sleep(2000);
			driver.findElementByName("OK").click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {

	public static AppiumDriver driver;

	@BeforeTest    
	public void setUpEnvironment() throws MalformedURLException, InterruptedException {

		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("automationName", "Appium");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.VERSION, "8.1.0");
		caps.setCapability("udid", "emulator-5554");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus5X");
		caps.setCapability(MobileCapabilityType.APP, "E:\\StagingElgameya.apk");
//	    caps.setCapability("appPackage", "com.google.android.apps.nexuslauncher");
		caps.setCapability("appActivity","com.gameya.elgameya.SplashActivity");
		caps.setCapability("appWaitActivity","com.gameya.elgameya.SplashActivity,com.gameya.elgameya.MainActivity");
//		caps.setCapability("appWaitPackage","com.google.android.apps.nexuslauncher.NexusLauncherActivity");
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver =new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
	}

//	@Test
//	public void test() {
//
//		WebElement Textfield =driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]"));
//		Textfield.click();
//		WebElement loginbymailbut=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup[2]/android.widget.TextView"));
//		loginbymailbut.click();
//		Textfield.sendKeys("Hello world");	
//	}
//	@Test
//	public void Login_case() {
//		
//		WebElement username= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));
//		username.sendKeys("01225170981");
//		WebElement password= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));
//		password.sendKeys("P@ssword12");
//		WebElement loginbut=driver.findElement(By.xpath(null));
//		loginbut.click();
//	}

	@AfterTest
	public void quite() {
		driver.quit();

	}

}
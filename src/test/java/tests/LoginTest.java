package tests;

import java.net.MalformedURLException;

import org.testng.annotations.Test;
import tests.TestBase;

import pages.LoginPage;

public class LoginTest extends TestBase{
	
	LoginPage loginpage;
	
	@Test
	public void testLogin() throws MalformedURLException, InterruptedException {
		setUpEnvironment();
//		loginpage=new LoginPage(driver);
//		loginpage.insertInputField("ramy@yahoo.com", "123456789");
		
		System.out.println("hello world");
		
		
	}

}

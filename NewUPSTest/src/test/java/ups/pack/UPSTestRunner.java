package ups.pack;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.pack.BrowserDrivers;

public class UPSTestRunner extends BrowserDrivers {

	WebDriver driver = null;
	UpsLoginPage upsLoginPage = null;

	@BeforeMethod(alwaysRun = true)
	void beforeMethod() {

		driver = getChromeDriver();
		upsLoginPage = new UpsLoginPage(driver);
	}

	@Test(priority = 3, groups= {"SanityTest"})
	void loginErrorMessageTest() {
		driver.get("https://www.ups.com/lasso/login?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		upsLoginPage.userId("testUser");
		upsLoginPage.password("myPassword");
		upsLoginPage.clickLoginButton();
		String errorMessage = upsLoginPage.upsLoginErrorMessageTest();
		if (errorMessage.contains("unsuccessful")) {
			System.out.println("PASSED!");
		} else {
			System.out.println("FAILED");
			Assert.fail();
		}

	}

	@Test(priority = 4, groups= {"RegressionTest"})
	public void signUpLinkTest() throws InterruptedException {
		driver.get("https://www.ups.com/lasso/login?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		upsLoginPage.clickSignUpLink();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Sign Up | UPS");

	}
	
	@Test(priority = 3, groups= {"SanityTest"})
	void SignUpErrorMessageTest() throws InterruptedException {
		driver.get("https://wwwapps.ups.com/doapp/signup?loc=en_US&returnto=https:%2F%2Fwww.ups.com%2Fus%2Fen%2FHome.page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		upsLoginPage.InsertName("ABID");
		upsLoginPage.email("demoemail@gmail.com");
		upsLoginPage.userIdtwo("user");
		upsLoginPage.passwordtwo("Passnumber123!");
		upsLoginPage.number("3478853489");
		upsLoginPage.clickacceptButton();
		upsLoginPage.clicksignButton();
		Thread.sleep(2000);

}

	@Test(priority = 2, groups= {"SanityTest"})
	public void myDemoTest1() {
		System.out.println("My DemoTest 1 executed.......");
	}

	@Test(priority = 1, groups= {"RegressionTest"})
	public void myDemoTest2() {
		System.out.println("My DemoTest 2 executed.......");
	}

	@AfterMethod(alwaysRun = true)
	void afterMethod() {
		driver.close();
	}

}

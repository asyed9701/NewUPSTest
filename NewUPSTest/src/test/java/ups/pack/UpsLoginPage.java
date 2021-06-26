package ups.pack;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class UpsLoginPage {

	WebDriver driver = null;

	public UpsLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void userId(String user) {
		WebElement userID = driver.findElement(By.id("email"));
		userID.sendKeys(user);

	}

	public void password(String pass) {
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pass);

	}

	public void clickLoginButton() {
		WebElement loginButton = driver.findElement(By.xpath("//*[@id='submitBtn']"));
		loginButton.click();
	}

	public String upsLoginErrorMessageTest() {
		WebElement errorMessages = driver.findElement(By.id("errorMessages"));
		String message = errorMessages.getText();
		return message;
	}


	public void clickSignUpLink() {
		
		WebElement signUp = driver.findElement(By.xpath("//*[@id=\"DOARegisterLink\"]"));
		signUp.click();
		
	}
	public void InsertName(String name) {
		WebElement InsertName = driver.findElement(By.name("fullName"));
		InsertName.sendKeys(name);

	}

	public void email(String em) {
		WebElement email = driver.findElement(By.xpath("//*[@id=\"ups-email_input\"]"));
		email.sendKeys(em);

	}
	
	public void userIdtwo(String user) {
		WebElement UserIdtwo = driver.findElement(By.xpath("//*[@id=\"ups-user_id_input\"]"));
		UserIdtwo.sendKeys(user);

	}
	public void passwordtwo(String pass) {
		WebElement passwordtwo = driver.findElement(By.xpath("//*[@id=\"ups-user_password_input\"]"));
		passwordtwo.sendKeys(pass);

	}
	public void number(String num) {
		WebElement number = driver.findElement(By.xpath("//*[@id=\"ups-phone_input\"]"));
		number.sendKeys(num);

	}
	

	public void clickacceptButton() {
		WebElement acceptButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div/div/fullpage-doa/main-component/div/login-register/div/div/div[2]/div[2]/form/div[4]/div/div/div[1]/div/label/a"));
		acceptButton.click();
	}
	public void clicksignButton() {
		WebElement signButton = driver.findElement(By.xpath("public void clickacceptButton() {\r\n"
				+ "		WebElement acceptButton = driver.findElement(By.xpath(\"//*[@id=\\\"ups-checkbox_group\\\"]/div/label\"));\r\n"
				+ "		acceptButton.click();\r\n"
				+ "	}"));
		signButton.click();
	}
	
	
}

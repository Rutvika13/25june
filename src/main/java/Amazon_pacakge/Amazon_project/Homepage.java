package Amazon_pacakge.Amazon_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Homepage

{
	WebDriver driver;
	// step 1
	@FindBy(xpath = "//span[@class='nav-action-inner']")WebElement signin1;

	@FindBy(xpath = "//input[@name='email']")WebElement un;

	@FindBy(xpath = "//span[@id='continue']")WebElement contbtn;

	@FindBy(xpath = "//input[@type='password']")WebElement pwd;

	@FindBy(xpath = "//a[@class='nav-a']")WebElement newuser;

	@FindBy(xpath = "//input[@type='submit']")WebElement signin2;

	@FindBy(xpath = "//span[@id='intention-submit-button']")WebElement proceed;

	@FindBy(xpath = "//input[@id='ap_customer_name']")WebElement firstname;
	
	@FindBy(xpath = "//input[@type='password']")WebElement newuserpasswd;
	
	@FindBy(xpath = "//input[@id='continue']")WebElement verifynumber;
	
	// step 2

	public void login() {
		signin1.click();
		Reporter.log("Successful signin1");
	}

	public void newuserbtn() {
		newuser.click();
		Reporter.log("signin new user");
	}

	public void username() {
		un.sendKeys("7066328484");
		Reporter.log("Enter the username");
	}

	public void newusername() {
		un.sendKeys("9130242443");
		Reporter.log("Enter the username");
	}
	public void procedbtn() {
		proceed.click();
		Reporter.log("Successful signin1");
	}

	public void continebtn() {
		contbtn.click();
		Reporter.log("Cliking continue");
		Assert.assertEquals(pwd.isDisplayed(), false);

	}
	public void firstnamebtn() {
		firstname.sendKeys("Rutvika");
		Reporter.log("Successful signin1");
	}
	public void pwdfirstnamebtn() {
		newuserpasswd.sendKeys("Rutvika@123");
		Assert.assertEquals(verifynumber.isDisplayed(), true);
		Reporter.log("Successful signin1");
	}
	public void passw() throws InterruptedException {
		Thread.sleep(1000);
		pwd.sendKeys("kalyani@90");
		Reporter.log("Entering password");

	}

	public void invalidusername() {
		un.sendKeys("562356");
	}

	public void invalidpassw() {
		pwd.sendKeys("kalyani@99");
		// Assert.assertEquals(password.isDisplayed(),false);
	}

	public void finalsigning() {
		signin2.click();
		Reporter.log("Successful login in");

	}

	public void usernameforlogin(String username) {
		un.sendKeys(username);
		Reporter.log("Enter the username");
	}

	public void passwordforlogin(String password) {
		pwd.sendKeys(password);
		Reporter.log("Enter the username");
	}

	// step 3
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Reporter.log("successful done step 3");
	}

}

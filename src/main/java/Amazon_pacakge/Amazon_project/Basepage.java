package Amazon_pacakge.Amazon_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class Basepage extends TestListners1
{
	
		public static WebDriver driver;
		@Parameters("Browser")
		@BeforeMethod
		public void login_in(String browsername)
		{
			if(browsername.equalsIgnoreCase("Chrome"))
			{
				driver= new ChromeDriver();
				Reporter.log("Chrome Launch Successfully");
			}
			if(browsername.equalsIgnoreCase("Edge"))
			{
				driver= new EdgeDriver();
				Reporter.log("Edge Launch Successfully");
			}
			if(browsername.equalsIgnoreCase("Firefox"))
			{
				driver= new FirefoxDriver();
				Reporter.log("Firefox Launch Successfully");
			}
			driver= new EdgeDriver();
			driver.get("https://www.amazon.in");
			driver.navigate().refresh();
			WebElement accountandlist=	driver.findElement(By.id("nav-link-accountList-nav-line-1"));
			Actions a1=new Actions(driver);
			a1.moveToElement(accountandlist);
			a1.perform();
			Reporter.log("Successfully done to account");
		}
		
		
		@AfterMethod
		public void log_out()
		{
			driver.close();
			Reporter.log("Successfully close");
		}

	}



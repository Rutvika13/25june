package Amazon_pacakge.Amazon_project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Caseno_9_Addtocart 
{
	
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchitem;
	

	@FindBy(xpath ="(//img[@class='s-image'])[1]")
	WebElement firstshoe;
	
	@FindBy(xpath ="//input[@name='submit.add-to-cart']")
	WebElement addtocart;
	
	@FindBy(xpath ="//input[@name='proceedToRetailCheckout']")
	WebElement proceddbtn;
	
	
	public void search() {
		searchitem.sendKeys("shoe"+Keys.ENTER);
	}
	
	public void firstproduct() {
		firstshoe.click();
	}
	public void addtocartbtn(WebDriver driver) 
	{
		Set<String>ids=driver.getWindowHandles();
		System.out.println(ids);
		
		Iterator<String>link= ids.iterator();
		String PI=link.next();
		String CI=link.next();
		System.out.println(PI);
		System.out.println(CI);
		
		driver.switchTo().window(CI);
		
	
	}
	
	public void addbtn() 
	{
		
		addtocart.click();
		Assert.assertEquals(proceddbtn.isDisplayed(), true);
	}
	public void procedd() 
	{
		
	}
public Caseno_9_Addtocart (WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
	}

}

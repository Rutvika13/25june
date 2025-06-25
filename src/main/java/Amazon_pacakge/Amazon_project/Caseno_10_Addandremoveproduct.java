package Amazon_pacakge.Amazon_project;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class Caseno_10_Addandremoveproduct
{	
	@FindBy(xpath ="//select[@name='quantity']")
	WebElement addquantity;
	
	@FindBy(xpath ="//input[@title='Add to Shopping Cart']")
	WebElement addtocart;
	
	@FindBy(xpath ="//span[@id='nav-cart-count']")
	WebElement gotocart;
	
	@FindBy(xpath ="//input[@data-action='delete-active']")
	WebElement delecttocart;

	
	
	
	public void parenttochild(WebDriver driver) 
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
	
	public void addquantitybtn()
	{
		Select s1=new Select(addquantity);
		s1.selectByValue("3");
		
		
		Assert.assertEquals(addtocart.isDisplayed(), true);
		
	}
	
	public void addtocartbtn() 
	{
		addtocart.click();
	}
	
	public void gotocartbtn() 
	{
		gotocart.click();
		Assert.assertEquals(delecttocart.isDisplayed(), true);
	}
	public void delecttocartbtn() 
	{
		delecttocart.click();
	}
public Caseno_10_Addandremoveproduct (WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
	}


	
}



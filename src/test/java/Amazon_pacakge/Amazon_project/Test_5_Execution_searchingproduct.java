package Amazon_pacakge.Amazon_project;

import java.time.Duration;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Parameters("Browser")
@Listeners(TestListners1.class)
public class Test_5_Execution_searchingproduct extends Basepage
{
	

	@Test(retryAnalyzer=IRetrylogic.class)
	public void addtocart() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Homepage c1= new Homepage(driver);
		c1.login();
		c1.username();
		c1.continebtn();
		c1.passw();
		c1.finalsigning();
		
		Caseno_5_searchingproduct c2= new Caseno_5_searchingproduct(driver);
				c2.search();
				c2.firstproduct();
				
				
	}

}

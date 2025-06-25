package Amazon_pacakge.Amazon_project;


import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Parameters("Browser")
@Listeners(TestListners1.class)
public class Test_3_Invalidetails extends Basepage
{

	@Test (retryAnalyzer=IRetrylogic.class)
	public void wrongdetails() throws InterruptedException
	{
		Homepage homepage= new Homepage(driver);
	
		homepage.login();
		homepage.invalidusername();
		Thread.sleep(3000);
		homepage.continebtn();
		
		

		
	
	}
}

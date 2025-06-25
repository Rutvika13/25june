package Amazon_pacakge.Amazon_project;



import java.io.IOException;


import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(TestListners1.class)
@Parameters("Browser")
public class Test_1_Createnewuser extends Basepage
{

	@Test(retryAnalyzer=IRetrylogic.class)
	public void loginsuccesful() throws InterruptedException, IOException
	{
		Homepage h1= new Homepage(driver);
		Thread.sleep(1000);
		h1.newuserbtn();
		Thread.sleep(1000);
		h1.newusername();
		h1.continebtn();
		Thread.sleep(3000);
		h1.procedbtn();
		h1.firstnamebtn();
		Thread.sleep(3000);
		h1.pwdfirstnamebtn();
		
	
		
	}
}

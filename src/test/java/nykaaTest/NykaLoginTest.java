package nykaaTest;

import org.testng.annotations.Test;

import nykaaPage.NykaaPage;
import nykaa_utility.GenericMethods;

public class NykaLoginTest extends BasePageOfNykaa
{
	NykaaPage loginpage;
	@Test
	public void loginWithValidCredentials() throws Throwable
	{
		loginpage = new NykaaPage(GenericMethods.driver);
		loginpage.clickSignin();
		System.out.println("Arif is a goodboy");
		getScreenshot();
		
	}

}

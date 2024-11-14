package nykaaTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import nykaa_utility.GenericMethods;
import nykaa_utility.PropertyReader;
import org.apache.commons.io.FileUtils;

public class BasePageOfNykaa 
{
	GenericMethods generic;
	@BeforeMethod
	public void setUp() throws Throwable
	{
		
		generic = new GenericMethods();
		generic.openBrowser(PropertyReader.readData("Browser"));
		generic.enterUR(PropertyReader.readData("URL"));

	}
	
	public void getScreenshot() throws Throwable
	{


		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : " + projectPath);
		SimpleDateFormat date1 = new SimpleDateFormat("YYYY-MM-dd   HH-mm-SSSS ");
		 String date2 = date1.format(new Date());
		 System.out.println(date2);

		File fil = new File(projectPath+"//screenshot//"+date2+".png");
		
		TakesScreenshot screenshot = (TakesScreenshot)generic.driver;
		System.out.println("screenshot :" + screenshot);
		File sourcefile =screenshot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourcefile, fil);
		
	
		
	
		
	}

}

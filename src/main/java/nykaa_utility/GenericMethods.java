package nykaa_utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericMethods 
{
	public static WebDriver driver;
	public void openBrowser(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
	}
	public void enterUR(String url)
	{
		driver.get(url);

	}
	public WebElement findTheElement(By locator)
	{
		if(locator.equals("id"))
			driver.findElement(By.id("locator"));

		else if(locator.equals("name"))
			driver.findElement(By.name(""));

		else if(locator.equals("className"))
			driver.findElement(By.className(""));

		else if(locator.equals("tagName"))
			driver.findElement(By.tagName(""));


		else if(locator.equals("linkText"))
			driver.findElement(By.linkText(""));

		else if(locator.equals("partialLinkText"))
			driver.findElement(By.partialLinkText(""));

		else if(locator.equals("xpath"))
			driver.findElement(By.xpath(""));

		else if(locator.equals("cssSelector"))
			driver.findElement(By.cssSelector(""));
		return null;

	}

	
	public void enterData(String locatorName,String locatorValue,String data)
	{
		if(locatorName.equals("id"))
			driver.findElement(By.id(locatorValue)).sendKeys(data);

		else if(locatorName.equals("name"))
			driver.findElement(By.name(locatorValue)).sendKeys(data);

		else if(locatorName.equals("className"))
			driver.findElement(By.className(locatorValue)).sendKeys(data);

		else if(locatorName.equals("tagName"))
			driver.findElement(By.tagName(locatorValue)).sendKeys(data);


		else if(locatorName.equals("linkText"))
			driver.findElement(By.linkText(locatorValue)).sendKeys(data);

		else if(locatorName.equals("partialLinkText"))
			driver.findElement(By.partialLinkText(locatorValue)).sendKeys(data);

		else if(locatorName.equals("xpath"))
			driver.findElement(By.xpath(locatorValue)).sendKeys(data);

		else if(locatorName.equals("cssSelector"))
			driver.findElement(By.cssSelector(locatorValue)).sendKeys(data);

	}
	public void clickOnElement(String locatorName,String locatorValue)
	{

		if(locatorName.equals("id"))
			driver.findElement(By.id(locatorValue)).click();

		else if(locatorName.equals("name"))
			driver.findElement(By.name(locatorValue)).click();

		else if(locatorName.equals("className"))
			driver.findElement(By.className(locatorValue)).click();

		else if(locatorName.equals("tagName"))
			driver.findElement(By.tagName(locatorValue)).click();


		else if(locatorName.equals("linkText"))
			driver.findElement(By.linkText(locatorValue)).click();

		else if(locatorName.equals("partialLinkText"))
			driver.findElement(By.partialLinkText(locatorValue)).click();
		else if(locatorName.equals("xpath"))
			driver.findElement(By.xpath(locatorValue)).click();

		else if(locatorName.equals("cssSelector"))
			driver.findElement(By.cssSelector(locatorValue)).click();



	}
	public void selectDropDown(String methodName,String value,WebElement element)
	{
		autob
		int a=value;
		Select select = new Select(element);
		select.selectByIndex(a);

	}
	public void closeTheWindow()
	{
		driver.close();
		
	}
	public void quitTheWindow()
	{
		driver.quit();
	}


}

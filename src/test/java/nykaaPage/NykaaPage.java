package nykaaPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NykaaPage 
{
	@FindBy (xpath="//button[@class='css-1gzc5zn']") WebElement loginbutton;
	public  NykaaPage(WebDriver driver) 
	{
		PageFactory page = new PageFactory();
		page.initElements(driver, this);
	} 
	
	public void clickSignin()
	{
		loginbutton.click();
	}
	

}

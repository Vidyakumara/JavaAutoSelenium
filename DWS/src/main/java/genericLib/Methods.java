package genericLib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Methods extends BaseClass{
	public static void scrollTillWebElement(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	public static void scrollTillWebElementdown(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false);",element);
	}
	public static void scrolldown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0.500);, ");
	}


	public void selectDropDownByValue(WebElement dropdown, String value)
	{
		Select s= new Select(dropdown);
		s.selectByValue(value);
	}
	public void selectDropDownByVisibleText(WebElement dropdown,String visibleText)
	{
		Select s=new Select(dropdown);
		s.selectByVisibleText(visibleText);
	}
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
public void dissmissAlert(WebDriver driver)
{
	driver.switchTo().alert().accept();
	
}
public void clickOnElement(WebElement targetElement)
{
	Actions actions = new Actions(driver);
	actions.click(targetElement).perform();
}
public void doubleClickOnElement(WebElement targetElement)
{
	Actions actions = new Actions(driver);
	actions.click(targetElement).perform();
	
}
	public void rightClickOnElement(WebElement targetElement)
	{
		Actions actions = new Actions(driver);
		actions.click(targetElement).perform();
	}
}

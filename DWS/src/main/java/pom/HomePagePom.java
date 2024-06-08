package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePom {
	public HomePagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id ="small-searchterms")
	WebElement searchbox;
	
	@FindBy(partialLinkText ="Books")
	WebElement booklink;
	
	@FindBy(linkText = "Log in")
	WebElement login;

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getBooklink() {
		return booklink;
	}

	public WebElement getLogin() {
		return login;
	}
	

}

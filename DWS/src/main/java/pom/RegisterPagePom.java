package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPagePom {
	public RegisterPagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="gender-male")
	private WebElement maleRadiobutton;

	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;
	
	@FindBy(id = "FirstName")
	private WebElement firstnametextfield;
	
	@FindBy(id="LastName")
	private WebElement lastnametextfield;

	public WebElement getMaleRadiobutton() {
		return maleRadiobutton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstnametextfield() {
		return firstnametextfield;
	}

	public WebElement getLastnametextfield() {
		return lastnametextfield;
	}
	
}

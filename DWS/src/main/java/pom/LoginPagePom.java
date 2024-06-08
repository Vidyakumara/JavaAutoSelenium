package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePom {
	public LoginPagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public Object getLoginLink() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getEmailTextField() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPasswordTextField() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getLoginButton() {
		// TODO Auto-generated method stub
		return null;
	}

}

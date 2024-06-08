package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BookPagePom {
	public BookPagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}

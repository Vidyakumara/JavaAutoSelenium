package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import genericLib.Methods;

public class Script3 extends BaseClass{
	@Test
	public void scrollDown() throws InterruptedException {
		Thread.sleep(4000);
		Methods ms=new Methods();
		ms.scrolldown(driver);
		Thread.sleep(4000);
		
		
	}

}

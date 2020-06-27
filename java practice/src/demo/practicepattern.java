package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class practicepattern {

	
	
@Test
public void display()
{
		
		
		
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohan raji\\Desktop\\geckodriver.exe");
FirefoxOptions options=new FirefoxOptions();
options.setCapability("marionette", false);
WebDriver driver=new FirefoxDriver();
driver.get("http://facebook.com");
	}

}

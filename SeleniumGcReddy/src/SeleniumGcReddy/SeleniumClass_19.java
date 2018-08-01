
//Handling Web Elements part1
package SeleniumGcReddy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumClass_19 {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");

WebDriver driver= new FirefoxDriver();
//Browser Methods
/*driver.get("https://www.google.com/");

String pageTittle=driver.getTitle();
System.out.println(pageTittle);

String currentUrl=driver.getCurrentUrl();
System.out.println(currentUrl);

String pageSource=driver.getPageSource();
System.out.println(pageSource);

String WindowHandle=driver.getWindowHandle();
System.out.println(WindowHandle);*/

//Navigation Methods
driver.get("https://www.google.com/");
driver.navigate().to("https://in.yahoo.com/");
System.out.println(driver.getCurrentUrl());

driver.navigate().back();
System.out.println(driver.getCurrentUrl());
driver.navigate().forward();
System.out.println(driver.getCurrentUrl());
driver.manage().window().maximize();
driver.close();

	}

}

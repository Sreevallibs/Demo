package SeleniumGcReddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Part_3_Test_Case_One extends TestCase_Three_User_Defined_Methods{

	public static void main(String[] args) {
		Part_3_Test_Case_One obj=new Part_3_Test_Case_One();
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		obj.Launch_Browser();
		obj.Skycab_Login();
		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(By.linkText("Call Center"));
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id='178']/a")).click();
		String str=driver.getCurrentUrl();
		if(str.contains("http://182.74.80.235/TDSSkycabs/CallCenter/AnswerCallCorporate.aspx?"))
		{
			System.out.println("Passed");
		}
		else
			System.out.println("Failed");
		
	}

}

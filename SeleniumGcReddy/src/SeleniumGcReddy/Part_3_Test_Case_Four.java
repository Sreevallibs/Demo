package SeleniumGcReddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Part_3_Test_Case_Four extends TestCase_Three_User_Defined_Methods {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		Part_3_Test_Case_Four obj4=new Part_3_Test_Case_Four();
		obj4.Launch_Browser();
		obj4.Skycab_Login();
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
obj4.Close_Browser();
obj4.Launch_Browser();
obj4.Skycab_Login();
String str1=driver.getCurrentUrl();
if(str1.equals("http://182.74.80.235/TDSSkycabs/Homepage.aspx"))
{
	System.out.println("Login Successful");
}
else
{
	System.out.println("Login Failed");
}
obj4.Close_Browser();
obj4.Launch_Browser();
obj4.Skycab_Login("skycabsadmin", "Pwd");
String str2=driver.findElement(By.xpath("//*[@id='warning']/div")).getText();
if(str2.equals("No match for LoginId and/or Password."))
{
	System.out.println("Invalid inputs are handling " + "Passed");
}
else
	System.out.println("Invalid inputs are handling " + "failed");
obj4.Close_Browser();
	}

}

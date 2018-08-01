package SeleniumGcReddy;

import org.openqa.selenium.By;

public class Part_3_Test_Case_Three extends Part_3_Test_Case_One{

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		Part_3_Test_Case_Three obj3=new Part_3_Test_Case_Three();
		obj3.Launch_Browser();
		obj3.Skycab_Login("skycabsadmin", "Pwd");
		String str=driver.findElement(By.xpath("//*[@id='warning']/div")).getText();
		if(str.equals("No match for LoginId and/or Password."))
		{
			System.out.println("Invalid inputs are handling " + "Passed");
		}
		else
			System.out.println("Invalid inputs are handling " + "failed");

	}

}

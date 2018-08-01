package SeleniumGcReddy;

public class Part_3_Test_Case_Two extends Part_3_Test_Case_One{

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		Part_3_Test_Case_Two obj1=new Part_3_Test_Case_Two();
		obj1.Launch_Browser();
		obj1.Skycab_Login();
		String str=driver.getCurrentUrl();
		if(str.equals("http://182.74.80.235/TDSSkycabs/Homepage.aspx"))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login Failed");
		}
obj1.Close_Browser();
	}

}

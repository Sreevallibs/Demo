package SeleniumGcReddy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EditBoxOperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");

		WebDriver driver= new FirefoxDriver();
	
		//driver.get("http://182.74.80.235/TDSSkycabs/");
		//Finding element by ID locator
		//driver.findElement(By.id("txtUserId")).sendKeys("skycabsadmin");
		//Finding element by ID locator
		//driver.findElement(By.name("txtUserId")).sendKeys("skycabsadmin");
		//Finding element by cssSelector locator
		//driver.findElement(By.cssSelector("txtUserId")).sendKeys("skycabsadmin");
		//Finding element by xpath locator
		//driver.findElement(By.xpath("//*[@id='txtUserId']")).sendKeys("skycabsadmin");
		//Clear the value 
		//driver.findElement(By.xpath("//*[@id='txtUserId']")).clear();
		//Return Type of the Object
		//WebElement Ele= driver.findElement(By.xpath("//*[@id='txtUserId']"));
		//Ele.sendKeys("skycabsadmin");
		//Ele.getAttribute("type");
		//Return the Value
		//Thread.sleep(2000);
		//String text=driver.findElement(By.cssSelector("#txtUserId")).getAttribute("value");
		//System.out.println(text);
		//Return displayed status
		//System.out.println(Ele.isDisplayed());
		//Return Enabled Status
		//System.out.println(Ele.isEnabled());
		//Capture Text Area
		//System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/h1")).getText());
		//driver.findElement(By.id("btnLogin")).click();
		//System.out.println(driver.findElement(By.cssSelector(".warning")).getText());
		//Window Pop Up
		/*driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.id("login1")).sendKeys("testing");*/
		//Button Functionality
		/*driver.get("https://accounts.google.com");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span")).isEnabled());
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span")).isDisplayed());
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span")).getAttribute("type"));
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span")).getAttribute("name"));
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span")).getAttribute("value"));
		
	System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span")).getText());*/
		//Handle Image
		/*driver.get("https://www.google.com/");
		System.out.println(driver.findElement(By.cssSelector("#hplogo > a:nth-child(1) > img:nth-child(1)")).getAttribute("title"));
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
		driver.navigate().to("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/a[1]/img")).click();*/
		//Link 
		/*driver.get("https://www.google.com/");
		System.out.println(driver.findElement(By.className("gb_P")).isDisplayed());
		System.out.println(driver.findElement(By.className("gb_P")).isEnabled());
		System.out.println(driver.findElement(By.className("gb_P")).getText());
		driver.findElement(By.className("gb_P")).click();*/
		//Radio Button
		//driver.get("http://www.gcrit.com/build3/create_account.php");
		//System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).isSelected());
		//System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).isEnabled());
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).click();
		//System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).isEnabled());
		//System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).getAttribute("type"));
		//System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).isDisplayed());
		//driver.findElement(By.name("firstname")).sendKeys("Testing");
		//System.out.println(driver.findElement(By.className("fieldKey")).getText());
		//System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div/div[2]/table/tbody/tr[2]/td[1]")).getText());
		//Dropdown Box
		driver.get("http://www.gcrit.com/build3/create_account.php");
		Select dropDown=new Select(driver.findElement(By.name("country")));
		//dropDown.selectByIndex(1);
		//dropDown.selectByIndex(1);
		dropDown.selectByVisibleText("India");
		
	}
	

}



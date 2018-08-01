package SeleniumGcReddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover_Operation {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.carmax.com/");
		Actions builder=new Actions(driver);
		WebElement ele=driver.findElement(By.linkText("Cars For Sale"));
		builder.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id='buysMenu']/div/ul/li[2]/a")).click();
		

	}

}

package techChallenge;

import java.util.*;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class QaChallenge {
	public WebDriver driver;  	
	String[] albumNames = {"Taylor Swift","Fearless","Speak Now", "Red","Reputation"};

@Test
public void testing() {
	System.setProperty("webdriver.chrome.driver", "c:\\www\\chromedriver_windows\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.wikipedia.org/");
	driver.findElement(By.id("searchInput")).sendKeys("Taylor Swift");
	driver.findElement(By.xpath("//*[@id='search-form']/fieldset/button")).click();
	Assert.assertTrue(driver.getTitle().contains("Taylor Swift"));
	
	//looping and comparing by xpath the values given
	for (int x=0; x<albumNames.length; x++) {
		String albumXpath = "//tr[./th[text()='Studio albums']]/td//li//a[text()='<albumTitles>']";
		albumXpath = albumXpath.replace("<albumTitles>", albumNames[x]);
		driver.findElement(By.xpath(albumXpath));
	}
/*
 * 
 * Mouse Over validation
	WebElement mouseOver = driver.findElement(By.xpath("//tr[./th[text()='Studio albums']]/td//li//a[text()='Reputation']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(mouseOver).moveToElement(driver.findElement(By.xpath("//div[@role='tooltip' and contains(@class,'mwe-popups')]//p//i//b[text()='Reputation']"))).build().perform();;
	
*/	
	
}


}

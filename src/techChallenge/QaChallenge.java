package techChallenge;

import java.util.*;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class QaChallenge {
	public WebDriver driver;  	
	//public String wikiURL;
	
	//WebDriver driver = new ChromeDriver();

@Before
public void setup() {
	System.setProperty("webdriver.chrome.driver", "browsers//chromedriver");
	driver = new ChromeDriver();
	//wikiURL = "https://www.google.com";
	
	}

@Test
public void testing() {
	driver.get("https://www.google.com");
	//Assert.assertTrue(driver.getTitle().contains("Google"));
}

@After
public void teardown() {
	driver.close();
}

}

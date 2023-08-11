package basicsSeleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();	
	
	driver.get("https://www.globalsqa.com/samplepagetest/");
	System.out.println("You are on :"+driver.getTitle()+"Page");
	
	driver.close();

	}

}

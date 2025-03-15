package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
	    
	    // Open the browser
	    driver.get("https://training-support.net");

	    // Perform testing and assertions
	   

	    // Close the browser
	    // Feel free to comment out the line below
	    // so it doesn't close too quickly
	    driver.quit();
	
			
	}

}

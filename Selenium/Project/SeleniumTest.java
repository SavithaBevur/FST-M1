
package examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		//Initialization of theWebdriver
		
		WebDriver driver=new FirefoxDriver();
		
		//open the browser usingurl
		
		driver.get("https://training-support.net/");
		
		//interact with elements on the page
		System.out.println("Browser opened");
		
		//close the browser
     driver.quit();
	}

}

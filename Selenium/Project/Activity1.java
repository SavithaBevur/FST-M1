package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
    // Declare the WebDriver object
    WebDriver driver;
    
    @BeforeClass
    public void beforeMethod() {
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms/");
    }

    @Test
    
    public void pageTitleTest()
    {
    	String title = driver.getTitle();
    	System.out.println("Title is: " + title);
    	Assert.assertEquals("Alchemy LMS – An LMS Application", title); 	
    }
    
    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}
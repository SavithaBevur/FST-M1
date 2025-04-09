package projects;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity3 {
    // Declare the WebDriver object
    WebDriver driver;
    
    @BeforeClass
    public void beforeMethod() {
        driver = new FirefoxDriver();
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    
    @Test
    public void Heading() {
        // Check the title of the page
        String title = driver.getTitle();
            
        //Print the title of the page
        System.out.println("Page title is: " + title);
         
            //Assertion for page title
        Assert.assertEquals("Alchemy LMS – An LMS Application", title);
                   
        //Find the Heading on the page 
      String heading= driver.findElement(By.tagName("h3")).getText();
      
                    
        //Print Heading
        System.out.println(heading);
        
      Assert.assertEquals(heading, "Actionable Training");
    }
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
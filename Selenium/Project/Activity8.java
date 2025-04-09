package projects;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity8 {
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
                   
        //Navigating to My Account page 
      driver.findElement(By.xpath("//a[text()='Contact']")).click();
      
      String title2 = driver.getTitle();
                     
       //Print second title
        System.out.println(title2);
        
        //Verify the second title 
      Assert.assertEquals(title2, "Contact – Alchemy LMS");
      
      //To fill and submit the form
      driver.findElement(By.id("wpforms-8-field_0")).sendKeys("ABCDEFGH"); 
      driver.findElement(By.id("wpforms-8-field_1")).sendKeys("ABCDEFGH@Gmail.com");
      driver.findElement(By.id("wpforms-8-field_3")).sendKeys("FeedBack");
      driver.findElement(By.id("wpforms-8-field_2")).sendKeys("Gooing well");
      driver.findElement(By.id("wpforms-submit-8")).click();
      
      //To read and print message
       
     String msg= driver.findElement(By.xpath("//*[contains(text(), 'Thanks for contacting us! We will be in touch with you shortly')]")).getText();
     System.out.println(msg);
          
    }

@AfterClass
  public void afterClass() {
	 driver.quit();
  }

}
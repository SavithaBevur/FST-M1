package projects;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity6 {
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
      driver.findElement(By.xpath("//a[text()='My Account']")).click();
      
      String title2 = driver.getTitle();
                     
       //Print Heading
        System.out.println(title2);
        
        //Verify the second title 
      Assert.assertEquals(title2, "My Account – Alchemy LMS");
      
      //click on login button
      driver.findElement(By.xpath("//a[text()='Login']")).click();
      
      //To enter user name and password
      driver.findElement(By.id("user_login")).sendKeys("");
      driver.findElement(By.id("user_pass")).sendKeys("");
      driver.findElement(By.id("wp-submit")).click();
      
     //to get the title
      String title3=driver.getTitle();
      
      //Verify the 3rd title 
      Assert.assertEquals(title3, "");
      
    }
  @AfterClass
  public void afterClass() {
	 driver.quit();
  }

}
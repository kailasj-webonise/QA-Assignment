package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsttestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
        //Creating a driver object referencing WebDriver interface
        WebDriver driver;
        
        //Setting the webdriver.chrome.driver property to its executable's location
        System.setProperty("webdriver.chrome.driver", "/home/webonise/QA/chromedriver");
	
        //Instantiating driver object
        driver = new ChromeDriver();
        
        //Using get() method to open a webpage
        driver.get("https://web-stg.gofaceoff.com/");
        
    
        WebElement signup=driver.findElement(By.xpath("//a[@href='/signup']"));
        signup.click();
        
        WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("kaile@gmail.com");
        
        WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
        username.sendKeys("Kailr99");
        
        
        WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
        pass.sendKeys("kailas07rr");
        
         WebElement firstname=driver.findElement(By.xpath("//input[@name='first_name']"));
        firstname.sendKeys("kails");
        
        WebElement lastname=driver.findElement(By.xpath("//input[@name='last_name']"));
        lastname.sendKeys("jofi");
        
        
        WebElement date=driver.findElement(By.xpath("//input[@name='dateOfBirth']"));
        date.sendKeys("01/02/1994");
        
        WebElement state=driver.findElement(By.xpath("//select[@name='state']"));
        state.sendKeys("LA");
        
       WebElement code=driver.findElement(By.xpath("//input[@name='referralCode']"));
        code.sendKeys("ian");
        
        
        WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();
        
        WebElement skip=driver.findElement(By.xpath("//div/a[@href='accept-challenge']"));
        skip.click();
        
        WebElement down=driver.findElement(By.xpath("//div/a[@href=\"accept-challenge\"]"));
        down.click();
      
        WebElement logout=driver.findElement(By.xpath("//a[href='javascript:void(0)']"));
        logout.click();
        
        //Closing the browser  //a[href='javascript:void(0)'] //span[@class="dropDownIcon"]
        
        
       // driver.quit();
 

	}

}

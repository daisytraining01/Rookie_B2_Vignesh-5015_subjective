package SubStepDefinitions;

import org.openqa.selenium.By;
import java.io.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.junit.Assert.*;

import io.cucumber.java.en.*;
 
public class subjregis {
	 WebDriver driver = null;
	  
	 @Given("^setting up for open a browser$")
	 public void subjSetup()
	 {
	  
    String projectPath=System.getProperty("user.dir");          
    System.out.println("Project path is: " +projectPath); 
    
    System.setProperty("webdriver.chrome.driver",projectPath+"C:\\Users\\training\\eclipse-workspace\\GuruTest\\src\\test\\resources\\SubDrivers\\chromedriver.exe");          
    ChromeDriver driver = new ChromeDriver();            
    driver.manage().window().maximize();     
    
}
	   @And("^Navigate to the site$")
	   public void opensite()throws Throwable
	   {
			 driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		     Thread.sleep(5000);
	   }
	    @When("^Enter the details<Fields> <values>for registration$")
	    public void subdata()throws Throwable
	    {
	    	 driver.findElement(By.id("firstname")).sendKeys("Arnold");
		     Thread.sleep(5000);
		        
		     driver.findElement(By.id("lastname")).sendKeys("B");
		     Thread.sleep(5000);
		     
		     driver.findElement(By.id("city")).sendKeys("sydney");
		     Thread.sleep(5000);
		    
				Select selelist = new Select(driver.findElement(By.name("country")));
				selelist.selectByVisibleText("Australia");
				Thread.sleep(5000);
	    }
			@And("^verify the value$")
			public void test()
			{	
					driver.findElement(By.name(“country”));
					String ExpectedText = “Australia”;
					Assert.assertEquals(ExpecptedText, .isSelected());
					
					System.out.println(“Radio button is selected – Assert passed”);
	    }
	    @Then("^get the message for successful registration$")
	    public void subclose()throws Throwable
	    {
	    	if(driver.getCurrentUrl().equalsIgnoreCase("http://demo.guru99.com/test/newtours/register_sucess.php"))
	        {

	            TakesScreenshot scrShot =((TakesScreenshot)driver);

	                    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	                    File DestFile=new File("D:\\screenshot1.png");
	                
	    	            Thread.sleep(3000);
	        }
	        else
	        {
	        	TakesScreenshot scrShot =((TakesScreenshot)driver);

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

                File DestFile=new File("D:\\screenshot1.png");
            
	            Thread.sleep(3000);
	        }
	        driver.close();
	    }

}

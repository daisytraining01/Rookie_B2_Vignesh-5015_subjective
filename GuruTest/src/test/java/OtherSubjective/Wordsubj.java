package OtherSubjective;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
public class Wordsubj {
	public static void main(String[] args){
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\eclipse-workspace\\GuruTest\\src\\test\\resources\\SubDrivers\\chromedriver.exe");     
		
	  ChromeDriver driver = new ChromeDriver();
	
       driver.get("https://wordpress.com/?aff=58022&cid=8348279");

       driver.manage().window().maximize();
 
      List<WebElement> ALinks = driver.findElements(By.data-dropdown-trigger("Products"));
 
      for(WebElement link:ALinks){
      System.out.println(link.getText() + " - " + link.getAttribute("href"));
      }
      List<WebElement> BLinks = driver.findElements(By.data-dropdown-trigger("Features"));
      
      for(WebElement link:BLinks){
      System.out.println(link.getText() + " - " + link.getAttribute("href"));
      }
      List<WebElement> CLinks = driver.findElements(By.data-dropdown-trigger("Resources"));
      
      for(WebElement link:CLinks){
      System.out.println(link.getText() + " - " + link.getAttribute("href"));
      }

     driver.quit();
 } 
}

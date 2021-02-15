package OtherSubjective;

import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubjWebtables {
	  WebDriver driver = null;
	 public static void main(String[] args) throws ParseException {
	     
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\eclipse-workspace\\GuruTest\\src\\test\\resources\\SubDrivers\\chromedriver.exe");     
		
		  ChromeDriver driver = new ChromeDriver();
		
	        driver.get("https://cosmocode.io/automation-practice-webtable/");         
	     
	        List  col = driver.findElements(By.xpath(".//*[@id=\"countries\"]/table/thead/tr[9]/th[2]"));
	        System.out.println("No of cols are : " +col.size()); 
	      
	        List  rows = driver.findElements(By.xpath(".//*[@id='countries']/table/tbody/tr[9]/td[2]")); 
	        System.out.println("No of rows are : " + rows.size());
	        
	        String Capital = driver.findElements(By.xpath(".//*[@id=\"countries\"]/table/thead/tr[9]/th[3]").getText());
	         System.out.println(Capital);
	         
	         String Country = driver.findElements(By.xpath(".//*[@id=\"countries\"]/table/thead/tr[17]/th[2]").getText());
	        if(Country.contains("Belarus"))
	        {
	        	driver.findElements(By.xpath(".//*[@id='countries']/table/tbody/tr[17]/td[1]").click());
	        	
	        }
	        driver.close();
	    }

}

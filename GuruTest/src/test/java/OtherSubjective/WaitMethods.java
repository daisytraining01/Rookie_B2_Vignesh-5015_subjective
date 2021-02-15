package OtherSubjective;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
public class WaitMethods {

	public static void main(String[] args)
	{
		WebDriver driver;
	System.setProperty ("webdriver.chrome.driver",".\\chromedriver.exe" );
	driver = new ChromeDriver(); 
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	String eTitle = "Demo Guru99 Page";
	String aTitle = "" ;
	
	driver.get("http://demo.guru99.com/test/guru99home/" );

	driver.manage().window().maximize() ;

	aTitle = driver.getTitle();
	
	if (aTitle.equals(eTitle))
	{
	System.out.println( "Test Passed") ;
	}
	else {
	System.out.println( "Test Failed" );
	}

	driver.close();
}
}

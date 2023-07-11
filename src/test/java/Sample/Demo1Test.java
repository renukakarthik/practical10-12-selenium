package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo1Test {
	WebDriver driver=null;
//pullback
@Test
public void d1Test() throws Throwable {
	
	System.out.println("hi");
		  WebDriver driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(1000);
		 String BROWSER = System.getProperty("browser");
		
        // driver.get("https://demo.actitime.com/login.do");

		 //driver.manage().window().maximize();
			/*String BROWSER = System.getProperty("browser");
			String URL = System.getProperty("url");
			
			if(BROWSER.equalsIgnoreCase("chrome")) 
			{
				driver=new ChromeDriver();
			}else if(BROWSER.equalsIgnoreCase("firefox")) 
			{
			  	driver=new FirefoxDriver();
			}else {
				driver=new ChromeDriver();
				}
			driver.get(URL);*/
				
			
	}}
	

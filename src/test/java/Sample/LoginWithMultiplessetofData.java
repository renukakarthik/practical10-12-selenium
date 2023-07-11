package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithMultiplessetofData {
	
	
	@Test(dataProvider="credentials")
	public void verifyLoginCredentials(String scenario,String username,String password) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("//a[@id='loginButton']")).click();
		if(scenario.equals("bothcorrect")) {
			WebElement account = driver.findElement(By.xpath("//a[@class='userProfileLink username ']"));
			Assert.assertTrue(account.isDisplayed(),message"Login Not success");
		}		
		
		driver.close();
		}
	@DataProvider(name="credentials")
	public Object[][] getData(){
		return new Object[][] {
			{"bothcorrect","admin","manager"},
			{"bothwrong","ad","admin"},
			{"correctusername","admin","ad01"},
			{"correctpassword","adm","manager"}
		};
		
	}

}

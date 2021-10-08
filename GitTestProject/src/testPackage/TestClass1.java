package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {

	public static void main(String[] args) {
		
		//setting property of Chrome Browser and passing path of chrome driver
				System.setProperty("webdriver.chrome.driver",  "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				
				//creating the reference of WebDriver Interface
				WebDriver driver = new ChromeDriver();
				
				//manage method to maximize the window
				driver.manage().window().maximize();
				
				//open URL using get me thod 
				driver.get("https://www.facebook.com");
				//driver.navigate().to("https://www.facebook.com");
				
				//Close method
				driver.close();
				
				//quit method
				driver.quit();
	}

}

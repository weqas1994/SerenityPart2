package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {


		public static WebDriver driver;
		
		public static void tearDown(){
			driver.quit();
			
			
		}
		public static void setUp() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uncleared\\Desktop\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();	
			driver.get("http://localhost:4200/");
			

		}
	
	
}

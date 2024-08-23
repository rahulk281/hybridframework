package base;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
	public static WebDriver driver;
   
	public void launchWeb()
	{
	
	    driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();   
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
	}
	
	

}

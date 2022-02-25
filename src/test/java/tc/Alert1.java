package tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert1 {

	
	    private static WebDriver driver = null;
	    public static void main(String[] args) throws InterruptedException  {
			System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\TG1688\\\\Downloads\\\\geckodriver-v0.30.0-win64\\\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.browserstack.com/users/sign_up");
            
			
			
	    }
	    
	        	}


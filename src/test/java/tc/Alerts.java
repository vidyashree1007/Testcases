package tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\TG1688\\\\Downloads\\\\geckodriver-v0.30.0-win64\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	}

}

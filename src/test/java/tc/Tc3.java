package tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tc3 {
	public static void main(String[] args) {
		companyDropdown();
		// getinTouchColor();
		lifeatTruglobal();
		serviceDropdown();
	}

	static WebDriver driver;

	public static void companyDropdown() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TG1688\\Downloads\\chromedriver_win32.\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.truglobal.com");

		Actions act = new Actions(driver);
		WebElement company = driver.findElement(By.xpath("//*[@id=\"mega-menu-item-4235\"]/a"));
		act.moveToElement(company).build().perform();
	}

	/*
	 * public static void getinTouchColor() { WebElement d =
	 * driver.findElement(By.id("evt-buy-btn")); String backColor =
	 * d.getCssValue("color"); System.out.println(backColor);
	 * 
	 * }
	 */

	public static void lifeatTruglobal() {
		driver.findElement(By.xpath("//a[text()=('Life at TRUGlobal'])[1]")).click();
	}

	public static void serviceDropdown() {
		Actions act = new Actions(driver);
		WebElement services = driver.findElement(By.xpath("//a[text()='Services' and @aria-haspopup='true']"));
		act.moveToElement(services).build().perform();
		String expectedtext = "Cloud Enablement";
		WebElement cloud = driver.findElement(By.xpath("(//a[text()='Cloud Enablement'])[1]"));
	

		String actualtext = cloud.getText();
		if (expectedtext.equals(actualtext)) {
			System.out.println("This is Cloud Enablement page");
		}
		/*
		 * WebElement cloudconsulting = driver.findElement( By.xpath(
		 * "/html/body/div[1]/div[1]/div[3]/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[1]/div"
		 * )); cloudconsulting.sendKeys(Keys.ARROW_RIGHT);
		 */
		
		driver.navigate().back();
		driver.navigate().refresh();
	}

}




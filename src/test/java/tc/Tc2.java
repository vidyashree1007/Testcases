package tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc2 {

		public static void main(String[] args) {

			Insights();
			Home();
			Search();
			getinTouch();
			enquiry();

		}

		static WebDriver driver;

		public static void Insights() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\TG1688\\Downloads\\chromedriver_win32.\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("https://www.truglobal.com");
			driver.findElement(By.id("mega-menu-item-4230")).click();
			System.out.println("Clicked on Insights");

		}

		public static void Home() {
			String expected = "Home";
			WebElement home = driver.findElement(By.xpath("(//a[text()='Home'])[1]"));

			String actual = home.getText();
			if (expected.equals(actual)) {
				System.out.println("Home page is displayed");
			} else {
				System.out.println("Home page not displayed");
			}
		}

		public static void Search() {
			driver.findElement(By.xpath("//span[@class='sForm']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Search …']")).sendKeys("EDucaTion");
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			System.out.println(driver.findElement(By.xpath("//h1[@class='page-title']")).getText());
		}

		public static void getinTouch() {
			driver.findElement(By.id("evt-buy-btn")).click();
			driver.findElement(By.xpath("//a[text()='WRITE US AN ENQUIRY']")).click();
		}

		public static void enquiry() {
			try {
				

			WebElement name = driver.findElement(By.id("sow-contact-form-field-your-name-2224046665fa95c4946205507041158"));
			name.sendKeys("Trugloball");
			name.sendKeys(Keys.BACK_SPACE);
			name.sendKeys(Keys.TAB);
			name.sendKeys(Keys.CONTROL + "A");
			name.sendKeys(Keys.CONTROL + "C");
			WebElement email = driver.findElement(By.xpath("//input[@name='your-email-2224046665fa95c4946205507041158']"));
			email.sendKeys(Keys.CONTROL + "V");
			driver.navigate().back();
			}
			catch (Exception e) {
				System.out.println("Exception Handled...");
			}

		}

	}


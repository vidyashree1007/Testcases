package tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC1 {
	static WebDriver driver;

	public static void servicesDropdown() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TG1688\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.truglobal.com");

		Actions act = new Actions(driver);
		WebElement services = driver.findElement(By.xpath("//a[text()='Services' and @aria-haspopup='true']"));
		act.moveToElement(services).build().perform();

	}

	public static void roboticprocessAutomation() {
		WebElement robotic = driver.findElement(By.xpath(
				"//a[text()='Robotic Process Automation']"));
		robotic.click();
		String expected = "Reduce Cost of Quality. Test Robotic Process Automation.";
		WebElement ref = driver
				.findElement(By.xpath("//h3[text()='Reduce Cost of Quality. Test Robotic Process Automation.']"));
		String actual = ref.getText();
		if (expected.equals(actual)) {
			System.out.println("We are in robotic page");
		} else {
			System.out.println("nooooooo");
		}

	}

	public static void featureContent() {

		System.out.println("this is feature content");
		driver.findElement(By.xpath("//img[@alt='3 Point methodology for Successful IoT implementation']")).click();
		try {
			WebElement a = driver.findElement(By.xpath("//textarea[@name='comment']"));
			a.sendKeys("Text area........");
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			WebElement b = driver.findElement(By.id("author"));
			b.sendKeys("Author");
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			WebElement c = driver.findElement(By.id("email"));
			c.sendKeys("tg@gmail.com");
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			WebElement d = driver.findElement(By.id("url"));
			d.sendKeys("tg.com");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("all the values are successfully passed");
		driver.findElement(By.id("wp-comment-cookies-consent")).click();
		driver.findElement(By.id("submit")).click();
		String errormsg = driver.findElement(By.id("error-page")).getText();
		System.out.println("errormsg is : " + " " + errormsg);

	}

	public static void main(String[] args) {
		servicesDropdown();
		roboticprocessAutomation();
		featureContent();
	}
}


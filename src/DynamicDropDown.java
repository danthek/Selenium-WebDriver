import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abraham\\Documents\\Danthek\\Automated QA Tools\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// run in maximize mode
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise//");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); // wrapping the Xpath help us to locate the
																		// second equal locator that is the on we need
		Thread.sleep(3000);
		driver.quit();

	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {

// Chrome launch
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abraham\\Documents\\Danthek\\Automated QA Tools\\Browser Drivers\\chromedriver.exe"); // sets the chrome driver
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com//");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl()); // gets URL

		driver.close();

// Edge Launch //////////////

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Abraham\\Documents\\Danthek\\Automated QA Tools\\Browser Drivers\\msedgedriver.exe");

		WebDriver driver1 = new EdgeDriver();

		driver1.get("https://rahulshettyacademy.com//");

		System.out.println(driver1.getTitle());

		System.out.println(driver1.getCurrentUrl()); // gets URL

		driver1.close();

// Firefox Launch

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Abraham\\Documents\\Danthek\\Automated QA Tools\\Browser Drivers\\geckodriver.exe");

		WebDriver driver2 = new FirefoxDriver();

		driver2.get("https://rahulshettyacademy.com//");

		System.out.println(driver2.getTitle());

		System.out.println(driver2.getCurrentUrl()); // gets URL
		// String p = driver3.getPageSource(); //gets page source
		// System.out.println("Page Source is : " + p);

		driver2.close();

	}

}

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abraham\\Documents\\Danthek\\Automated QA Tools\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("Login buttons text: "
				+ driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button")).getText()); // xpath
																												// parent
																												// to
																												// child
																												// to
																												// siblings
		System.out.println("Home, Practice, Login & SignUp buttons text: "
				+ driver.findElement(By.xpath("//header/div/button[1]/parent::div")).getText()); // xpath chidl to
																									// parents
		System.out.println("Buttons and ad text: "
				+ driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header")).getText()); // xpath
																												// chidl
																												// to
																												// parents
																												// to
																												// more
																												// parents
		System.out.println("Ad link's text (there's none): "
				+ driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a")).getText()); // xpath
																													// chidl
																													// to
																													// parents
																													// to
																													// more
																													// parents
																													// and
																													// a
																													// child
																													// of
																													// the
																													// last
																													// selected
																													// parent
		driver.close();
	}
}

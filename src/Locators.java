import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abraham\\Documents\\Danthek\\Automated QA Tools\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Implicit wait timeout for 7 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));// wait for something to shoe... It is usually used when you are sure the element may be visible in a certain time, 	It is applicable to only a certain element which is specific to a certain condition.
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); // its like  visit()
		driver.findElement(By.id("inputUsername")).sendKeys("Abraham"); //  By Id findElement is like waitforSelector
		driver.findElement(By.name("inputPassword")).sendKeys("mypassword");// sendKeys is like puppeteer's "type" 
		driver.findElement(By.className("signInBtn")).click(); // if the class is like this :"submit signInBtn ", just use the last name of the class.
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());  //css with tag.class extracts the text from the DOM element
		driver.findElement(By.linkText("Forgot your password?")).click(); //link text selector
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Aby"); //Xpath
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("aby@nomail.com");// CSS selector
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();// Another form of XPATH selector using [index] and clear the input
		driver.findElement(By.cssSelector("input[type=\"text\"]:nth-child(3)")).sendKeys("danthek@nomail.com");// CSS selector with childs , java automatically puts the \\ around text.
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("981561561415");// XPath finding with parent to child traverse
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); // css selector with .class 
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); // Css selector with parent  to child traverse technique
		driver.findElement(By.className("go-to-login-btn")).click(); 
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Hideo"); // css selector with #id
		driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys("newPassword"); // css selector with Regular Expressions
		try {
			Thread.sleep(1000); // wait for something to be stable for the next actions
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("chkboxOne")).click();  // remember to not put the #
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		try {
			Thread.sleep(7000); // wait for something to be stable for the next actions
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.close();
	}

}
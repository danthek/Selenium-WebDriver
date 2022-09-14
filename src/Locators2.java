import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) {
		String name =  "rahul";
		Locators2 methods= new Locators2();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abraham\\Documents\\Danthek\\Automated QA Tools\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		///////////////// SIGN IN WITH CORRECT CREDS ///////////////////
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// wait for something to shoe... It is usually used when you are sure the element may be visible in a certain time, 	It is applicable to only a certain element which is specific to a certain condition.
		String dynamicPassword = methods.getPass(driver); // if the methods is declared as static then we wouldn't need the "methods."
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); // its like  visit()
		driver.findElement(By.id("inputUsername")).sendKeys(name); //  By Id findElement is like waitforSelector
		driver.findElement(By.name("inputPassword")).sendKeys(dynamicPassword);// sendKeys is like puppeteer's "type" 
		driver.findElement(By.className("signInBtn")).click(); // if the class is like this :"submit signInBtn ", just use the last name of the class.
		try {
			Thread.sleep(1000); // wait for something to be stable for the next actions
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.findElement(By.xpath("//div/p")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div/p")).getText(), "You are successfully logged in.");
		System.out.println("The name is: " + name);
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+ "," );
		String msg = "Hello World";
		Assert.assertEquals(msg, "Hello World");
		try {
			Thread.sleep(3000); // wait for something to be stable for the next actions
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	
	public String getPass(WebDriver driver){
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
			Thread.sleep(3000); // wait for something to be stable for the next actions
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); // css selector with .class
		try {
			Thread.sleep(3000); // wait for something to be stable for the next actions
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//////////////// extract the tempporary password by splitting the text /////////////////
		//Please use temporary password 'rahulshettyacademy' to Login.
		String passText = (driver.findElement(By.cssSelector("p.infoMsg")).getText());
		String[] passTextSplit = passText.split("'");
		//[0] - Please use temporary password
		//[1]- rahulshettyacademy' to Login.
		//String[] passTextSplit2 = passTextSplit[1].split("'");
		//[0] - rahulshettyacademy
		//[1]- ' to Login.
		//String storePassword = passTextSplit2[0];
		String storePassword =passTextSplit[1].split("'")[0];// This string is the short form of the 2 above
		//[0] - rahulshettyacademy
	
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); //xpath with div/button/child buttons[index]
		System.out.println("The Password is: "+ storePassword);
		return storePassword;
	}

}

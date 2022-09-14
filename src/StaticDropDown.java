import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abraham\\Documents\\Danthek\\Automated QA Tools\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//run in maximize mode
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise//");
		////////// Dropdowns with select/////////////
		//Store the dropdown selector in a new webelement variable 
		WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//create an object from the "Select"class/library
		Select dropdown = new Select(staticDropDown); 
		//call the methods available in the new created object and select the desired option by index
		dropdown.selectByIndex(3);
		// get the first option selected (we selected the 3rd)  and print the text
		System.out.println("Item selection with 'SelectByIndex: '  " + dropdown.getFirstSelectedOption().getText());
		// Select element by visible text
		dropdown.selectByVisibleText("AED");
		System.out.println("Item selection by visible text: " + dropdown.getFirstSelectedOption().getText());
		//select by value, the value is defined inside the html tag,take it from there
		dropdown.selectByValue("INR");
		System.out.println("Item selection by Value: " + dropdown.getFirstSelectedOption().getText());
		
	}

}

package CommonActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KeyWords {
	
	public static WebDriver driver;
	
	public static void openBrowser() {
		
		try {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HomePC\\eclipse-workspace\\SeleniumAutomation\\chromedriver.exe");
			//WebDriver driver=new ChromeDriver();
			driver = new ChromeDriver();
			System.out.println("user is able to open Browser");			
		}
		
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(" user is not able to open Browser");
		}
				
	}
	
	//URL Navigation
	
	public static void UrlNavigate(String URL) {
		
		try {
			
			//driver.manage().window().fullscreen();
			driver.manage().window().maximize();
			//driver.manage().wait(10);
			//WebDriver driver = new ChromeDriver();
			driver.get(URL);
			System.out.println("User is able to launch the app");
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("User is not able to launch the app");
		}
	}

	// Enter text in text field
	
	public static void EnterText(String giveXpath, String enterItem) {
		
		try {
			driver.findElement(By.xpath(giveXpath)).clear();
			driver.findElement(By.xpath(giveXpath)).sendKeys(enterItem);
			System.out.println("User is able to enter text");									
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("User is not able to enter text");
		}
	}
	
	public static void EnterInteger (String giveXpath, int enterValue) {
		try {
			
			// to enter numeric values via sendKeys()
			driver.findElement(By.xpath(giveXpath)).sendKeys(String.valueOf(enterValue));
			
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("user is not able to enter value");
		}
	}
	
	//to select element
	public static void SelectItem(String xpathvalue, String value) {
		try {
			WebElement element = driver.findElement(By.xpath(xpathvalue));
			Select sele = new Select (element);
			sele.selectByVisibleText(value);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("user is not able to select element");
		}
	}
	
	// for clicking the Xpath 
	public static void clickButton (String giveXpath) {
		try {
			
			driver.findElement(By.xpath(giveXpath)).click();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	// toclose the browser
	public static void CloseBrowser() {
		try {
			//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
			driver.close();
			driver.quit();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("User not able to close the browser");
		}
	}
	
}

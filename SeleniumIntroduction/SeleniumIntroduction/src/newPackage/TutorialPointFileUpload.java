package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialPointFileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		Thread.sleep(2000);
		WebElement upload = driver.findElement(By.cssSelector("input[id='picture']"));
		Thread.sleep(2000);
		upload.sendKeys("C:/Users/sbaburao/Downloads/good-morning-pic.jpg");
		
	}

}

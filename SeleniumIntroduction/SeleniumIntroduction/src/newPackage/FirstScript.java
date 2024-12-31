package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
        driver.get("https://www.google.com");
		Thread.sleep(2000);
        Actions action = new Actions(driver);
		WebElement element1 = driver.findElement(By.cssSelector("textarea[id='APjFqb']"));

/*		You can prefer following selectors also:
		WebElement element2 = driver.findElement(By.id("APjFqb"));
		WebElement element3 = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        WebElement element4 = driver.findElement(By.cssSelector("#APjFqb"));
		WebElement element5 = driver.findElement(By.cssSelector("textarea"));
		WebElement element6 = driver.findElement(By.cssSelector("textarea.gLFyf"));
		WebElement element7 = driver.findElement(By.cssSelector(".gLFyf"));
		WebElement element8 = driver.findElement(By.cssSelector("textarea[class='gLFyf']"));
		WebElement element9 = driver.findElement(By.cssSelector("textarea[aria-label='Search']")); */
		
		action.moveToElement(element1).sendKeys("Selenium", Keys.ENTER).perform();
		Thread.sleep(5000);
		driver.quit();       
	}

}

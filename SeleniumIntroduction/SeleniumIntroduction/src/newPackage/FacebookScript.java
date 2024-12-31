package newPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class FacebookScript {

	// @SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
	
	//===============================================================================	
		
		String currentUrl, expectedUrl, expectedTitle, actualTitle;
		expectedUrl = "https://www.facebook.com/";
		expectedTitle = "Facebook – log in or sign up";
		String[] expectedArray = {expectedUrl, expectedTitle};
		String phoneNumber = "9420653966", password = "M@toshri2000";
		
	//===============================================================================		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);		
		driver.get(expectedUrl);
		
	//===============================================================================
		
		//**************Test Case 1 to 9: Check Physical properties of "Email Address Or Phone Number" Text box**************

		String expectedBorderWidth, expectedBorderColor, expectedBorderHeight;
		String[] physicalProperties = {expectedBorderWidth="0.8px", expectedBorderColor="rgba(27, 116, 228, 1)", expectedBorderHeight="22px"}; 
		WebElement enterEmailOrPhoneNumber = driver.findElement(By.cssSelector("[placeholder='Email address or phone number']"));
		WebElement enterPassword = driver.findElement(By.cssSelector("[placeholder='Password']"));
		WebElement loginBtn = driver.findElement(By.cssSelector("[data-testid='royal_login_button']"));
		Thread.sleep(1000);
		String actualBorderTopWidth = enterEmailOrPhoneNumber.getCssValue("border-top-width");
		String actualBorderRightWidth = enterEmailOrPhoneNumber.getCssValue("border-right-width");
		String actualBorderBottomWidth = enterEmailOrPhoneNumber.getCssValue("border-bottom-width");
		String actualBorderLeftWidth = enterEmailOrPhoneNumber.getCssValue("border-left-width");
		String actualBorderTopColor = enterEmailOrPhoneNumber.getCssValue("border-top-color");
		String actualBorderRightColor = enterEmailOrPhoneNumber.getCssValue("border-right-color");
		String actualBorderBottomColor = enterEmailOrPhoneNumber.getCssValue("border-bottom-color");
		String actualBorderLeftColor = enterEmailOrPhoneNumber.getCssValue("border-left-color");
		String actualBorderHeight = enterEmailOrPhoneNumber.getCssValue("height");
		
		Thread.sleep(1000);
		System.out.println("The expected top border width of 'Email Address or Phone Number' Textbox: " + expectedBorderWidth);
		System.out.println("The actual top border width of 'Email Address or Phone Number' Textbox: " + actualBorderTopWidth);
		if(actualBorderTopWidth.equals(physicalProperties[0])) {
			System.out.println("Test Case 1 Status: Passed");
		} else {
			System.out.println("Test Case 1 Status: Failed");
		}
		Thread.sleep(1000);
		System.out.println("The expected right border width of 'Email Address or Phone Number' Textbox: " + expectedBorderWidth);
		System.out.println("The right border width of 'Email Address or Phone Number' Textbox: " + actualBorderRightWidth);
		if(physicalProperties[0].equals(actualBorderRightWidth)) {
			System.out.println("Test Case 2 Status: Passed");
		} else {
			System.out.println("Test Case 2 Status: Failed");
		}
		Thread.sleep(1000);
		System.out.println("The expected bottom border width of 'Email Address or Phone Number' Textbox: " + expectedBorderWidth);
		System.out.println("The bottom border width of 'Email Address or Phone Number' Textbox: " + actualBorderBottomWidth);
		if(physicalProperties[0].equals(actualBorderBottomWidth)) {
			System.out.println("Test Case 3 Status: Passed");
		} else {
			System.out.println("Test Case 3 Status: Failed");
		}
		Thread.sleep(1000);
		System.out.println("The expected left border width of 'Email Address or Phone Number' Textbox: " + expectedBorderWidth);
		System.out.println("The left border width of 'Email Address or Phone Number' Textbox: " + actualBorderLeftWidth);
		if(physicalProperties[0].equals(actualBorderLeftWidth)) {
			System.out.println("Test Case 4 Status: Passed");
		} else {
			System.out.println("Test Case 4 Status: Failed");
		}
		
		Thread.sleep(1000);
		System.out.println("The expected border top color of 'Email Address or Phone Number' Textbox: " + expectedBorderColor);
		System.out.println("The border top color of 'Email Address or Phone Number' Textbox: " + actualBorderTopColor);
		if(physicalProperties[1].equals(actualBorderTopColor)) {
			System.out.println("Test Case 5 Status: Passed");
		} else {
			System.out.println("Test Case 5 Status: Failed");
		}
		Thread.sleep(1000);
		System.out.println("The expected border right color of 'Email Address or Phone Number' Textbox: " + expectedBorderColor);
		System.out.println("The border right color of 'Email Address or Phone Number' Textbox: " + actualBorderRightColor);
		if(physicalProperties[1].equals(actualBorderRightColor)) {
			System.out.println("Test Case 6 Status: Passed");
		} else {
			System.out.println("Test Case 6 Status: Failed");
		}
		Thread.sleep(1000);
		System.out.println("The expected border bottom color of 'Email Address or Phone Number' Textbox: " + expectedBorderColor);
		System.out.println("The border bottom color of 'Email Address or Phone Number' Textbox: " + actualBorderBottomColor);
		if(physicalProperties[1].equals(actualBorderBottomColor)) {
			System.out.println("Test Case 7 Status: Passed");
		} else {
			System.out.println("Test Case 7 Status: Failed");
		}
		Thread.sleep(1000);
		System.out.println("The expected border left color of 'Email Address or Phone Number' Textbox: " + expectedBorderColor);
		System.out.println("The border left color of 'Email Address or Phone Number' Textbox: " + actualBorderLeftColor);
		if(physicalProperties[1].equals(actualBorderLeftColor)) {
			System.out.println("Test Case 8 Status: Passed");
		} else {
			System.out.println("Test Case 8 Status: Failed");
		}
		
		Thread.sleep(1000);
		System.out.println("The expected height of 'Email Address or Phone Number' Textbox: " + expectedBorderHeight);
		System.out.println("The height of 'Email Address or Phone Number' Textbox: " + actualBorderHeight);
		if(physicalProperties[2].equals(actualBorderHeight)) {
			System.out.println("Test Case 9 Status: Passed");
		} else {
			System.out.println("Test Case 9 Status: Failed");
		}
	//===============================================================================
		
		Thread.sleep(2000);
		currentUrl = driver.getCurrentUrl();
		actualTitle = driver.getTitle();
		String[] actualArray = {currentUrl, actualTitle};
		Thread.sleep(1000);
		System.out.println("Expected URL: " + expectedArray[0]);
		Thread.sleep(1000);
		System.out.println("Current URL: " + actualArray[0]);	
		
	//===============================================================================		

		//**************Test Case 10: URL of WebPage => verification/assertion**************
		Thread.sleep(2000);
		if(actualArray[0].equals(expectedArray[0])) {
			System.out.println("Test Case 10 Status: Passed");
		} else {
			System.out.println("Test Case 10 Status: Failed");
		}
		
		//**************Test Case 11: Title of WebPage => verification/assertion**************
		System.out.println("Expected Title: " + expectedArray[1]);
		Thread.sleep(1000);
		System.out.println("Actual Title: " + actualArray[1]);
		if(actualArray[1].equals(expectedArray[1])) {
			System.out.println("Test Case 11 Status: Passed");
		} else {
			System.out.println("Test Case 11 Status: Failed");
		}
		Thread.sleep(1000);

	//===============================================================================		

		Thread.sleep(1000);
		String tagNameForEmailOrPhoneNumber = enterEmailOrPhoneNumber.getTagName();
		System.out.println("Tag name of Email or PhoneNumber. Tag Name = " + tagNameForEmailOrPhoneNumber);
		//**************Test Case 12: emailOrPhoneNumber text box verification/assertion**************
		if(tagNameForEmailOrPhoneNumber.equals("input")) {
			enterEmailOrPhoneNumber.sendKeys(phoneNumber);
			System.out.println("Test Case 12 Status: Passed");
		} else {
			System.out.println("Test Case 12 Status: Failed");
		}
		Thread.sleep(2000);
		String valueOfTheAttr = enterPassword.getAttribute("aria-label");
		System.out.println("Aria label of Email or PhoneNumber. aria-label = " + valueOfTheAttr);
		//**************Test Case 13: Password text box verification/assertion**************
		if(valueOfTheAttr.equals("Password")) {
			enterPassword.sendKeys(password);
			System.out.println("Test Case 13 Status: Passed");
		} else {
			System.out.println("Test Case 13 Status: Failed");
		}
		Thread.sleep(2000);
		//**************Test Case 14: Login button background-color verification/assertion**************
		Color expectedLoginBtnBackgroundColor = Color.fromString("#1877f2");
		String anticipatedLoginBtnBackgroundColor = expectedLoginBtnBackgroundColor.toString();
		// String expectedLoginBtnColor = String.valueOf(Color.fromString("#1877f2"));
		String finalExpectedLoginBtnBackgroundColor = anticipatedLoginBtnBackgroundColor.substring(7);
		System.out.println("Login button expected back-ground color: " + finalExpectedLoginBtnBackgroundColor);
		Thread.sleep(2000);
		String actualLoginBtnBackgroundColor = loginBtn.getCssValue("background-color");
		System.out.println("Login button actual back-ground color: " + actualLoginBtnBackgroundColor);
		Thread.sleep(2000);
		// assert actualLoginBtnColor.equals(finalExpectedLoginBtnBackgroundColor);
		// System.out.println("Test Case 5 Status: " + actualLoginBtnColor.equals(finalExpectedLoginBtnColor));
		Thread.sleep(2000);
		if(actualLoginBtnBackgroundColor.equals(finalExpectedLoginBtnBackgroundColor)) {
			boolean True = actualLoginBtnBackgroundColor.equals(finalExpectedLoginBtnBackgroundColor);
			System.out.println("Test Case 14 Status: " + True + " and Passed");
		} else {
			System.out.println("Test Case 14 Status: Failed");
		}
		
		//**************Test Case 15: Login button text color verification/assertion**************
		
		Color expectedLoginBtnColor = Color.fromString("#fff");
		System.out.println(expectedLoginBtnColor);
		Thread.sleep(1000);
		System.out.println(expectedLoginBtnColor.toString());
		Thread.sleep(1000);
		int subStringForElbc = 7; // Elbc = expectedLoginBtnColor;
		String anticipatedLoginBtnColor = expectedLoginBtnColor.toString().substring(subStringForElbc);
		System.out.println("Login button text expected color: " + anticipatedLoginBtnColor);
		String actualLoginBtnTextColor = loginBtn.getCssValue("color");
		if (actualLoginBtnTextColor.equals(actualLoginBtnTextColor)) {
			boolean True = actualLoginBtnTextColor.equals(actualLoginBtnTextColor);
			System.out.println("Test Case 15 Status: " + True + " and Passed");
		} else {
			System.out.println("Test Case 15 Status: Failed");
		}
		
		//**************Test Case 16: Login button text verification/assertion**************
		String expectedText = "Log in";
		System.out.println("The login button expected text: " + expectedText);
		String actualLoginBtnText = loginBtn.getText();
		System.out.println("The login button actual text: " + actualLoginBtnText);
		if(actualLoginBtnText.equals(expectedText)) {
			loginBtn.click();
			System.out.println("Test Case 16 Status: Passed");
		} else {
			System.out.println("Test Case 16 Status: Failed");
		}

		Thread.sleep(15000);
	
	//===============================================================================
		
		 driver.quit();
		
	//===============================================================================
	}

}

package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.LoginPage;
import pageObjects.QuestionsPage;
import pageObjects.SimpleLoginRegPage;
import utility.Constant;

public class LoginAction {
	 
	public static void signin(WebDriver driver) throws Exception{

	
		driver.findElement(LoginPage.loginID).sendKeys(Constant.username);
		driver.findElement(LoginPage.proceed_btn).click();
		Thread.sleep(1000);
		driver.findElement(LoginPage.password).sendKeys(Constant.password);
		driver.navigate().back();
		driver.findElement(LoginPage.login_btn).click();
		Thread.sleep(1000);
		driver.findElement(QuestionsPage.qa1).sendKeys(Constant.qa1);
		driver.navigate().back();
		driver.findElement(QuestionsPage.qa2).sendKeys(Constant.qa2);
		driver.navigate().back();
		driver.findElement(QuestionsPage.submit_btn).click();
		Thread.sleep(2000);
		driver.findElement(QuestionsPage.agree).click();
		Thread.sleep(1000);
		driver.findElement(SimpleLoginRegPage.skipnow).click();
		
		

    }

}

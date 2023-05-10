package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import pageObjects.QuestionsPage;
import pageObjects.SimpleLoginRegPage;
import utility.Constant;

public class BuyTrade {

	public static void buy(WebDriver driver) throws Exception{

		
		driver.findElement(DashboardPage.right_icon).click();
		//Click on Trade from Right Slider
		driver.findElement(DashboardPage.trade_icon).click();
		driver.findElement(DashboardPage.search_box).sendKeys("tcs");
		driver.navigate().back();
		driver.findElement(DashboardPage.company_name).click();
		driver.findElement(DashboardPage.quantity).sendKeys("2");
		driver.navigate().back();
		driver.findElement(DashboardPage.buy_btn).click();
		Thread.sleep(1000);
		driver.findElement(DashboardPage.submit_btn).click();
		driver.findElement(DashboardPage.place_order).click();
		Thread.sleep(1000);
		WebElement success=driver.findElement(DashboardPage.success_icon);
		Assert.assertTrue(success.isDisplayed(), "Order not placed!!");
		driver.findElement(DashboardPage.go_back).click();
		
		
		
		

    }

}

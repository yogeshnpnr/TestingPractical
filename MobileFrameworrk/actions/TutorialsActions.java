package actions;

import org.openqa.selenium.WebDriver;

import pageObjects.DashboardPage;
import pageObjects.HomePage;

public class TutorialsActions {
	
public static void gotohome(WebDriver driver) {

		
		driver.findElement(HomePage.nextbtn).click();
		
		driver.findElement(HomePage.nextbtn).click();
		
		driver.findElement(HomePage.nextbtn).click();
		driver.findElement(HomePage.nextbtn).click();
		driver.findElement(HomePage.donebtn).click();
		

}
}

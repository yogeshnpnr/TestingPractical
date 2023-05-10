package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public static By loginID = (By.className("android.widget.TextView"));

	public static By proceed_btn = By.id("loginBtnOnLogin");

	public static By password = By.id("passwordEditText");

	public static By login_btn = By.id("loginBtnOnPwd");

}

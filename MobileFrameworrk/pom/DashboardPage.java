package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	WebDriver driver;

	public static By total_bal = (By.id("dbCashBalanceVal"));

	public static By right_icon = By.id("right_icon");

	public static By trade_icon = By.id("trade_layout_right_menu");

	public static By search_box = By.id("search_edit_text");
	public static By company_name = By.id("company_name");
	public static By quantity = By.id("quantityEditText");
	public static By buy_btn = By.id("actionBuy");
	public static By submit_btn = By.id("submitbtnTxt");

	public static By place_order = By.id("tradeSubmitBtn");
	
	public static By success_icon = By.id("successAlertIcon");
	
	public static By position = By.id("positionsBtn");
	
	public static By order_status = By.id("orderStatusBtn");
	public static By go_back = By.id("goBackBtn");


}

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginHelper {

    @FindBy(id = "com.truecaller:id/nextButton")
    WebElement btn_setStarted;

    // Allow Permissions pop-up
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RadioButton")
    WebElement rad_True;

    @FindBy(id = "android:id/button1")
    WebElement btn_setDefault;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.RadioButton")
    WebElement rad_true;

    @FindBy(id = "com.google.android.gms:id/cancel")
    WebElement btn_cancel;


    @FindBy(id = "com.truecaller:id/countrySpinner")
    WebElement countryDD;

    @FindBy(id = "com.truecaller:id/searchEditText")
    WebElement txt_country;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]")
    WebElement option_india;

    @FindBy(id = "com.truecaller:id/numberField")
    WebElement txt_number;

    @FindBy(id = "com.truecaller:id/nextButton")
    WebElement btn_confirm;

    //Popup confirmation Steps
    @FindBy(id = "android:id/button1")
    WebElement btn_accept;

    @FindBy(id = "android:id/button2")
    WebElement btn_decideNation;

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    WebElement allowCallLog;

    //Complete Profile Steps
    @FindBy(id = "com.truecaller:id/manualInputButton")
    WebElement profileByType;

    @FindBy(id = "com.truecaller:id/firstName")
    WebElement txt_fName;

    @FindBy(id = "com.truecaller:id/lastName")
    WebElement txt_lName;

    @FindBy(id = "com.truecaller:id/email")
    WebElement txt_email;

    AppiumDriver driver;

    public TestTruecallerPF(AppiumDriver driver){
        this.driver  = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void clickGetStarted() throws InterruptedException {
        Thread.sleep(3000);
        btn_setStarted.click();
    }

    public void setTrueCallerDefault1(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        rad_True.click();
        btn_setDefault.click();
    }

    public void setTrueCallerDefault2(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        rad_true.click();
        System.out.println("clicked 1");
        btn_setDefault.click();
        System.out.println("clicked 2");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void allowContact(){
//      driver.switchTo().activeElement();
        btn_setDefault.click();
        System.out.println("clicked 3");
    }
    public void allowContactPermission(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        allowCallLog.click();
        allowCallLog.click(); // to read contacts
        allowCallLog.click(); // to make & manage phone calls
        allowCallLog.click(); // to send & view SMS
    }

    public void denySuggestedNumber(){
        btn_cancel.click();
        System.out.println("clicked 4");
    }

    public void login() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        countryDD.click();
        txt_country.sendKeys("india");
        option_india.click();
        txt_number.sendKeys("9742755150");
        btn_confirm.click();
        //confirm entered number in pop-up
        btn_setDefault.click();

        //Confirmation from Privacy pop-up
        btn_confirm.click();
    }

    public void completeProfile() throws InterruptedException {
        Thread.sleep(3000);
        profileByType.click();
        // profile form step
        txt_fName.sendKeys("Yogesh");
        txt_lName.sendKeys("Kumar");
        txt_email.sendKeys("yogeshkumar23791@gmail.com");
        btn_confirm.click();
    }
}

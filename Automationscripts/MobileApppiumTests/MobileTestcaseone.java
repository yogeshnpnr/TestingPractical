//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class AppiumTestcase {
//
//    public static void main(String[] args) {
//
////Set the Desired Capabilities
//
//        DesiredCapabilities caps = new DesiredCapabilities();
//
//        caps.setCapability("deviceName", "My Phone");
//
//        caps.setCapability("udid", "device id"); //Give Device ID  caps.setCapability("platformName", "Android");
//
//        caps.setCapability("platformVersion", "11.0");
//
//        caps.setCapability("appPackage", "com.android.vending");
//
//        caps.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
//
//        caps.setCapability("noReset", "true");
//
////Instantiate Appium Driver
//
//        try {
//
//            AppiumDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
//
//        } catch (MalformedURLException e) {
//
//            System.out.println(e.getMessage());
//
//        }
//
//
//
//    }
//
//
//    @Test
//    public void testApp() throws MalformedURLException{
//
//        System.out.println("App launched");
//        // locate Add Contact button and click it
//        WebElementaddContactButton = driver.findElement(By.name("Add Contact"));
//        addContactButton.click();
//        //locate input fields and type name and email for a new contact and save it
//        List&amp;lt;WebElement&amp;gt;textFields = driver.findElements(By.className("android.widget.EditText"));
//        textFields.get(0).sendKeys("Neeraj Test");
//        textFields.get(1).sendKeys("9999999999");
//        textFields.get(2).sendKeys("testemail@domain.com");
//        driver.findElement(By.name("Save")).click();
//        //insert assertions here
//    }
//}
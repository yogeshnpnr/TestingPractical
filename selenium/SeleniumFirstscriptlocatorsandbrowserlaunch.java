package WebApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyTest {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","/Users/yogesh.gujrati/Downloads/chromedriver_mac/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //driver.navigate().to("http:\\www.google.com");
        driver.get("https://www.saucedemo.com");


        String title = driver.getTitle();
        String url = driver.getCurrentUrl();


        System.out.println(title + url );



        //driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.tagName("input")).sendKeys("standard_user");

        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        // click on the compose button as soon as the "compose" button is visible


        //WebDriverWait wait = new WebDriverWait(driver,30);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("submit-button")));



       driver.findElement(By.className("submit-button")).click();


        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);




        String currentWindowHandle = driver.getWindowHandle();

        driver.switchTo().window(currentWindowHandle);

        //driver.findElement(By.partialLinkText("Sauce Labs Fleece Jacket")).click();


        List<WebElement> elementList = driver.findElements(By.partialLinkText("Sauce"));


        System.out.println("elemenzt size "+ elementList.size());



        driver.quit();

    }
}

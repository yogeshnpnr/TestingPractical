package WebApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyTestforCustomCSS {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","/Users/yogesh.gujrati/Downloads/chromedriver_mac/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //driver.navigate().to("http:\\www.google.com");
        driver.get("https://www.saucedemo.com");


        //tag --tag#id


         //locator user name -------------tag#id
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

        //locator password ----------tag[attribute=value]
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");



        //locate login button using  -------------#tag.value class name

        driver.findElement(By.cssSelector("input.submit-button")).click();

        String currentWindowHandle = driver.getWindowHandle();

        driver.switchTo().window(currentWindowHandle);


        //tag,class[attribute=value]
        driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-bike-light]")).click();


        //tag.[attribute$=value]  #sub string
        driver.findElement(By.cssSelector("button[name$=light]")).click();








        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);



        driver.quit();

    }
}

package Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {

    public static WebDriver setupChrome(String site) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jorda\\Documents\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(site);
        Thread.sleep(4000);
        return driver;
    }

}

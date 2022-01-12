package Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class DriverSetup {

    public static WebDriver setupChrome(String site) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jorda\\Documents\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(site);
        Thread.sleep(4000);
        return driver;
    }

    public static WebDriver setupFirefox(String site) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\jorda\\Documents\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(site);
        Thread.sleep(4000);
        return driver;
    }

}

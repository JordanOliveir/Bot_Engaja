package Suporte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Suporte {

    public void wait(WebDriver driver, By element){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}

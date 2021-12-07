package Elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Instagram {

    private By userName = By.cssSelector("#loginForm > div > div:nth-child(1) > div > label > input");
    private By password = By.cssSelector("#loginForm > div > div:nth-child(2) > div > label > input");
    private By login = By.cssSelector("#loginForm > div > div:nth-child(3) > button > div");

    //tela de pesquisa
    private By foto = By.cssSelector("#react-root > div > div > section > main > article > div.EZdmt > div > div > div:nth-child(1) > div:nth-child(1) > a > div > div._9AhH0");
    private By like = By.cssSelector(".fr66n > button:nth-child(1)");
    private By next = By.cssSelector("body > div._2dDPU.QPGbb.CkGkG > div.EfHg9 > div > div > div > button > div > span > svg");
    private By next2 = By.cssSelector("body > div._2dDPU.QPGbb.CkGkG > div.EfHg9 > div > div > div.l8mY4.feth3 > button > div > span > svg");



    public By getUserName(){return userName;}

    public By getPassword(){return password;}

    public By getLogin(){return login;}

    //tela de pesquisa
    public By getFoto(){return foto;}

    public By getLike(){return like;}

    public By getNext2(){return next2;}

    public By getNext(){return next;}


}

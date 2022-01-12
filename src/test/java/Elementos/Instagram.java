package Elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Instagram {

    private By userName = By.cssSelector("#loginForm > div > div:nth-child(1) > div > label > input");
    private By password = By.cssSelector("#loginForm > div > div:nth-child(2) > div > label > input");
    private By login = By.cssSelector("#loginForm > div > div:nth-child(3) > button > div");
    private By confirm = By.cssSelector("button.sqdOP:nth-child(4)");

    //tela de pesquisa
    private By foto = By.cssSelector(".EZdmt > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > div:nth-child(2)");
    private By like = By.cssSelector(".fr66n > button:nth-child(1)");
    private By next = By.cssSelector(".l8mY4 > button:nth-child(1)");
    private By next2 = By.cssSelector(".l8mY4 > button:nth-child(1)");



    public By getUserName(){return userName;}

    public By getPassword(){return password;}

    public By getLogin(){return login;}

    public By getConfirm(){return confirm;}

    //tela de pesquisa
    public By getFoto(){return foto;}

    public By getLike(){return like;}

    public By getNext2(){return next2;}

    public By getNext(){return next;}


}

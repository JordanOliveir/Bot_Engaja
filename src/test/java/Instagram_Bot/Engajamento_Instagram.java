package Instagram_Bot;

import Elementos.Instagram;
import Suporte.DriverSetup;
import Suporte.Suporte;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class Engajamento_Instagram {

    DriverSetup driverSetup = new DriverSetup();
    WebDriver navegador;
    Instagram instagram = new Instagram();
    Suporte suporte = new Suporte();


    @Before
    public void logar() throws InterruptedException {
        navegador = driverSetup.setupChrome("https://www.instagram.com/");
        navegador.findElement(instagram.getUserName()).sendKeys("@summerlove_st");
        Thread.sleep(4000);
        navegador.findElement(instagram.getPassword()).sendKeys("meriane18");
        Thread.sleep(2000);
        navegador.findElement(instagram.getLogin()).click();
        Thread.sleep(4000);
    }

    @Test
    public void CurtirFotoNoInstagram() throws InterruptedException {
        navegador.get("https://www.instagram.com/explore/tags/biquini");//navega até paquina de pesquisa
        Thread.sleep(4000);
        suporte.wait(navegador, instagram.getFoto());
        navegador.findElement(instagram.getFoto()).click(); //abre primeira foto da pagina

        Thread.sleep(4000);
        suporte.wait(navegador, instagram.getLike());
        navegador.findElement(instagram.getLike()).click();//da like na foto

        Thread.sleep(4000);
        suporte.wait(navegador, instagram.getNext());
        navegador.findElement(instagram.getNext()).click();

        for (int i = 0; i <= 35; i++) {
            Thread.sleep(4000);
            if(navegador.findElement(instagram.getNext2()).isDisplayed()==true) {
                navegador.findElement(instagram.getNext2()).click();
            }else {
                navegador.findElement(instagram.getLike()).click();
            }
            Thread.sleep(4000);
            suporte.wait(navegador, instagram.getLike());
            navegador.findElement(instagram.getLike()).click();
        }

        //Curtir fotos com tag PRAIA
        navegador.get("https://www.instagram.com/explore/tags/praia");//navega até paquina de pesquisa
        suporte.wait(navegador, instagram.getFoto());
        navegador.findElement(instagram.getFoto()).click(); //abre primeira foto da pagina

        Thread.sleep(4000);
        suporte.wait(navegador, instagram.getLike());
        navegador.findElement(instagram.getLike()).click();//da like na foto

        Thread.sleep(4000);
        suporte.wait(navegador, instagram.getNext());
        navegador.findElement(instagram.getNext()).click();

        for (int i = 0; i <= 35; i++) {
            Thread.sleep(4000);
            if(navegador.findElement(instagram.getNext2()).isDisplayed()==true) {
                navegador.findElement(instagram.getNext2()).click();
            }else {
                navegador.findElement(instagram.getLike()).click();
            }
            Thread.sleep(4000);
            suporte.wait(navegador, instagram.getLike());
            navegador.findElement(instagram.getLike()).click();
        }

        //Curtir fotos com tag BEACH
        navegador.get("https://www.instagram.com/explore/tags/beach");//navega até paquina de pesquisa
        Thread.sleep(4000);
        suporte.wait(navegador, instagram.getFoto());
        navegador.findElement(instagram.getFoto()).click(); //abre primeira foto da pagina

        Thread.sleep(1000);
        suporte.wait(navegador, instagram.getLike());
        navegador.findElement(instagram.getLike()).click();//da like na foto

        Thread.sleep(4000);
        suporte.wait(navegador, instagram.getNext());
        navegador.findElement(instagram.getNext()).click();

        for (int i = 0; i <= 35; i++) {
            Thread.sleep(4000);
            if(navegador.findElement(instagram.getNext2()).isDisplayed()==true) {
                navegador.findElement(instagram.getNext2()).click();
            }else {
                navegador.findElement(instagram.getLike()).click();
            }
            Thread.sleep(4000);
            suporte.wait(navegador, instagram.getLike());
            navegador.findElement(instagram.getLike()).click();
        }

        //Curtir fotos com tag SUMMER
        navegador.get("https://www.instagram.com/explore/tags/summer");//navega até paquina de pesquisa
        suporte.wait(navegador, instagram.getFoto());
        navegador.findElement(instagram.getFoto()).click(); //abre primeira foto da pagina

        Thread.sleep(3000);
        suporte.wait(navegador, instagram.getLike());
        navegador.findElement(instagram.getLike()).click();//da like na foto

        Thread.sleep(4000);
        suporte.wait(navegador, instagram.getNext());
        navegador.findElement(instagram.getNext()).click();

        for (int i = 0; i <= 35; i++) {
            Thread.sleep(4000);
            if(navegador.findElement(instagram.getNext2()).isDisplayed()==true) {
                navegador.findElement(instagram.getNext2()).click();
            }else {
                navegador.findElement(instagram.getLike()).click();
            }
            Thread.sleep(4000);
            suporte.wait(navegador, instagram.getLike());
            navegador.findElement(instagram.getLike()).click();
        }

        //Curtir fotos com tag VERAO
        navegador.get("https://www.instagram.com/explore/tags/verao");//navega até paquina de pesquisa
        suporte.wait(navegador, instagram.getFoto());
        navegador.findElement(instagram.getFoto()).click(); //abre primeira foto da pagina

        Thread.sleep(3000);
        suporte.wait(navegador, instagram.getLike());
        navegador.findElement(instagram.getLike()).click();//da like na foto

        Thread.sleep(4000);
        suporte.wait(navegador, instagram.getNext());
        navegador.findElement(instagram.getNext()).click();

        for (int i = 0; i <= 35; i++) {
            Thread.sleep(4000);
            if(navegador.findElement(instagram.getNext2()).isDisplayed()==true) {
                suporte.wait(navegador, instagram.getNext2());
                navegador.findElement(instagram.getNext2()).click();
            }else {
                navegador.findElement(instagram.getLike()).click();
            }
            Thread.sleep(4000);
            suporte.wait(navegador, instagram.getLike());
            navegador.findElement(instagram.getLike()).click();
        }

        //Curtir fotos com tag PISCINA
        navegador.get("https://www.instagram.com/explore/tags/piscina");//navega até paquina de pesquisa
        Thread.sleep(4000);
        suporte.wait(navegador, instagram.getFoto());
        navegador.findElement(instagram.getFoto()).click(); //abre primeira foto da pagina

        Thread.sleep(4000);
        suporte.wait(navegador, instagram.getLike());
        navegador.findElement(instagram.getLike()).click();//da like na foto

        Thread.sleep(4000);
        suporte.wait(navegador, instagram.getNext());
        navegador.findElement(instagram.getNext()).click();

        for (int i = 0; i <= 35; i++) {
            Thread.sleep(4000);
            if(navegador.findElement(instagram.getNext2()).isDisplayed()==true) {
                navegador.findElement(instagram.getNext2()).click();
            }else {
                navegador.findElement(instagram.getLike()).click();
            }
            Thread.sleep(4000);
            suporte.wait(navegador, instagram.getLike());
            navegador.findElement(instagram.getLike()).click();
        }
    }

    @After
    public void exit(){
        navegador.quit();
    }
}

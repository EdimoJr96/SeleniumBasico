package br.com.vivo.pageObject.pages;

import br.com.vivo.pageObject.attributs.AttributsCelulares;
import org.openqa.selenium.WebDriver;

public class PageCelulares extends AttributsCelulares {
    private WebDriver driver;

    public PageCelulares(WebDriver pdriver){
        this.driver = pdriver;
    }

    public void escolherOSegundoAparelho(){
        driver.findElement(segundoCelularDaLista).click();
    }
}
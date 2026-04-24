package br.com.vivo.pageObject.pages;

import br.com.vivo.pageObject.attributs.AttributsHome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageHome extends AttributsHome {
    private WebDriver driver;

    public PageHome(WebDriver pdriver){
        this.driver = pdriver;
    }

    public void acessarOSite(){
        driver.get("https://store.vivo.com.br/");
    }

    public void aceitarTermosDeConsentimento(){
        driver.findElement(consentButton).click();
    }

    public void clicarNoMenuCelulares(){
        driver.findElement(menuCelulares).click();
    }

}
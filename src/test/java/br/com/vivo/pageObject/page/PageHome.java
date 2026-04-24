package br.com.vivo.pageObject.page;

import br.com.vivo.pageObject.atributs.AtributsHome;
import org.openqa.selenium.WebDriver;

public class PageHome extends AtributsHome {
    private WebDriver driver;

    public PageHome(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarSite (){
        driver.get("https://store.vivo.com.br/");
    }

    public void aceitarTermosConcetimento (){
        driver.findElement(concentButton).click();
    }

}

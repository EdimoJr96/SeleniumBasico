package br.com.vivo.pageObject.pages;

import br.com.vivo.pageObject.attributs.AttributsProdutos;
import org.openqa.selenium.WebDriver;

public class PageProdutos extends AttributsProdutos {
    private WebDriver driver;

    public PageProdutos(WebDriver pdriver){
        this.driver = pdriver;
    }

    public String retornarPrecoDoProduto(){
        String precoProduto = driver.findElement(precoDoProduto).getText();
        System.out.println("Preço do produto: " + precoProduto);
        return precoProduto;
    }

    public void clicarEmColocarNoCarrinho(){
        driver.findElement(botaoAdicionarAoCarrinho).click();
    }
}
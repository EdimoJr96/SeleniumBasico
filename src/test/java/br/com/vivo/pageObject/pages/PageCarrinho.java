package br.com.vivo.pageObject.pages;

import br.com.vivo.pageObject.attributs.AttributsCarrinho;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageCarrinho extends AttributsCarrinho {

    private WebDriver driver;

    public PageCarrinho(WebDriver pdriver){
        this.driver = pdriver;
    }

    public boolean verificaProdutoNoCarrinho(){
        WebDriverWait espera = new WebDriverWait(driver, Duration.ofSeconds(30));
        boolean estaExibindoProduto = espera.until(ExpectedConditions.visibilityOfElementLocated(produtoNoCarrinho)).isDisplayed();
        return estaExibindoProduto;
    }

    public String capturarValorTotalDoCarrinho(){
        String precoTotal = driver.findElement(valorTotalDoCarrinho).getText();
        System.out.println("Valor total do carrinho é: " + precoTotal);
        return precoTotal;
    }

}
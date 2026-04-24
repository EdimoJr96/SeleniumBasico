package br.com.vivo.pageObject.attributs;

import org.openqa.selenium.By;

public class AttributsProdutos {
    public By precoDoProduto = By.xpath("(//div[@aria-label='new item price']//p[contains(text(),'R$')])[1]");
    public By botaoAdicionarAoCarrinho = By.xpath("//span[normalize-space()='Colocar no carrinho']");
}
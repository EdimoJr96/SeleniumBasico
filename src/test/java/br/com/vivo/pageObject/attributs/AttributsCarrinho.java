package br.com.vivo.pageObject.attributs;

import org.openqa.selenium.By;

public class AttributsCarrinho {
    public By produtoNoCarrinho = By.xpath("//div[@class='item-description']");
    public By valorTotalDoCarrinho = By.id("total-value");
}
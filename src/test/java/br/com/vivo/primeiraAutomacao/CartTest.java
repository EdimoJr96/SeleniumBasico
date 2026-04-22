package br.com.vivo.primeiraAutomacao;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CartTest {
    @Test
    public void createCart (){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        driver.get("https://store.vivo.com.br");

        driver.findElement(By.xpath("//button[@id='consent']")).click();

        driver.findElement(By.xpath("//a[@title='Celulares']")).click();

        driver.findElement(By.xpath("//a[@class='product-card product-card--grid'][1]")).click();

        driver.quit();
    }
}
package br.com.vivo.pageObject;

import br.com.vivo.pageObject.page.PageHome;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CartPageObjectTests {

    private WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @After
    public void tierDown(){
        driver.quit();
    }

    @Test
    public void createCart(){
        PageHome paginaHome = new PageHome(driver);
    }

}

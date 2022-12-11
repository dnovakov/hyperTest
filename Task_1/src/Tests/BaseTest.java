package Tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest {
    
    public WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.gecko.driver", "//Users//davidnovakovic//Desktop//DavidNovakovicProjekat-main//examProjectDavid-main//lib//geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

    }

    @After
    public void teardown(){
        driver.quit();
    }
    
}

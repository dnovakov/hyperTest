package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Pages.LoginPage;

public class LoginTest extends BaseTest {
///varijable
public LoginPage loginPage;
String name = "ddd";
String name1 = "nnn";
String name2 = "ddnn";
String name3 = "aaaa";
String name4 = "dnova2@gmai.com";
String name5 = "1234567";


    @Test

    public void Successful(){

        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.clickOnAddUser();
        loginPage.inputData(name, name1, name2,name3, name4, name5);
        WebElement customerAAA = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/label[1]/input[1]"));
        customerAAA.click();	
        Select fromDropDown = new Select(driver.findElement(By.xpath("//option[contains(text(),'Admin')]")));
        fromDropDown.Select();

        loginPage.clickOnSave();
        loginPage.verifyNewUser(name4);
   }


}

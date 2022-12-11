package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.beust.jcommander.validators.NoValidator;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);}

    String baseURL = "https://www.way2automation.com/angularjs-protractor/webtables/";
//Lokatori
    By addUser = By.xpath("/html/body/table/thead/tr[2]/td/button");
    By firstName = By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input");
    By lastName = By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input");
    By userName = By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input");
    By password = By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input");
    //By customerAAA1 = By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]/input");
    //By customerBBB1 = By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[2]/input");
    By dropDown = By.xpath("//tbody/tr[6]/td[2]/select[1]");
    By email = By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[7]/td[2]/input");
    By phone = By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input");
    By saveButton = By.xpath("/html/body/div[3]/div[3]/button[2]");
    By dnova = By.xpath("//td[contains(text(),'dnova1@gmai.com')]");
    
   
   WebElement customerAAA = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/label[1]/input[1]"));
   WebElement customerBBB = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/label[2]/input[1]"));
//customerAAA.click();	
//customerBBB.click();			
//System.out.println("Radio Button customerAAA Selected");
//System.out.println("Radio Button customerBBB Selected");


///Osnovne Funkcije /// order ne znam da napravim///
    public LoginPage basePage(){    
        driver.get(baseURL);
        return this;}

public LoginPage clickOnAddUser(){
        click(addUser);
        return this;}

    public LoginPage inputData(String name, String name1, String name2,String name3, String name4, String name5){
        writeText(firstName,name);
        writeText(lastName,name1);
        writeText(userName,name2);
        writeText(password,name3);
        writeText(email,name4);
        writeText(phone,name5);
        return this;}

Select fromDropDown = new Select(driver.findElement(By.xpath("//option[contains(text(),'Admin')]")));

public LoginPage clickOnSave(){
    click(saveButton);
    return this;
    }

    public LoginPage verifyNewUser(String confirmationMessage) {
        String actualTitle = readText(dnova);
        assertTextEquals(confirmationMessage, actualTitle);
        return this;
    }


}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.beust.jcommander.validators.NoValidator;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);}

    String baseURL = "https://ultimateqa.com/filling-out-forms/";
//Lokatori
    By goal = By.xpath("/html/body/div[1]/div/div/div/article/div/div[1]/div/div/div[2]/div[2]/div/div/p");
    By submitOnly = By.xpath("/html/body/div[1]/div/div/div/article/div/div[1]/div/div/div[2]/div[2]/div/div[1]/p");
    By name2 = By.id("et_pb_contact_name_1");
    By message2 = By.id("et_pb_contact_message_1");
    By required = By.xpath("/html/body/div[1]/div/div/div/article/div/div[1]/div/div/div[2]/div[2]/div/div[2]/form/div/div/p/input");
    By submit = By.xpath("/html/body/div[1]/div/div/div/article/div/div[1]/div/div/div[2]/div[2]/div/div[2]/form/div/button");
   

///lokatori za nepopunjena polja///
    By textName = By.xpath("/html/body/div[1]/div/div/div/article/div/div[1]/div/div/div[2]/div[2]/div/div[1]/ul[1]/li[1]");
    By textMessage = By.xpath("/html/body/div[1]/div/div/div/article/div/div[1]/div/div/div[2]/div[2]/div/div[1]/ul[1]/li[2]");
    By textCaptcha = By.xpath("/html/body/div[1]/div/div/div/article/div/div[1]/div/div/div[2]/div[2]/div/div[1]/ul[1]/li[3]");
    By textFix = By.className("et_normal_padding");
    By erorrSum = By.xpath("/html/body/div[1]/div/div/div/article/div/div[1]/div/div/div[2]/div[2]/div/div[1]/ul/li");
    
    
///Osnovne Funkcije ///

    public LoginPage basePage(){    
        driver.get(baseURL);
        return this;}

    public LoginPage inputData(String name, String message, String sum){
        writeText(name2,name);
        writeText(message2,message);
        writeText(required,sum);
        return this;}

    public LoginPage clickOnSubmit(){
        click(submit);
        return this;}  
///Uspesno sabmitovanje///
    public LoginPage validateSubmit (){
        waitForElementToBeVisible (goal);
        return this;
        }
///Funkcije ako kliknemo samo sabmit///
public LoginPage validateTextName (){
    waitForElementToBeVisible (textName);
    return this;
    }  
public LoginPage validateTextMessage (){
    waitForElementToBeVisible (textMessage);
    return this;}
public LoginPage validateTextCaptcha (){
    waitForElementToBeVisible (textCaptcha);
    return this; }   
///Ukoliko u 'Captcha' unesemo neprihvatljiv format npr "@" (za Name i message neam ogranicenja u pogledu karaktera i duzine stringova) ///
public LoginPage validateTextFix (){
    waitForElementToBeVisible (textFix);
    return this; } 
///pogresno uneta suma, ista je poruka da li ona bila pogresno uneta, kao netacan zbir ili ukoliko se unese neki neprihvatljiv karakter/// 

    public LoginPage validateErrorSum (){
        waitForElementToBeVisible (erorrSum);
        return this;
        }   
        

///////////////////////
    //By textName = By.xpath("//div[@class='et-pb-contact-message']//li[text()='Name']");
    //By textMessage = By.xpath("//div[@class='et-pb-contact-message']//li[text()='Message']");
    //By textCaptcha = By.xpath("//div[@class='et-pb-contact-message']//li[text()='Captcha']");

//public LoginPage validateName (){
    //waitForElementToBeVisible (textName);
    //return this;
   // }  
      
//public LoginPage validateMessage (){
    //waitForElementToBeVisible (textMessage);
   // return this;
   // }        
//public LoginPage validateSum (){
   // waitForElementToBeVisible (textSum);
   // return this;
   // } 
//public LoginPage validateFix (){
   // waitForElementToBeVisible (textFix);
   // return this;
   // }
    ///public LoginPage inputName (String name){
       /// writeText(name2,name);
        /// return this;
       /// }

       }

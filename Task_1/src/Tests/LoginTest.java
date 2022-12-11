package Tests;

import org.junit.Test;
import Pages.LoginPage;

public class LoginTest extends BaseTest {
///varijable
public LoginPage loginPage;
String name = "a";
String noName = "";
String message = "b";
String noMessage = "";
String sum = "8";  ///// ovo ne znam kako da izdvojim , znao bih u pajtonu
String sumWrong = "@";
String noSum = "";
///uspesno sabmitovanje///
    @Test

    public void Successful(){

        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.inputData(name, message, sum);
        loginPage.clickOnSubmit();
        loginPage.validateSubmit();
   }

///bez da se ista unese klik na submit/// 
    @Test

    public void onlySubmit(){
        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.clickOnSubmit();    
        loginPage.validateTextName();
        loginPage.validateTextMessage();
        loginPage.validateTextCaptcha();
    }
///u polje Captcha uneti "sumWrong=@", polja Name i Message su prazna ///
@Test

public void wrongCharacterCaptcha(){
    loginPage = new LoginPage(driver);
    loginPage.basePage();
    loginPage.inputData(noName, noMessage, sumWrong);
    loginPage.clickOnSubmit();
    loginPage.validateTextName();
    loginPage.validateTextMessage();    
    loginPage.validateTextFix();
}
///u polje Captcha uneti "sumWrong=@" i polje Name popuniti popuniti variajblom 'name' ///
@Test

public void wrongCharacterCaptcha1(){
    loginPage = new LoginPage(driver);
    loginPage.basePage();
    loginPage.inputData(name, noMessage, sumWrong);
    loginPage.clickOnSubmit();
    loginPage.validateTextMessage();    
    loginPage.validateTextFix();
}
///u polje Captcha uneti "sumWrong=@" i polje Message popuniti variajblom 'message'  ///
@Test

public void wrongCharacterCaptcha2(){
    loginPage = new LoginPage(driver);
    loginPage.basePage();
    loginPage.inputData(noName, message, sumWrong);
    loginPage.clickOnSubmit();
    loginPage.validateTextName();    
    loginPage.validateTextFix();
}
///u polje Captcha uneti pogresnu vrednost(da li uneli pogresan broj ili neprihvatljiv karakter, poruka je ista, pa kuristicu varijablu  "sumWrong=@") i polja Name i Message popuniti variajblema 'name' i 'message' ///
@Test

public void wrongCharacterCaptcha3(){
    loginPage = new LoginPage(driver);
    loginPage.basePage();
    loginPage.inputData(name, message, sumWrong);
    loginPage.clickOnSubmit();   
    loginPage.validateErrorSum();
}
////missing Name///
    @Test

    public void missingName(){
        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.inputData(noName, message, sum);
        loginPage.clickOnSubmit();    
        loginPage.validateTextName();
    }
////missing Message///    
    @Test

    public void missingMessage(){
        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.inputData(name, noMessage, sum);
        loginPage.clickOnSubmit();    
        loginPage.validateTextMessage();
    }   
////missing Captchae/// 
    @Test

    public void missingSum(){
        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.inputData(name, message, noSum);
        loginPage.clickOnSubmit();    
        loginPage.validateTextCaptcha();
    }
/// uneto samo NAME ///
    @Test

    public void onlyName(){
        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.inputData(name, noMessage, noSum);
        loginPage.clickOnSubmit();    
        loginPage.validateTextMessage();
        loginPage.validateTextCaptcha();
    }    
/// uneto samo MESSAGE ///
@Test

public void onlyMESSAGE(){
    loginPage = new LoginPage(driver);
    loginPage.basePage();
    loginPage.inputData(noName, message, noSum);
    loginPage.clickOnSubmit(); 
    loginPage.validateTextName(); 
    loginPage.validateTextCaptcha();
}    
/// uneto samo Captcha ///
@Test

public void onlyCaptcha(){
    loginPage = new LoginPage(driver);
    loginPage.basePage();
    loginPage.inputData(noName, noMessage, sum);
    loginPage.clickOnSubmit(); 
    loginPage.validateTextName(); 
    loginPage.validateTextMessage();
}

}

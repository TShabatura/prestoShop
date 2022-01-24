package pageobject;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AuthenticationPage extends BasePage{

    public AuthenticationPage enterCredentials(String email, String password){
        $(By.ByXPath.xpath("//input[@id='email']")).sendKeys(email);
        $(By.ByXPath.xpath("//input[@id='passwd']")).sendKeys(password);
        return this;
    }

    public AuthenticationPage clickLoginBtn(){
        $(By.xpath("//button[@id='SubmitLogin']")).click();
        return this;
    }

    public AuthenticationPage enterEmailToCreateAcc(String email){
        $(By.xpath("//input[@id='email_create']")).sendKeys(email);
        return this;
    }

    public AuthenticationPage clickCreateAnAccountBtn(){
        $(By.ByXPath.xpath("//button[@id='SubmitCreate']")).click();
        return this;
    }
}

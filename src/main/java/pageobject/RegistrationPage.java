package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.json.JsonInput;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    public RegistrationPage fillFirstName(String firstName){
        $(By.ByXPath.xpath("//input[@id='customer_firstname']")).sendKeys(firstName);
        return this;
    }

    public RegistrationPage fillLastName(String lastName){
        $(By.ByXPath.xpath("//input[@id='customer_lastname']")).sendKeys(lastName);
        return this;
    }

    public RegistrationPage chooseGender(String gender){
        if (gender == "male"){
            $(By.ByXPath.xpath("//input[@id = 'id_gender1']")).click();
        }
        else if (gender == "female"){
            $(By.ByXPath.xpath("//input[@id = 'id_gender2']")).click();
        }
        else System.out.println("Wrong gender");
        return this;
    }

    public RegistrationPage fillPassword(String password){
        $(By.ByXPath.xpath("//input[@id='passwd']")).sendKeys(password);
        return this;
    }

    public RegistrationPage fillAddressFirstName(String firstName){
        $(By.ByXPath.xpath("//input[@id='firstname']")).sendKeys(firstName);
        return this;
    }

    public RegistrationPage fillAddressLastName(String lastName){
        $(By.ByXPath.xpath("//input[@id='lastname']")).sendKeys(lastName);
        return this;
    }

    public RegistrationPage fillAddress(String address){
        $(By.ByXPath.xpath("//input[@id='address1']")).sendKeys(address);
        return this;
    }

    public RegistrationPage fillCity(String city){
        $(By.ByXPath.xpath("//input[@id='city']")).sendKeys(city);
        return this;
    }

    public RegistrationPage chooseState(String state){
        $(By.ByXPath.xpath("//select[@id = 'id_state']")).selectOptionContainingText(state);
        return this;
    }

    public RegistrationPage fillPostcode(int postcode){
        $(By.ByXPath.xpath("//input[@id='postcode']")).sendKeys(String.valueOf(postcode));
        return this;
    }

    public RegistrationPage fillPhoneNumber(Long number){
        $(By.ByXPath.xpath("//input[@id='phone_mobile']")).sendKeys(String.valueOf(number));
        return this;
    }

    public RegistrationPage clickRegisterBtn(){
        $(By.xpath("//button[@id = 'submitAccount']")).click();
        return this;
    }
}

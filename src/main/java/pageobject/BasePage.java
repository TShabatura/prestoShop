package pageobject;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasePage {
    public void getHomePage(){
        open("http://automationpractice.com/index.php");
    }

    public void clickSignInBtn(){
        $(By.ByXPath.xpath("//a[@class='login']")).click();
    }
}

import com.codeborne.selenide.Configuration;
import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobject.AuthenticationPage;
import pageobject.RegistrationPage;

public class AuthTests {
    private String email;
    private String passwd = "password";

    @BeforeClass
    public void setup() {
        Configuration.browser = "firefox";
        email = RandomStringUtils.randomAlphanumeric(10) + "@ukr.net";
    }

    @Test
    public void registrationTest() {
        AuthenticationPage authenticationPage = new AuthenticationPage();
        authenticationPage.getHomePage();
        authenticationPage.clickSignInBtn();
        authenticationPage
                .enterEmailToCreateAcc(email)
                .clickCreateAnAccountBtn();
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage
                .chooseGender("male")
                .fillFirstName("name")
                .fillLastName("name")
                .fillPassword(passwd)
                .fillAddressFirstName("name")
                .fillAddressLastName("name")
                .fillAddress("address")
                .fillCity("city")
                .chooseState("Alabama")
                .fillPostcode(97689)
                .fillPhoneNumber(9809776543L)
                .clickRegisterBtn();
    }

    @Test
    public void signInTest() {
        AuthenticationPage authenticationPage = new AuthenticationPage();
        authenticationPage.enterCredentials(email, passwd);
    }
}

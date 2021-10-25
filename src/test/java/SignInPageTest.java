import businessObjects.SignInPageBO;
import org.testng.annotations.Test;

public class SignInPageTest extends BaseTest{
    @Test(description = "Verify error message appears when user logging in with inappropriate credentials.")
    public void verifyErrorMessageAppearsForIncorrectUser() throws InterruptedException {
        new SignInPageBO().proceedToPage("https://www.instagram.com/");
        new SignInPageBO()
                .enterEmail("super@gmail.com")
                .enterPassword("12345hg")
                .pressButton()
                .compareErrorMessage("К сожалению, вы ввели неправильный пароль. Проверьте свой пароль еще раз.");

    }
}

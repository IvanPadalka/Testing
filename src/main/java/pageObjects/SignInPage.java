package pageObjects;

import org.openqa.selenium.By;

public class SignInPage {

    private By userNameField = By.xpath("//input[@name = \"username\"]");

    private By userPasswordField = By.xpath("//input[@name = 'password']");

    private By signInButton = By.xpath("//*[@type='submit']");

    private By errorField = By.xpath("//p[@id=\"slfErrorAlert\"]");

    public By getUserNameField() {
        return userNameField;
    }

    public By getUserPasswordField() {
        return userPasswordField;
    }

    public By getSignInButton() {
        return signInButton;
    }

    public By getErrorField() {
        return errorField;
    }

}

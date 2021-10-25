package businessObjects;

import pageObjects.SignInPage;
import org.apache.log4j.Logger;
import org.testng.Assert;

public class SignInPageBO extends AbstractPageBO{
    private static final Logger LOG = Logger.getLogger(SignInPage.class);
    SignInPage signInPage = new SignInPage();

    public SignInPageBO enterEmail(String email) throws InterruptedException {
        getElement(signInPage.getUserNameField()).sendKeys(email);
        LOG.info("Mail was entered");
        return this;
    }

    public SignInPageBO enterPassword(String password) throws InterruptedException {
        getElement(signInPage.getUserPasswordField()).sendKeys(password);
        LOG.info("Password was entered");
        return this;
    }

    public SignInPageBO pressButton() throws InterruptedException {
        getElement(signInPage.getSignInButton()).click();
        LOG.info("Button was pressed");
        return this;
    }

    public SignInPageBO compareErrorMessage(String error) throws InterruptedException {
        Assert.assertEquals(getElement(signInPage.getErrorField()).getText(),error);
        LOG.info("Error was compared");
        return this;
    }

}

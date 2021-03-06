import consts.Constants;
import driver.DriverFactory;
import org.testng.annotations.*;
import org.testng.log4testng.Logger;

import java.lang.reflect.Method;

public abstract class BaseTest extends DriverFactory {
    private Logger LOG = Logger.getLogger(BaseTest.class);
    private Test test;

    @Parameters({"browserName"})
    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(@Optional(value = Constants.DriverConfigs.CHROME_NAME) final String browserName, Method method){
        initDriver(browserName);
    }
    @AfterMethod(alwaysRun = true)
    public void afterMethod(final Method method){
        LOG.info(String.format("Test '%s' completed", method.getName()));
        quitDriver();
    }

}

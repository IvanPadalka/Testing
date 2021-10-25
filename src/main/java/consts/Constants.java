package consts;

public interface Constants {

    interface DriverConfigs{
        String CHROME_NAME = "webdriver.chrome.driver";
        String FIREFOX_NAME = "webdriver.gecko.driver";
        String EDGE_NAME = "webdriver.edge.driver";

        String CHROME_DRIVER_LOCATION = "src/main/resources/chromedriver.exe";
        String FIREFOX_DRIVER_LOCATION = "";
        String EDGE_DRIVER_LOCATION = "src/main/resources/MicrosoftWebDriver.exe";

        int IMPLICITLY_WAIT_VALUE = 10;

    }
}

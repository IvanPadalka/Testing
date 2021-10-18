import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test_1 {
    @org.testng.annotations.Test
    public void firstTest() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name = \"username\"]")).sendKeys("super@gmail.com");
        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("12345hg");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        Thread.sleep(1000);
        String errorMessage = driver.findElement(By.xpath("//p[@id=\"slfErrorAlert\"]")).getText();
        System.out.println(errorMessage);
        Assert.assertEquals(errorMessage,"К сожалению, вы ввели неправильный пароль. Проверьте свой пароль еще раз.");
    }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Test_Base {
    WebDriver driver;
    @BeforeMethod
    public void open_chrome(){
        driver = new ChromeDriver();
        //how to maximize the screen
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com");
    }
    @AfterMethod
    public void close_chrome() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page extends Page_Base{
    By signuplogin = By.className("fa-lock");

    public Home_Page(WebDriver driver) {
        super(driver);
    }
    public  void click_on_signup(){
        Click_On_button(signuplogin);
    }

}

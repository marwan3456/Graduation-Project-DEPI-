import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signin_page extends Page_Base{
    By valid_email_address = By.name("email");
    By invalid_email_address = By.name("email");
    By empty_email_address = By.name("email");
    By space_in_email_address = By.name("email");
    By upercase_email_address = By.name("email");

    By valid_password = By.name("password");
    By invalid_password = By.name("password");
    By empty_password = By.name("password");
    By space_in_password = By.name("password");

    By login_button = By.className("btn-default");

    public signin_page(WebDriver driver){super(driver);}
    public void valid_email_address(){Enter_text(valid_email_address , "marwan311ahmed@gmail.com");}
    public void invalid_email_address(){Enter_text(invalid_email_address , "marwanahmed@gmail.com");}
    public void empty_email_address(){Enter_text(empty_email_address , "");}
    public void space_in_email_address(){Enter_text(space_in_email_address , "       ");}
    public void upercase_email_address(){Enter_text(upercase_email_address , "MARWAN311AHMED@GMAIL.COM");}

    public void valid_password(){Enter_text(valid_password , "123456");}
    public void invalid_password(){Enter_text(invalid_password , "M3112003$");}
    public void empty_password(){Enter_text(empty_password , "");}
    public void space_in_password(){Enter_text(space_in_password , "       ");}

    public void login_button(){Click_On_button(login_button);}

}


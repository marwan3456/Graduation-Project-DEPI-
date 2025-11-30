import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signup_page extends Page_Base{
    By valid_name = By.xpath("//input[@data-qa='signup-name']");
    By invalid_name = By.xpath("//input[@data-qa='signup-name']");
    By empty_name = By.xpath("//input[@data-qa='signup-name']");
    By space_in_name = By.xpath("//input[@data-qa='signup-name']");
    By sympoled_name = By.xpath("//input[@data-qa='signup-name']");
    By very_long_name = By.xpath("//input[@data-qa='signup-name']");

    By valid_email = By.cssSelector("input[data-qa='signup-email']");
    By invalid_email = By.cssSelector("input[data-qa='signup-email']");
    By empty_email = By.cssSelector("input[data-qa='signup-email']");
    By space_in_email = By.cssSelector("input[data-qa='signup-email']");
    By email_missing_domain = By.cssSelector("input[data-qa='signup-email']");

    By signbutton = By.xpath("//button[@data-qa='signup-button']");


    public signup_page(WebDriver driver) {
        super(driver);
    }

    public void valid_name(){
        Enter_text(valid_name , "Marwan");
    }
    public void invalid_name(){Enter_text(invalid_name , "Maro");}
    public void empty_name(){Enter_text(empty_name , "");}
    public void space_in_name(){Enter_text(space_in_name , "     ");}
    public void sympoled_name(){Enter_text(sympoled_name , "Marwan@#%”");}
    public void very_long_name(){Enter_text(very_long_name , "hdsghdisjgdijshgudhgdksjbgijhsdbgidsbgkjdsbgoihjbdsghfghdfghtrhrthrth");}

    public void valid_email(){Enter_text(valid_email , "marwan311ahmed@gmail.com");}
    public void invalid_email(){Enter_text(invalid_email , "marwanahmed311gmail.com");}
    public void empty_email(){Enter_text(empty_email , "");}
    public void space_in_email(){Enter_text(space_in_email , "     ");}
    public void email_missing_domain(){Enter_text(email_missing_domain , "marwan311");}

    public void signupbutton(){Click_On_button(signbutton);}

}

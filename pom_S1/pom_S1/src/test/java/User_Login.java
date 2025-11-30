import org.testng.annotations.Test;
public class User_Login extends Test_Base{

    @Test (priority = 1)
    public void valid_signin(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signin_page signin = new signin_page(driver);
        signin.valid_email_address();
        signin.valid_password();
        signin.login_button();
    }
    @Test (priority = 2)
    public void invalid_signin(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signin_page signin = new signin_page(driver);
        signin.invalid_email_address();
        signin.invalid_password();
        signin.login_button();
    }
    @Test (priority = 3)
    public void empty_login(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signin_page signin = new signin_page(driver);
        signin.empty_email_address();
        signin.empty_password();
        signin.login_button();
    }
    @Test (priority = 4)
    public void space_only(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signin_page signin = new signin_page(driver);
        signin.space_in_email_address();
        signin.space_in_password();
        signin.login_button();
    }
    @Test (priority = 5)
    public void valid_email_address__invalid_password(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signin_page signin = new signin_page(driver);
        signin.valid_email_address();
        signin.invalid_password();
        signin.login_button();
    }
    @Test (priority = 6)
    public void invalid_email_address__valid_password(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signin_page signin = new signin_page(driver);
        signin.invalid_email_address();
        signin.valid_password();
        signin.login_button();
    }
    @Test (priority = 7)
    public void valid_email__empty_password(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signin_page signin = new signin_page(driver);
        signin.valid_email_address();
        signin.empty_password();
        signin.login_button();
    }
    @Test (priority = 8)
    public void empty_email__valid_password(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signin_page signin = new signin_page(driver);
        signin.empty_email_address();
        signin.valid_password();
        signin.login_button();
    }
    @Test (priority = 9)
    public void spaced_email__valid_password(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signin_page signin = new signin_page(driver);
        signin.space_in_email_address();
        signin.valid_password();
        signin.login_button();
    }
    @Test (priority = 10)
    public void valid_email__spaced_password(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signin_page signin = new signin_page(driver);
        signin.valid_email_address();
        signin.space_in_password();
        signin.login_button();
    }
    @Test (priority = 11)
    public void upercase_email_address_email__valid_password(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signin_page signin = new signin_page(driver);
        signin.upercase_email_address();
        signin.valid_password();
        signin.login_button();
    }

}

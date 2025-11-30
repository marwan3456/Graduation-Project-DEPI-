import org.testng.annotations.Test;

public class User_Register extends Test_Base{

@Test (priority = 1)
    public void valid_signup(){
    Home_Page home = new Home_Page(driver);
    home.click_on_signup();
    signup_page signup = new signup_page(driver);
    signup.valid_name();
    signup.valid_email();
    signup.signupbutton();
}
@Test (priority = 2)
    public void invalid_email_format(){
    Home_Page home = new Home_Page(driver);
    home.click_on_signup();
    signup_page signup = new signup_page(driver);
    signup.invalid_name();
    signup.invalid_email();
    signup.signupbutton();
}
@Test (priority = 3)
    public void empty_fields(){
    Home_Page home = new Home_Page(driver);
    home.click_on_signup();
    signup_page signup = new signup_page(driver);
    signup.empty_name();
    signup.empty_email();
    signup.signupbutton();
}
    @Test (priority = 4)
    public void spaces_only(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signup_page signup = new signup_page(driver);
        signup.space_in_name();
        signup.space_in_email();
        signup.signupbutton();
    }
    @Test (priority = 5)
    public void existing_email(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signup_page signup = new signup_page(driver);
        signup.valid_name();
        signup.valid_email();
        signup.signupbutton();
    }
    @Test (priority = 6)
    public void valid_name__invalid_email(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signup_page signup = new signup_page(driver);
        signup.valid_name();
        signup.invalid_email();
        signup.signupbutton();
    }
    @Test (priority = 7)
    public void invalid_name__valid_email(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signup_page signup = new signup_page(driver);
        signup.invalid_name();
        signup.valid_email();
        signup.signupbutton();
    }
    @Test (priority = 8)
    public void empty_name__valid_email(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signup_page signup = new signup_page(driver);
        signup.empty_name();
        signup.valid_email();
        signup.signupbutton();
    }
    @Test (priority = 9)
    public void valid_name__empty_email(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signup_page signup = new signup_page(driver);
        signup.valid_name();
        signup.empty_email();
        signup.signupbutton();
    }
    @Test (priority = 10)
    public void spaced_name__valid_email(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signup_page signup = new signup_page(driver);
        signup.space_in_name();
        signup.valid_email();
        signup.signupbutton();
    }
    @Test (priority = 11)
    public void valid_name__spaced_email(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signup_page signup = new signup_page(driver);
        signup.valid_name();
        signup.space_in_email();
        signup.signupbutton();
    }
    @Test (priority = 12)
    public void sympoled_name__valid_email(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signup_page signup = new signup_page(driver);
        signup.sympoled_name();
        signup.valid_email();
        signup.signupbutton();
    }
    @Test (priority = 13)
    public void very_long_name__valid_email(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signup_page signup = new signup_page(driver);
        signup.very_long_name();
        signup.valid_email();
        signup.signupbutton();
    }
    @Test (priority = 14)
    public void valid_name__email_missing_domain(){
        Home_Page home = new Home_Page(driver);
        home.click_on_signup();
        signup_page signup = new signup_page(driver);
        signup.valid_name();
        signup.email_missing_domain();
        signup.signupbutton();
    }


}

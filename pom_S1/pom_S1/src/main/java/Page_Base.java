import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page_Base {
    public Page_Base(WebDriver driver){
        this.driver = driver;
    }
    WebDriver driver;

    public Page_Base() {
    }

    public void Enter_text(By elementlocator , String text){
       driver.findElement(elementlocator).sendKeys(text);
    }
    public void Click_On_button(By elementlocator){
        driver.findElement(elementlocator).click();
    }
    public void wait1(By elementlocator){
        new WebDriverWait(driver , Duration.ofSeconds(20))
                .until(ExpectedConditions.presenceOfElementLocated(elementlocator));
    }
    public void Select_by_index(By elementlocator , int index){
        Select select = new Select(driver.findElement(elementlocator));
        select.selectByIndex(index);
    }
    public void Select_by_value(By elementlocator , String value){
        Select select = new Select(driver.findElement(elementlocator));
        select.selectByValue(value);
    }
    public void Select_by_visible(By elementlocator , String visible){
        Select select = new Select(driver.findElement(elementlocator));
        select.selectByVisibleText(visible);
    }




}

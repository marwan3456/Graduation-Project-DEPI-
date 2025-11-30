import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class product_page extends  Page_Base{
    By sreachdress =By.cssSelector("a[href='/category_products/1']");
    By productbutton = By.className("material-icons");
    By plusbuttonwomen = By.cssSelector(".panel-title a[data-toggle='collapse']");
    By Entersearch = By.className("input-lg");
    By searchbutton = By.className("fa-search");
    By filtertops = By.cssSelector("a[href='/category_products/2']");
    By filtersaree = By.cssSelector("a[href='/category_products/7']");
    By filtershirts = By.cssSelector("a[href='/category_products/3']") ;
    By  plusbuttonmen = By.cssSelector("a[href='#Men'] .fa-plus") ;
    By filterjeans = By.cssSelector("a[href='/category_products/6']") ;
    By Plusbuttonkids = By.cssSelector("a[href='#Kids'] .fa-plus") ;
    By fiterkiddress = By.cssSelector("a[href='/category_products/4']") ;
    By Tops_Shirts = By.cssSelector("a[href='/category_products/5']");
    By addtocart =By.xpath( "//a[@ data-product-id='4'and @class='btn btn-default add-to-cart']") ;
    By veiw = By.cssSelector("a[href='/product_details/3']") ;

    public product_page(WebDriver driver){
          super(driver);
      }
      public void clickondressfilter(){
     Click_On_button(sreachdress) ;
      }
    public void clickonproductbutton(){
        Click_On_button(productbutton);
    }
    public void clickonplusbutton(){
        Click_On_button(plusbuttonwomen);
    }
    public void Entersearch(){
        Enter_text(Entersearch , "Dress");
    }
    public void clickonsearchbutton(){
        Click_On_button(searchbutton);
    }
    public void Entersearchinvalid(){
        Enter_text(Entersearch , "space rocket");
    }
    public void upperlatter(){
        Enter_text(Entersearch , "DRESS ");
    }
    public void halfword(){
        Enter_text(Entersearch , "dre ");
    }
    public void spechial(){
        Enter_text(Entersearch , "@#@#$$$@ ");
    }
    public void numbers(){
        Enter_text(Entersearch , "697869 ");
    }
    public void tops(){
        Click_On_button(filtertops);
    }
    public void saree(){
        Click_On_button(filtersaree);
    }
    public void plusbuttonmen1(){
        Click_On_button(plusbuttonmen);
    }
    public void shirts(){
        Click_On_button(filtershirts);
    }
    public void jeans(){
        Click_On_button(filterjeans);
    }
    public void plusbuttonkids1(){
        Click_On_button(Plusbuttonkids);
    }
    public void kidsdress(){
        Click_On_button(fiterkiddress);
    }
    public void TopsAndShirts(){
        Click_On_button(Tops_Shirts);
    }
    public void Addtocart(){
        Click_On_button(addtocart);
    }
    public void viewproduct(){
        Click_On_button(veiw);
    }















}


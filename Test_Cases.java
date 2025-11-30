import org.testng.annotations.Test;

public class Test_Cases extends Test_Base {

    @Test
    public void shaza2(){
        product_page searchpart = new product_page(driver);
        searchpart.clickonproductbutton();
        searchpart.Entersearch();
        searchpart.clickonsearchbutton();
    }
    @Test
    public void invalidshaza2(){
        product_page searchpart = new product_page(driver);
        searchpart.clickonproductbutton();
        searchpart.Entersearchinvalid();
        searchpart.clickonsearchbutton();
    }
    @Test
    public void Upperlatter(){
        product_page searchpart = new product_page(driver);
        searchpart.clickonproductbutton();
        searchpart.upperlatter();
        searchpart.clickonsearchbutton();
    }
    @Test
    public void incomplete(){
        product_page searchpart = new product_page(driver);
        searchpart.clickonproductbutton();
        searchpart.halfword();
        searchpart.clickonsearchbutton();
    }
    @Test
    public void specailcharcter(){
        product_page searchpart = new product_page(driver);
        searchpart.clickonproductbutton();
        searchpart.spechial();
        searchpart.clickonsearchbutton();
    }
    @Test
    public void numberrs(){
        product_page searchpart = new product_page(driver);
        searchpart.clickonproductbutton();
        searchpart.numbers();
        searchpart.clickonsearchbutton();
    }
    @Test
    public void filterdress(){
        product_page filterpart = new product_page(driver);
        filterpart.clickonproductbutton();
        filterpart.clickonplusbutton();
        filterpart.clickondressfilter();
    }
    @Test
    public void filtertop(){
        product_page filterpart = new product_page(driver);
        filterpart.clickonproductbutton();
        filterpart.clickonplusbutton();
        filterpart.tops();
    }
    @Test
    public void filtersaree(){
        product_page filterpart = new product_page(driver);
        filterpart.clickonproductbutton();
        filterpart.clickonplusbutton();
        filterpart.saree();
    }
    @Test
    public void menshirt(){
        product_page filterpart = new product_page(driver);
        filterpart.clickonproductbutton();
        filterpart.plusbuttonmen1();
        filterpart.shirts();
    }
    @Test
    public void menjean(){
        product_page filterpart = new product_page(driver);
        filterpart.clickonproductbutton();
        filterpart.plusbuttonmen1();
        filterpart.jeans();
    }
    @Test
    public void kids(){
        product_page filterpart = new product_page(driver);
        filterpart.clickonproductbutton();
        filterpart.plusbuttonkids1();
        filterpart.kidsdress();
    }
    @Test
    public void topsandshirts(){
        product_page filterpart = new product_page(driver);
        filterpart.clickonproductbutton();
        filterpart.plusbuttonkids1();
        filterpart.TopsAndShirts();
       // filterpart.Addtocart();
    }
    @Test
    public void sreachafterfilter(){
        product_page filterpart = new product_page(driver);
        product_page searchpart = new product_page(driver);
        filterpart.clickonproductbutton();
        filterpart.plusbuttonkids1();
        filterpart.TopsAndShirts();
        searchpart.Entersearchinvalid();
        searchpart.clickonsearchbutton();
    }
    @Test
    public void Switching_Behavior(){
        product_page filterpart = new product_page(driver);
        filterpart.clickonproductbutton();
        filterpart.plusbuttonkids1();
        filterpart.TopsAndShirts();
        filterpart.plusbuttonmen1();
    }
    @Test
    public void verifyproductdetails(){
        product_page filterpart = new product_page(driver);
        filterpart.clickonproductbutton();
        filterpart.clickonplusbutton();
        filterpart.clickondressfilter();
        filterpart.viewproduct();
    }






















}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    By firstProductAdd = By.xpath("(//a[contains(text(),'Add to cart')])[1]");
    By continueBtn = By.xpath("(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[4]");
    By viewCart = By.xpath("//a[@href='/view_cart']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addFirstProductToCart() {
        //click(firstProductAdd);
        moveToEle(firstProductAdd);
       click(viewCart);
    }
}
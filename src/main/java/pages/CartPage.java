package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    By checkoutBtn = By.className("check_out");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void proceedToCheckout() {
        click(checkoutBtn);
    }
}
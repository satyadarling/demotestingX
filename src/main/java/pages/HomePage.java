package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    By loginLink = By.linkText("Signup / Login");
    By Product = By.xpath("//a[contains(text(), 'Products')]");
    By searchBox = By.id("search_product");
    By searchBtn = By.id("submit_search");
    By logoutLink = By.linkText("Logout");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goToLogin() {
        click(loginLink);
    }

    public void searchProduct(String name) {
    	click(Product);
        enterText(searchBox, name);
        click(searchBtn);
    }

    public void logout() {
        click(logoutLink);
    }
}
package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.*;

public class E2ETest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com");
    }

    @Test
    public void testE2E() {
        HomePage home = new HomePage(driver);
        home.goToLogin();

        LoginPage login = new LoginPage(driver);
        login.login("satya1@gmail.com", "satya@");

        home.searchProduct("Tshirt");

        ProductPage product = new ProductPage(driver);
        product.addFirstProductToCart();

        CartPage cart = new CartPage(driver);
        cart.proceedToCheckout();

        home.logout();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
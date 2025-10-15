package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    By email = By.name("email");
    By password = By.name("password");
    By loginBtn = By.xpath("//button[contains(text(),'Login')]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String userEmail, String userPass) {
        enterText(email, userEmail);
        enterText(password, userPass);
        click(loginBtn);
    }
}
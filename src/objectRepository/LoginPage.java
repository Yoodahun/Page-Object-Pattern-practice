package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;
    By username = By.xpath("//*[@id=\"login1\"]");
    By password = By.xpath("//*[@id=\"password\"]");
    By go = By.name("proceed");
    By home = By.xpath("/html/body/div/div[1]/div[1]/div[1]/a");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement emailId() {
        return driver.findElement(username);
    }

    public WebElement password() {
        return driver.findElement(password);
    }
    public WebElement submit() {
        return driver.findElement(go);
    }

    public WebElement home() {
        return driver.findElement(home);
    }
}

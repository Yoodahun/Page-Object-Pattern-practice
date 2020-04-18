package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;
    By shoppingSearchFiled = By.xpath("//*[@id=\"srchword\"]");
    By shoppingSearchButton = By.xpath("//*[@id=\"queryTop\"]/input");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement search() {
        return driver.findElement(shoppingSearchFiled);
    }

    public WebElement searchClick() {
        return driver.findElement(shoppingSearchButton);
    }




}

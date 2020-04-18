package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

    WebDriver driver;
    public LoginPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


//    By username = By.xpath("//*[@id=\"login1\"]");
    @FindBy(xpath = "//*[@id=\"login1\"]")
    WebElement username;

    //    By password = By.xpath("//*[@id=\"password\"]");
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement password;

//    By go = By.name("proceed");
    @FindBy(name = "proceed")
    WebElement go;

//    By home = By.xpath("/html/body/div/div[1]/div[1]/div[1]/a");
    @FindBy(xpath = "/html/body/div/div[1]/div[1]/div[1]/a")
    WebElement home;


    public WebElement getUsername(){
        return username;
    }
    public WebElement getPassword() {
        return password;
    }

    public WebElement getGo() {
        return go;
    }

    public WebElement getHome() {
        return home;
    }
}

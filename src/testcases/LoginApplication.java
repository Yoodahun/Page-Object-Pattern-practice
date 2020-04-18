package testcases;

import objectRepository.HomePage;
import objectRepository.LoginPage;
import objectRepository.LoginPageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class LoginApplication {
    WebDriver driver;

    @Test
    public void Login() {
        System.setProperty("webdriver.chrome.driver", "/Users/yoodahun/Documents/Github/Java/Selenium WebDriver with Java/chromedriver");
        driver = new ChromeDriver();


        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        LoginPage loginPage = new LoginPage(driver);
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);

        loginPageFactory.getUsername().sendKeys("Hello");
        loginPageFactory.getPassword().sendKeys("password");
        loginPageFactory.getGo().click();
        loginPageFactory.getHome().click();

        HomePage homePage = new HomePage(driver);
        homePage.search().sendKeys("Hello");
        homePage.searchClick().click();
    }


    @AfterSuite
    public void exit() {
        driver.quit();
    }

}

package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginApplication {


    @Test
    public void Login() {

        System.setProperty("webdriver.chrome.driver", "/Users/yoodahun/Documents/Github/Java/Selenium WebDriver with Java/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");





    }

}

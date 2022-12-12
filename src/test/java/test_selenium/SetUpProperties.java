package test_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class SetUpProperties {
    public  static WebDriver driver;
    public  static  String  url = "www.https://amazon.com";
    @BeforeTest
    public void  LunchB(String browser){
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();

        }else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();

        }else if (browser.equalsIgnoreCase("edge")){

        }
        driver = new EdgeDriver();

        }
    }




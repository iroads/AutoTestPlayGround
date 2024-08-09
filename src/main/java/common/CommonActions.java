package common;

import generators.TestDataGenerator;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static helpers.Properties.testsProperties;

public class CommonActions {

    public static WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/zhukovsky/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();
        //webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        webDriver.manage().timeouts().implicitlyWait(testsProperties.implicityWait(), TimeUnit.SECONDS);
//        webDriver.manage().timeouts().setScriptTimeout(testsProperties.sriptWaitTimeout(), TimeUnit.SECONDS);
        return webDriver;
    }

}

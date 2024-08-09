package tests.selenium;

import common.CommonActions;
import generators.TestData;
import generators.TestDataGenerator;
import helpers.Properties;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.selenium.BasePageSelenium;
import pages.selenium.PracticeFormPageSelenium;

import java.util.concurrent.TimeUnit;

public class BaseSeleniumTest {

    protected WebDriver driver = CommonActions.createDriver();
    protected TestData testData = testData = TestDataGenerator.getTestData();

    BasePageSelenium basePageSelenium = new BasePageSelenium(driver);
    PracticeFormPageSelenium practiceFormPageSelenium = new PracticeFormPageSelenium(driver);


    @BeforeAll
    public static void  beforeAll() {

    }

    /**
     * Метод закрывает браузер в зависимости от параметра holdBrowserOpen после прохождения каждого теста
     */
    @AfterEach
    public void close() {
        if (!Properties.testsProperties.holdBrowserOpen()) {
            driver.close();
        }
    }
}

package pages.selenium;

import com.codeborne.selenide.WebDriverRunner;
import helpers.Properties;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class BasePageSelenium {

    protected WebDriver driver;

    public BasePageSelenium(WebDriver driver) {
        this.driver = driver;
    }
    @Step("Открытие страницы с {url}")
    public  void open(String url) {
        driver.get(url);
    }

    /**
     * Метод позволяет делать скриншот, там где это необходимо. Скриншот прикрепляется в Allure-отчет.
     */
    @Attachment(value = "Screenshot", type = "image/png", fileExtension = "png")
    public byte[] takeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    /**
     * Метод позволяет делать снимок html кода страницы, там где это необходимо. Снимок прикрепляется в Allure-отчет.
     */
    @Attachment(value = "Page Source", type = "text/html")
    public String takePageSource() {
        return driver.getPageSource();
    }

    //Инкапсуляция логики ожиданий
    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(Properties.testsProperties.explicitWait())).until(visibilityOf(element));
        return element;
    }



}

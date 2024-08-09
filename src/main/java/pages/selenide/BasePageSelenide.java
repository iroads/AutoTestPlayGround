package pages.selenide;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.Selenide.open;

public class BasePageSelenide {

    @Step("Открытие страницы с {url}")
    public void openPage(String url) {
        open(url);
    }

    /**
     * Метод позволяет делать скриншот, там где это необходимо. Скриншот прикрепляется в Allure-отчет.
     */
    @Attachment(value = "Screenshot", type = "image/png", fileExtension = "png")
    public byte[] takeScreenshot() {
        return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }

    /**
     * Метод позволяет делать снимок html кода страницы, там где это необходимо. Снимок прикрепляется в Allure-отчет.
     */
    @Attachment(value = "Page Source", type = "text/html")
    public String takePageSource() {
        return WebDriverRunner.getWebDriver().getPageSource();
    }
}

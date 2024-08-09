package tests.selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import generators.TestData;
import generators.TestDataGenerator;
import helpers.Properties;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import pages.selenide.BasePageSelenide;
import pages.selenide.PracticeFormPageSelenide;

public class BaseSelenideTest {

    protected static TestData testData;
    protected PracticeFormPageSelenide practiceFormPage = new PracticeFormPageSelenide();
    protected BasePageSelenide basePageSelenide = new BasePageSelenide();

    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = Properties.testsProperties.baseUrl();
        Configuration.browserSize = "1920x1080";
        //Позволяет не закрывать браузер после прохождения теста
        Configuration.holdBrowserOpen = true;
        //Можно установить, чтобы не дожидаться загрузки страницы и сразу начинать работать с элементами
        Configuration.pageLoadStrategy = "eager";
        //Configuration.pageLoadTimeout = 30;
        //Используется для быстрого заполнения полей
        //Configuration.fastSetValue = true;
        testData = TestDataGenerator.getTestData();

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
                //.screenshots(true).savePageSource(true));
    }

}

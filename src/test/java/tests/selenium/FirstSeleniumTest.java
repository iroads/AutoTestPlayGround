package tests.selenium;

import helpers.Properties;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.selenium.PracticeFormPageSelenium;

public class FirstSeleniumTest extends BaseSeleniumTest {

    String firstName = testData.getPracticeForm().getFirstName();
    String lastName = testData.getPracticeForm().getLastName();
    String email = testData.getPracticeForm().getEmail();
    String gender = testData.getPracticeForm().getGender();

    @Feature("Учебные тесты на Selenium")
    @DisplayName("Тест заполнение формы регистрации пользователя")
    @Test
    void firstSeleniumTest() {

        basePageSelenium.open(Properties.testsProperties.baseUrl() + Properties.testsProperties.practiceFormUrl());

        practiceFormPageSelenium
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .enterEmail(email)
                .selectGender(gender);
    }

}

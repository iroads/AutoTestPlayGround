package pages.selenide;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormPageSelenide extends BasePageSelenide{

    private static final String PRACTICE_FORM_PAGE_URL = "/automation-practice-form";

    private final SelenideElement firstNameInput = $("#firstName");
    private final SelenideElement lastNameInput = $("#lastName");
    private final SelenideElement emailInput = $("#userEmail");
    private final SelenideElement genderWrapper = $("#genterWrapper");

    @Step("Ввод имени пользователя {firstName}")
    public PracticeFormPageSelenide enterFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
        return this;
    }

    @Step("Ввод фамилии пользователя {lastName}")
    public PracticeFormPageSelenide enterLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
        takeScreenshot();
        takePageSource();
        return this;
    }

    @Step("Ввод адреса электронной почты {email}")
    public PracticeFormPageSelenide enterEmail(String email) {
        emailInput.sendKeys(email);
        return this;
    }

    @Step("Выбор пола {gender}")
    public PracticeFormPageSelenide selectGender(String gender) {
        genderWrapper.$(Selectors.byText(gender)).click();
        return this;
    }
}

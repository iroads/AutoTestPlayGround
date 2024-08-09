package pages.selenium;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPageSelenium extends BasePageSelenium {

    private final By firstNameInput = By.xpath("//input[@id='firstName']");
    private final By lastNameInput = By.xpath("//input[@id='lastName']");
    private final By emailInput = By.xpath("//input[@id='userEmail']");
    private final By genderWrapper = By.xpath("//*[@id='genterWrapper']");

    public PracticeFormPageSelenium(WebDriver driver) {
        super(driver);
    }

    @Step("Ввод имени пользователя {firstName}")
    public PracticeFormPageSelenium enterFirstName(String firstName) {
        WebElement element = driver.findElement(firstNameInput);
        waitElementIsVisible(element);
        element.click();
        element.clear();
        element.sendKeys(firstName);
        return this;
    }

    @Step("Ввод фамилии пользователя {lastName}")
    public PracticeFormPageSelenium enterLastName(String lastName) {
        WebElement element = driver.findElement(lastNameInput);
        waitElementIsVisible(element);
        element.click();
        element.sendKeys(lastName);
        takeScreenshot();
        takePageSource();
        return this;
    }

    @Step("Ввод адреса электронной почты {email}")
    public PracticeFormPageSelenium enterEmail(String email) {
        WebElement element = driver.findElement(emailInput);
        waitElementIsVisible(element);
        element.click();
        element.clear();
        element.sendKeys(email);
        takeScreenshot();
        return this;
    }

    @Step("Выбор пола {gender}")
    public PracticeFormPageSelenium selectGender(String gender) {
        WebElement element = driver.findElement(genderWrapper)
                .findElement(By.xpath(".//*[contains(text(), '" + gender + "')]"));
        waitElementIsVisible(element);
        element.click();
        return this;
    }


}

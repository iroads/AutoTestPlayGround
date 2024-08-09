package tests.selenide;

import helpers.Properties;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.selenide.PracticeFormPageSelenide;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstSelenideTest extends BaseSelenideTest{

    PracticeFormPageSelenide practiceFormPage = new PracticeFormPageSelenide();
    String firstName = testData.getPracticeForm().getFirstName();
    String lastName = testData.getPracticeForm().getLastName();
    String email = testData.getPracticeForm().getEmail();
    String gender = testData.getPracticeForm().getGender();


    @Feature("Учебные тесты на Selenide")
    @DisplayName("Тест заполнение формы регистрации пользователя")
    @Test
    void firstSelenideTest() {
        basePageSelenide.openPage(Properties.testsProperties.practiceFormUrl());
        practiceFormPage
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .enterEmail(email)
                .selectGender(gender);
    }

//    @Test
//    void successfulRegistrationTest(){
//        String firstName = "Alex";
//        String lastName = "Silver";
//        String userEmail = "alexsilver@gmail.com";
//        String userNumber = "1234567890";
//        String currentAddress = "123 Main Street";
//
//        open("/automation-practice-form");
//
//        //После открытия страницы, желательно проверить какой нибудь заголовок расположенный на ней,
//        // чтобы удостовериться что открылась нужная страница
//
//        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
//
//        $("#firstName").setValue(firstName);
//        $("#lastName").setValue(lastName);
//        $("#userEmail").setValue(userEmail);
//        $("#userNumber").setValue(userNumber);
//        $("#currentAddress").setValue(currentAddress);
//
//        //Хороший способ клика на радиобаттоне
//        //$("#gender-radio-2").parent().click();
//        //Еще один, но не очень хороший способ найти по тексту,
//        // он неуниверсальный из за возможной смены языка
//        //$(byText("Other")).click();
//        //так лучше
//        $("#genterWrapper").$(byText("Other")).click();
//        //Или так
//        //$("label[for=gender-radio-1]").click();
//
//        //Работаем с выбором даты
//        $(".react-datepicker__input-container").click();
//        $(".react-datepicker__month-select").selectOption("July");
//        $(".react-datepicker__year-select").selectOption("2023");
//        $( ".react-datepicker__day--030:not(.react-datepicker__day--outside-month)").click();
//        //$(".react-datepicker__month-select").selectOptionByValue("6");
//        $("#subjectsInput").setValue("Maths").pressEnter();
//
//        $("#hobbiesWrapper").$(byText("Music")).click();
//
//        //загрузка файла
//        //метод uploadFile работает только для элементов с атрибутом type=file
//        //$("uploadPicture").uploadFile(new File("src/test/resources/picture.jpg"));
//        $("#uploadPicture").uploadFromClasspath("picture.jpg");
//
//        $("#state").click();
//        $("#stateCity-wrapper").$(byText("NCR")).click();
//
//        $("#city").click();
//        $("#stateCity-wrapper").$(byText("Delhi")).click();
//        //можно удалять элементы при помощи javaScriptExecutor
//        //Selenide.executeJavaScript("$('#fixedban').remove()");
//        $("#submit").click();
//
//        $(".modal-dialog").should(appear);
//        $("#example-modal-sizes-title-lg").shouldHave(Condition.text("Thanks for submitting the form"));
//        $(".table-responsive").shouldHave(Condition.text("alexsilver@gmail.com"));
//
//
//
//
//
//    }

}

package generators;

import com.github.javafaker.Faker;
import forms.PracticeForm;
import org.apache.commons.lang3.RandomStringUtils;

public class TestDataGenerator {

    private static final Faker faker = new Faker();

    public static TestData getTestData() {
        return TestData.builder().practiceForm(PracticeForm.builder()
                        .firstName(faker.name().firstName())
                        .lastName(faker.name().firstName())
                        .email(faker.internet().emailAddress())
                        .gender(RandomEnumGenerator.generateEnumValue(PracticeForm.Gender.class).getText())
                        .build())
                .build();
    }
}

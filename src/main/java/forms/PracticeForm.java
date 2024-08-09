package forms;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PracticeForm {

    private String firstName;
    private String lastName;
    private String email;
    private String gender;


    public enum Gender {

        MALE("Male"),
        FEMALE("Female"),
        OTHER("Other");

        private final String text;

        Gender(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
}

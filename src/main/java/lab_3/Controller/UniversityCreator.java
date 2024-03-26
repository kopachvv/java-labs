package lab_3.Controller;

import lab_3.Model.Human;
import lab_3.Model.University;

public class UniversityCreator {
    public static University createUniversity(String name, Human head) {
        return new University(name, head);
    }
}

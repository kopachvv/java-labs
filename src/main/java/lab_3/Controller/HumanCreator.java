package lab_3.Controller;

import lab_3.Model.Human;
import lab_3.Model.Sex;

public class HumanCreator {
    public static Human createHuman(String firstName, String lastName, String patronymic, Sex sex){
        return new Human(firstName, lastName, patronymic, sex) {};
    }
}

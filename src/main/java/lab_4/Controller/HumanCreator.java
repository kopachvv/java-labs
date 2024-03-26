package lab_4.Controller;

import lab_4.Model.Human;
import lab_4.Model.Sex;

public class HumanCreator {
    public static Human createHuman(String firstName, String lastName, String patronymic, Sex sex){
        return new Human(firstName, lastName, patronymic, sex) {};
    }
}

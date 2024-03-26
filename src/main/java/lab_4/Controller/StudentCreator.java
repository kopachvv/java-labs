package lab_4.Controller;

import lab_4.Model.Group;
import lab_4.Model.Sex;
import lab_4.Model.Student;

public class StudentCreator {
    public static Student createStudent(String firstName, String lastName, String patronymic, Sex sex, Group group){
        return new Student(firstName, lastName, patronymic, sex, group);
    }
}

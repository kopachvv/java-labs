package lab_3.Controller;

import lab_3.Model.Group;
import lab_3.Model.Sex;
import lab_3.Model.Student;

public class StudentCreator {
    public static Student createStudent(String firstName, String lastName, String patronymic, Sex sex, Group group){
        return new Student(firstName, lastName, patronymic, sex, group);
    }
}

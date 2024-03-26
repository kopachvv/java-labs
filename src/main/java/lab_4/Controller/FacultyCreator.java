package lab_4.Controller;

import lab_4.Model.Faculty;
import lab_4.Model.Human;

public class FacultyCreator {
    public static Faculty createFaculty(String name, Human head){
        return new Faculty(name, head);
    }
}

package lab_3.Controller;

import lab_3.Model.Faculty;
import lab_3.Model.Human;

public class FacultyCreator {
    public static Faculty createFaculty(String name, Human head){
        return new Faculty(name, head);
    }
}

package lab_4.Controller;

import lab_4.Model.Department;
import lab_4.Model.Human;

public class DepartmentCreator {
    public static Department createDepartment(String name, Human head){
        return new Department(name, head);
    }
}

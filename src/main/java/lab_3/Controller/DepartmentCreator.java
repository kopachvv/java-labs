package lab_3.Controller;

import lab_3.Model.Department;
import lab_3.Model.Human;

public class DepartmentCreator {
    public static Department createDepartment(String name, Human head){
        return new Department(name, head);
    }
}

package lab_3.Model;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private Human head;
    private List<Department> departments;

    public Faculty() {
    }

    public Faculty(String name, Human head) {
        this.name = name;
        this.head = head;
        departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department department){
        departments.add(department);
    }

    @Override
    public String toString() {
        return "Faculty{" + name + ", " + head + '}';
    }
}

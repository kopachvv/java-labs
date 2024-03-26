package lab_3.Model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Human head;
    private List<Group> groups;

    public Department() {
    }

    public Department(String name, Human head) {
        this.name = name;
        this.head = head;
        groups = new ArrayList<>();
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

    public List<Group> getGroups() {
        return groups;
    }

    public void addGroup(Group group){
        groups.add(group);
    }

    @Override
    public String toString() {
        return "Department{" + name + ", " + head + '}';
    }
}

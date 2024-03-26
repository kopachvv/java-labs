package lab_3.Controller;

import lab_3.Model.Group;
import lab_3.Model.Human;

public class GroupCreator {
    public static Group createGroup(String name, Human head){
        return new Group(name, head);
    }
}

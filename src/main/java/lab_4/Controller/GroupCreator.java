package lab_4.Controller;

import lab_4.Model.Group;
import lab_4.Model.Human;

public class GroupCreator {
    public static Group createGroup(String name, Human head){
        return new Group(name, head);
    }
}

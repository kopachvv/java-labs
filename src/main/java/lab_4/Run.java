package lab_4;

import lab_4.Controller.*;
import lab_4.Model.*;
import lab_4.View.GsonParser;

public class Run {
    public static void main(String[] args) {
        createTypicalUniversity();
    }

    public static void createTypicalUniversity() {
        University university = UniversityCreator.createUniversity("НТУ \"Дніпровська політехніка\"",
                HumanCreator.createHuman("Олександр", "Азюковський", "Олександрович", Sex.MALE));
        Faculty faculty = FacultyCreator.createFaculty("Факультет інформаційниї технологій",
                HumanCreator.createHuman("Ірина", "Удовик", "Михайлівна", Sex.FEMALE));
        university.addFaculty(faculty);
        Department department = DepartmentCreator.createDepartment("Кафедра безпеки інформації та телекомунікцій",
                HumanCreator.createHuman("Валерій", "Корнієнко", "Іванович", Sex.MALE));
        faculty.addDepartment(department);

        Human head = HumanCreator.createHuman("Ілля", "Олішевський", "Генадійович", Sex.MALE);
        Group group1 = GroupCreator.createGroup("125-20-1", head);
        Group group2 = GroupCreator.createGroup("125-20-2", head);
        Group group3 = GroupCreator.createGroup("125-20-3", head);
        department.addGroup(group1);
        department.addGroup(group2);
        department.addGroup(group3);

        Student student11 = StudentCreator.createStudent("Вікторія", "Копач", "Владиславівна",
                Sex.FEMALE, group1);
        Student student12 = StudentCreator.createStudent("Марія", "Чурсина", "Кирилівна",
                Sex.FEMALE, group1);
        Student student13 = StudentCreator.createStudent("Катерина", "Середняк", "Олександрівна",
                Sex.FEMALE, group1);
        Student student21 = StudentCreator.createStudent("Андрій", "Корнєв", "Дмитрович",
                Sex.MALE, group2);
        Student student22 = StudentCreator.createStudent("Максим", "Дзядек", "іванович",
                Sex.MALE, group2);
        Student student31 = StudentCreator.createStudent("Діана", "Гречук", "Вадимівна",
                Sex.FEMALE, group3);
        Student student32 = StudentCreator.createStudent("Нікіта", "Чекушкін", "Дмитрович",
                Sex.MALE, group3);
        group1.addStudent(student11);
        group1.addStudent(student12);
        group1.addStudent(student13);
        group2.addStudent(student21);
        group2.addStudent(student22);
        group3.addStudent(student31);
        group3.addStudent(student32);

        GsonParser.writeJson(university);
        System.out.println(university.equals(GsonParser.readJson()));
    }
}

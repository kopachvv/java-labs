package lab_4.View;

import lab_4.Controller.*;
import lab_4.Model.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GsonParserTest {
    @Test
    public void parseUniversity(){
        University oldUniversity = UniversityCreator.createUniversity("НТУ \"Дніпровська політехніка\"",
                HumanCreator.createHuman("Олександр", "Азюковський", "Олександрович", Sex.MALE));
        Faculty faculty1 = FacultyCreator.createFaculty("Факультет інформаційних технологій",
                HumanCreator.createHuman("Ірина", "Удовик", "Михайлівна", Sex.FEMALE));
        Faculty faculty2 = FacultyCreator.createFaculty("Фінансово-економічний факультет",
                HumanCreator.createHuman("Катерина", "Пілова", "Петрівна", Sex.FEMALE));
        oldUniversity.addFaculty(faculty1);
        oldUniversity.addFaculty(faculty2);

        Department department1 = DepartmentCreator.createDepartment("Кафедра безпеки інформації та телекомунікацій",
                HumanCreator.createHuman("Валерій", "Корнієнко", "Іванович", Sex.MALE));
        Department department2 = DepartmentCreator.createDepartment("Кафедра програмного забезпечення комп'ютерних систем",
                HumanCreator.createHuman("Михайло", "Алексєєв", "Олександрович", Sex.MALE));
        Department department3 = DepartmentCreator.createDepartment("Кафедра економічного аналізу та фінансів",
                HumanCreator.createHuman("Дар’я", "Букреєва", "Сергіївна", Sex.FEMALE));
        Department department4 = DepartmentCreator.createDepartment("Кафедра маркетингу",
                HumanCreator.createHuman("Сергій", "Касян", "Якович", Sex.MALE));
        faculty1.addDepartment(department1);
        faculty1.addDepartment(department2);
        faculty2.addDepartment(department3);
        faculty2.addDepartment(department4);

        Group group1 = GroupCreator.createGroup("125-20-1",
                HumanCreator.createHuman("Ілля", "Олішевський", "Генадійович", Sex.MALE));
        Group group2 = GroupCreator.createGroup("125-20-2",
                HumanCreator.createHuman("Ілля", "Олішевський", "Генадійович", Sex.MALE));
        Group group3 = GroupCreator.createGroup("122-21-1",
                HumanCreator.createHuman("Андрій", "Мартиненко", "Анатолійович", Sex.MALE));
        Group group4 = GroupCreator.createGroup("121-22-1",
                HumanCreator.createHuman("Андрій", "Мартиненко", "Анатолійович", Sex.MALE));
        Group group5 = GroupCreator.createGroup("072-23-1",
                HumanCreator.createHuman("В’ячеслав", "Дереза", "Миколайович", Sex.MALE));
        Group group6 = GroupCreator.createGroup("072м-22-1",
                HumanCreator.createHuman("Людмила", "Соляник", "Григорівна", Sex.FEMALE));
        Group group7 = GroupCreator.createGroup("075-21-1",
                HumanCreator.createHuman("Ірина", "Магеррамова", "Анатоліївна", Sex.FEMALE));
        Group group8 = GroupCreator.createGroup("075-21-2",
                HumanCreator.createHuman("Ірина", "Магеррамова", "Анатоліївна", Sex.FEMALE));
        department1.addGroup(group1);
        department1.addGroup(group2);
        department2.addGroup(group3);
        department2.addGroup(group4);
        department3.addGroup(group5);
        department3.addGroup(group6);
        department4.addGroup(group7);
        department4.addGroup(group8);

        Student student1 = StudentCreator.createStudent("Вікторія", "Копач",
                "Владиславівна", Sex.FEMALE, group1);
        Student student2 = StudentCreator.createStudent("Марія", "Чурсина",
                "Кирилівна", Sex.FEMALE, group1);
        Student student3 = StudentCreator.createStudent("Андрій", "Корнєв",
                "Дмитрович", Sex.MALE, group2);
        Student student4 = StudentCreator.createStudent("Максим", "Дзядек",
                "іванович", Sex.MALE, group2);
        Student student5 = StudentCreator.createStudent("Мальвіна", "Чукля",
                "Олександрівна", Sex.FEMALE, group3);
        Student student6 = StudentCreator.createStudent("Дмитро", "Сукач",
                "Анатолійович", Sex.MALE, group3);
        Student student7 = StudentCreator.createStudent("Єгор", "Гриць",
                "Богданович", Sex.MALE, group4);
        Student student8 = StudentCreator.createStudent("Олександр", "Світиш",
                "Микитович", Sex.MALE, group4);
        Student student9 = StudentCreator.createStudent("Олеся", "Любімова",
                "Віталіївна", Sex.FEMALE, group5);
        Student student10 = StudentCreator.createStudent("Катерина", "Брунько",
                "Федірівна", Sex.FEMALE, group5);
        Student student11 = StudentCreator.createStudent("Ян", "Шульга",
                "Едуардович", Sex.MALE, group6);
        Student student12 = StudentCreator.createStudent("Юлія", "Забудько",
                "Петрівна", Sex.FEMALE, group6);
        Student student13 = StudentCreator.createStudent("Богдан", "Щока",
                "Володимирович", Sex.MALE, group7);
        Student student14 = StudentCreator.createStudent("Олег", "Авсюк",
                "Сергійович", Sex.MALE, group7);
        Student student15 = StudentCreator.createStudent("Евгенія", "Олексюк",
                "Іванівна", Sex.FEMALE, group8);
        Student student16 = StudentCreator.createStudent("Микола", "Фомич",
                "Олегович", Sex.MALE, group8);
        group1.addStudent(student1);
        group1.addStudent(student2);
        group2.addStudent(student3);
        group2.addStudent(student4);
        group3.addStudent(student5);
        group3.addStudent(student6);
        group4.addStudent(student7);
        group4.addStudent(student8);
        group5.addStudent(student9);
        group5.addStudent(student10);
        group6.addStudent(student11);
        group6.addStudent(student12);
        group7.addStudent(student13);
        group7.addStudent(student14);
        group8.addStudent(student15);
        group8.addStudent(student16);

        GsonParser.writeJson(oldUniversity);
        University newUniversity = GsonParser.readJson();

        assertEquals(oldUniversity, newUniversity);
    }
}
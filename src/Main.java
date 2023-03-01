import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        Student student1 = new Student();
        student.setFullName("Abduvokhob uulu Matmusa");
        student.setLocalDate(LocalDate.of(2001, 10, 12));
        student.setPochta("Abduvokhobuulu@gmail.com");

        student1.setFullName("Akunov Abdumomyn");
        student1.setLocalDate(LocalDate.of(2004, 12, 12));
        student1.setPochta("Akunov@gmail.com");
        Student[] students = {student, student1};

        Group group = new Group();
        Group group1 = new Group();
        group.setGroupName("Programirovanie");
        group.setLocalDate(LocalDate.of(2022, 11, 1));
        group.setStudents(students);
        group1.setGroupName("Programirovanie");
        group1.setLocalDate(LocalDate.of(2022, 11, 1));
        group1.setStudents(students );
        Group[] groups = {group, group1};

        Cours cours = new Cours();
        cours.setCoursName("Java");
        cours.setCoursNumber(9);
        cours.setCoursMentorName("Ulan Kubanychbekov");
        cours.setGroups(cours.getGroups());
        cours.setGroups(groups);


        Cours cours1 = new Cours();
        cours1.setCoursName("Js");
        cours1.setCoursNumber(9);
        cours1.setCoursMentorName("Marat Samatov");

        System.out.println(cours.toString());
      //  System.out.println(cours1.toString());
    }
}
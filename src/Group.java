import java.time.LocalDate;
import java.util.Arrays;

public class Group {

    private String groupName;

    private LocalDate localDate;
    private Student[] students;


    public Group(String groupName, LocalDate localDate, Student[] students) {
        this.groupName = groupName;
        this.localDate = localDate;
        this.students = students;
    }

    public Group() {
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Student[] getStudents() {
        return students;
    }


    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "\ngroupName='" + groupName + '\'' +
                ",\n localDate=" + localDate +
                ",\n students=" + Arrays.toString(students) +
                '}';
    }
}

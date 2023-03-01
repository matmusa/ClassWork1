import java.util.Arrays;

public class Cours {

    private String coursName;
    private int coursNumber;

    private String coursMentorName;

   private Group[] groups;

    public Cours() {
    }

    public Cours(String coursName, int coursNumber, String coursMentorName, Group[] groups) {
        this.coursName = coursName;
        this.coursNumber = coursNumber;
        this.coursMentorName = coursMentorName;
        this.groups = groups;
    }

    public String getCoursName() {
        return coursName;
    }

    public void setCoursName(String coursName) {
        this.coursName = coursName;
    }

    public int getCoursNumber() {
        return coursNumber;
    }

    public void setCoursNumber(int coursNumber) {
        this.coursNumber = coursNumber;
    }

    public String getCoursMentorName() {
        return coursMentorName;
    }

    public void setCoursMentorName(String coursMentorName) {
        this.coursMentorName = coursMentorName;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Cours{" +
                "\ncoursName='" + coursName + '\'' +
                ",\n coursNumber=" + coursNumber +
                ",\n coursMentorName='" + coursMentorName + '\'' +
                ",\n groups=" + Arrays.toString(groups) +
                '}';
    }
}

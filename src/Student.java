import java.time.LocalDate;
import java.time.Period;

public class Student {

    private String fullName;
    private LocalDate localDate;
    private String pochta;
    private int age;

    public Student() {
    }

    public Student(String fullName, LocalDate localDate, String pochta) {
        this.fullName = fullName;
        this.localDate = localDate;
        this.pochta = pochta;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.age = Period.between(localDate, LocalDate.now()).getYears();
    }

    public String getPochta() {
        return pochta;
    }

    public void setPochta(String pochta) {
        this.pochta = pochta;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "\nfullName='" + fullName + '\'' +
                ",\n localDate=" + age +
                ",\n pochta='" + pochta + '\'' +
                '}';
    }
}
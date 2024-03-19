import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Student {
    public String name;
    private LocalDate dateOfBirth;

    public void setStudentName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.dateOfBirth = LocalDate.parse(dateOfBirth, formatter);
    }

    public void displayAge() {
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(dateOfBirth, currentDate).getYears();
        System.out.println("Age of the Student is: " + age);
    }

    public void displayStudentName() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentName("Mohan");
        student.setDateOfBirth("25-01-2000");
        student.displayStudentName();
        student.displayAge();
    }
}
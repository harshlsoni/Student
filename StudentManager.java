// StudentManager.java
import java.util.*;

public class StudentManager {
    private List<Student> students;  // ArrayList to store Student objects

    public StudentManager() {
        students = new ArrayList<>();
    }

// Function to add a new student
public void addStudent(Scanner scanner) {
    System.out.print("Enter PRN: ");
    String prn = scanner.nextLine();
    System.out.print("Enter Name: ");
    String name = scanner.nextLine();
    System.out.print("Enter DOB (DD/MM/YYYY): ");
    String dob = scanner.nextLine();
    System.out.print("Enter Marks: ");
    double marks = scanner.nextDouble();
    scanner.nextLine();  // Consume newline

    students.add(new Student(prn, name, dob, marks));
    System.out.println("Student added successfully!");
    }

    // Function to display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }


    // Function to search student by PRN
    public void searchByPRN(Scanner scanner) {
        System.out.print("Enter PRN to search: ");
        String prn = scanner.nextLine();
        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                System.out.println("Student Found: " + student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

}
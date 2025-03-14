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

    // Function to search student by Name
    public void searchByName(Scanner scanner) {
        System.out.print("Enter Name to search: ");
        String name = scanner.nextLine();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Student Found: " + student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Function to search student by Name
    public void searchByName(Scanner scanner) {
        System.out.print("Enter Name to search: ");
        String name = scanner.nextLine();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Student Found: " + student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Function to search student by Position
    public void searchByPosition(Scanner scanner) {
        System.out.print("Enter position (index) to search: ");
        int index = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        if (index >= 0 && index < students.size()) {
            System.out.println("Student Found: " + students.get(index));
        } else {
            System.out.println("Invalid position.");
        }
    }

        // Function to update student details
    public void updateStudent(Scanner scanner) {
        System.out.print("Enter PRN to update: ");
        String prn = scanner.nextLine();
        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                System.out.print("Enter new Name: ");
                student.setName(scanner.nextLine());
                System.out.print("Enter new DOB: ");
                student.setDob(scanner.nextLine());
                System.out.print("Enter new Marks: ");
                student.setMarks(scanner.nextDouble());
                scanner.nextLine();  // Consume newline
                System.out.println("Student details updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Function to delete a student by PRN
    public void deleteStudent(Scanner scanner) {
        System.out.print("Enter PRN to delete: ");
        String prn = scanner.nextLine();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getPrn().equals(prn)) {
                iterator.remove();
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}


}
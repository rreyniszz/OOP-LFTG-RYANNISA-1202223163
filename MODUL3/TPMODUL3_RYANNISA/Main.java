import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static String[][] courses = {
            { "101", "Statistika Industri", "Haris", "Metta" },
            { "102", "Desain Jaringan Komputer", "Windy", "Amilia" }
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();

            System.out.print("Enter student ID: ");
            int studentID = scanner.nextInt();
            scanner.nextLine();

            Student student = new Student(studentName, studentID);

            System.out.print("Enter courses to enroll in (separated by commas): ");
            String coursesInput = scanner.nextLine();
            String[] studentCourses = coursesInput.split(", ");

            for (String course : studentCourses) {
                student.enrollInCourse(course);
            }

            System.out.println("\n" + student.getUserDetails());

            System.out.println("\nCourse Information:");
            for (String[] course : courses) {
                System.out.println("Course ID: " + course[0]);
                System.out.println("Course Name: " + course[1]);
                System.out.println("Instructors: " + course[2] + ", " + course[3]);
                System.out.println("- Students: " + course[2]);
                System.out.println("- Students:  " + course[3]);
                System.out.println();
            }
            System.out.println("Student - Name:" + studentName + " ID: " + studentID);
            System.out.println("Enrolled Courses:" + Arrays.toString(studentCourses));
            System.out.println("\nPak Yoga Raditya is teaching Math ");
            System.out.println("Hudza is managing in Telkom University");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer for student ID.");
        } finally {
            scanner.close();
        }
    }
}
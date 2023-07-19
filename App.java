// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Student {
    String name;
    int subject1;
    int subject2;
    int subject3;

    public Student(String name, int subject1, int subject2, int subject3) {
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Subject 1: " + subject1);
        System.out.println("Subject 2: " + subject2);
        System.out.println("Subject 3: " + subject3);
    }
}
class StudentDataEntry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[10];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter data for student " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Subject 1: ");
            int subject1 = scanner.nextInt();

            System.out.print("Subject 2: ");
            int subject2 = scanner.nextInt();

            System.out.print("Subject 3: ");
            int subject3 = scanner.nextInt();
            System.out.println();
        }

        // Display the entered data
        System.out.println("Entered student data:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Student " + (i + 1) + ":");
            students[i].display();
            System.out.println();
        }
    }
}

import java.util.*;

class Student {
    String name;
    int subject1;
    int subject2;
    int subject3;
    int total;

    public Student(String name, int subject1, int subject2, int subject3) {
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.total = subject1 + subject2 + subject3;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Subject 1: " + subject1);
        System.out.println("Subject 2: " + subject2);
        System.out.println("Subject 3: " + subject3);
        System.out.println("Total: " + total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[2];

        for (int i = 0; i < 2; i++) {
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
            students[i] = new Student(name, subject1, subject2, subject3);
        }

        int[] arr = new int[2];
        for (int i = 0; i < 2; i++) {
            arr[i] = students[i].total;
        }

        int index = 0;
        int max = arr[0];
        for (int i = 1; i < 2; i++) { 
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println("The topper of class 10th is " + students[index].name + " with the marks " + max);
    }
}


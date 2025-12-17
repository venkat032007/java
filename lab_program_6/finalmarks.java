import cie.*;
import java.util.Scanner;
import see.*;

public class finalmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        external[] students = new external[n];
        internal[] internals = new internal[n];

        for (int i = 0; i < n; i++) {
            students[i] = new external();
            internals[i] = new internal();

            System.out.println("\nEnter details of student " + (i + 1));
            System.out.print("USN: ");
            String usn = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Semester: ");
            int sem = sc.nextInt();

            students[i].acceptPersonal(usn, name, sem);
            internals[i].acceptInternals();
            students[i].acceptSEE();
        }

        // Display Final Marks
        System.out.println("\nFINAL MARKS");
        for (int i = 0; i < n; i++) {
            System.out.println("\nUSN: " + students[i].usn);
            System.out.println("Name: " + students[i].name);
            System.out.println("Semester: " + students[i].sem);

            System.out.println("Final Marks (Internal + SEE):");
            for (int j = 0; j < 5; j++) {
                int finalMarks =
                        internals[i].internalMarks[j] +
                        students[i].seeMarks[j];
                System.out.println("Subject " + (j + 1) + ": " + finalMarks);
            }
        }

        sc.close();
    }
}

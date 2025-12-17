package see;

import java.util.Scanner;
import cie.personal;

public class external extends personal {
    public int[] seeMarks = new int[5];

    public void acceptSEE() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SEE marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            seeMarks[i] = sc.nextInt();
        }
    }
}

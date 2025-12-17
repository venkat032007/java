package cie;

import java.util.Scanner;

public class internal {
    public int[] internalMarks = new int[5];

    public void acceptInternals() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter internal marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            internalMarks[i] = sc.nextInt();
        }
    }
}

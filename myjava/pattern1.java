package myjava;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        int n = sc.nextInt();
        sc.close();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }

        int nsp = n / 2;
        int nst = 1;

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= nst; k++) {
                System.out.print("*");
            }
          
            System.out.println();

            if (i < n / 2 + 1) {
                nst += 2;
                nsp -= 1;
            } else {
                nst -= 2;
                nsp += 1;
            }
        }
    }
}

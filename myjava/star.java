package myjava;

import java.util.Scanner;

public class star {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a num");
        int n = sc.nextInt();

        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= n; i++) {
                System.err.println("*");

            }

        }
    }
}

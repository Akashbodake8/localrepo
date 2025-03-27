package myjava;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = scc.nextInt();  // User enters number of rows
        scc.close();  // Closing scanner to avoid memory leak

        for (int i = 1; i <= n; i++) {
            System.out.println("*");  // Prints * in a new line each time
        }
    }
}

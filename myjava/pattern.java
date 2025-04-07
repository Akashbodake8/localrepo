package myjava;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = scc.nextInt(); 
        scc.close(); 

        for (int i = 1; i <= n; i++) {
            System.out.println("*"); 
        }
    }
}

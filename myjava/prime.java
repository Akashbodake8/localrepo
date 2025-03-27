package myjava;
import java.util.Scanner;

public class prime {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;  // Prime numbers must be greater than 1

        for (int i = 2; i <= Math.sqrt(n); i++) {  // Checking divisibility up to √n
            if (n % i == 0) return false;  // If divisible, it's not prime
        }
        return true;  // If no factors found, it's prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        if (isPrime(num))
            System.out.println(num + " is a Prime Number.");
        else
            System.out.println(num + " is NOT a Prime Number.");
    }
}

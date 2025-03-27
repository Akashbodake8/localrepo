package myjava;

public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) return false; 

        for (int i = 2; i < n; i++) {
        if (n % i == 0) return false; 
        }
        return true; 
    }

    public static void main(String[] args) {
        int num = 17;
        if (isPrime(num)) System.out.println(num + " is a Prime Number");
        else System.out.println(num + " is NOT a Prime Number");
    }
}

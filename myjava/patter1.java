package myjava;

import java.util.Scanner;

public class patter1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        System.out.print("Enter Odd Number : ");

        int nostar = (n/2)+1;
        int nospace = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=nostar; j++);
            System.out.print("*");

            for(int k=1; k <= nospace; k++){
                System.out.print("_");

            for(int j=1; j<=nostar; j++){
                System.out.print("*");

            }
                System.out.println();


                if(i<(n/2)+1){
                    nostar--; 
                    nospace+=2;
                }

                else{
                nostar++;
                     nospace-=2;

                }


            }



        }
    }
}

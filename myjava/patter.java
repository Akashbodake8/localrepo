package myjava;
/* 

pattern Print
***_***
**___**
*_____*
**___**
***_***
 code :

public class patter {
   
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd number");
            int n=sc.nextInt();
            int nostar = 3; 
            int nospace = 1;  
    
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= nostar; j++) {
                    System.out.print("*");
                }
                for (int k = 1; k <= nospace; k++) {
                    System.out.print("_");
                }
                for (int j = 1; j <= nostar; j++) {
                    System.out.print("*");
                }
    
                System.out.println();
    
                if (i < n / 2 + 1) {
                    nostar--;
                    nospace += 2;
                } else {
                    nostar++;
                    nospace -= 2;
                }
            }
        }
    }
    
    
*/

 //Continue keyword print---------------------------------------------------

// public class patter {

//     public static void main(String[] args) {
//         for (int i=1; i<=5; i++) {
//             if(i==3){
//                 continue;
//             }
//             System.out.println(i);

            
//         }
//     }
    
// }



// public class patter {

//     public static void main(String[] args) {
//         for (int i=1; i<=5; i++) {

//             System.out.println(i);

//             if(i==3){
//                 continue;
//             }            
//         }
//     }
    
// }

// Break keyword--------------------------------------------------------------


public class patter {

    public static void main(String[] args) {
        for (int i=1; i<=5; i++) {

        
            if(i==3){
                break;
            } 
            System.out.println(i);           
        }
    }
    
}

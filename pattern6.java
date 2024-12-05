package pattern;

import java.util.Scanner;

public class pattern6 {
   public static void main(String [] args){

    System.out.println("Enter the number");
    Scanner s= new Scanner(System.in);
    int n= s.nextInt();

    for(int i=0; i<n; i++){
        for(int j=1; j<=i ; j++){
            System.out.print("*");

        }
        System.out.println("*");
    }
   }
}

// *
// **
// ***
// ****
// *****
// ******
// *******
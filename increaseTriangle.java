package pattern;

import java.util.Scanner;

public class increaseTriangle {
   public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the Triangle size =");
    int n=sc.nextInt();

    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
   }
}

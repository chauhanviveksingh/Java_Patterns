package pattern;

import java.util.Scanner;

public class Descrtriangle {

public static void main(String [] args){

    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the size of = ");
    int n= sc.nextInt();

    for(int i=1; i<=n; i++){
        for(int j=i; j<=n; j++){
            System.out.print("* ");
        }
        System.out.println();
    }

}
    
}

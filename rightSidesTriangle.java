package pattern;

import java.util.Scanner;

public class rightSidesTriangle {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Trinagle =");
        int n=sc.nextInt();

        for(int i=1; i<=n; i++){
        for(int j=i; j<=n; j++){
        System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
        }
        
    }
    
}

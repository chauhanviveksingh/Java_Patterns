package pattern;
public class facto{

  public static int factorial (int n){
    if (n==0 && n==1){
        return 1;
       }else {
        return  n* (n-1);

        }


    }
    public static void mian(String []args){
        int n= 5;
        System.out.println("Factorial of the number is"+factorial(n));
    
}
}


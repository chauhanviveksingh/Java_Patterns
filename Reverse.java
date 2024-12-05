package pattern;

// Print number in reverse order from 5 to 0 with the recursion

public class Reverse {
           public static void printTheNum( int num){ 
            if( num == 0){
                return;
            }
            System.out.println(num);
            for(int i=1; i<=num; i++){
            System.out.println(num - i);
            }  
        }
    
    public static void main (String [] args){
        printTheNum(50);

    }
}

import java.util.*;
public class Function2{

    public static void getFactorial(int num){           // Function for calculating factorial
        
        
        if(num < 0){
            System.out.println("Invalid input");
            return;
        }
         int fibo = 1;
         
         for(int i = num; i>=1; i--){

            fibo = fibo * i;
            
            }

            System.out.println("The factorial is : " + fibo);
         
         
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        getFactorial(num);
    }
}
import java.util.*;
public class Function1{

    public static int calcuSum(int a, int b){                // Function for calculating sum 
        int sum = a + b;
        return sum;
    }

    public static int calcuProduct(int a, int b){           // Function for calculating Product
        int product = a * b;
        return product;
    }

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("The sum is : "+ calcuSum(a,b));
    
    System.out.println("The Product is : "+ calcuProduct(a,b));


}
}
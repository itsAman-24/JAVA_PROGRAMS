import java.util.*;
public class Function4{
    public static void printSumOdd(int limit){    // sum of odd no.
        int sum = 0;
        for(int i=1; i<=limit; i=i+2)
        {
            sum = sum + i;
        }
        System.out.println("The sum of odd no. is : " + sum);
    }
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        printSumOdd(limit);
    }
}

import java.util.*;
public class Function3{
    public static void printAverage(int a, int b, int c){        // find the average 
            int average = (a + b + c) / 3;
            System.out.print("The average is ::" + average);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
         printAverage(a, b, c);
    }
}
import java.util.*;
public class Function9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i;
        int count_positive = 0;
        int count_negative = 0;
        int count_zero = 0;

        System.out.println("Enter the number to set the limit: ");

        int limit = sc.nextInt();
        int[] arr = new int [100];

        System.out.println("Enter the numbers for the operation: ");
        
        for(i=1; i<=limit; i++){
        arr[i] = sc.nextInt();
        }

        for(i=1; i<=limit; i++){
            
            if(arr[i] > 0){
               count_positive++;
            }

            else if(arr[i] < 0){
                count_negative++;
            }

            else if(arr[i] == 0){
                count_zero++;
            }

            else{

                System.out.println("Invalid number");
            }
        }

        System.out.println("There are " + count_positive + " positive numbers");
        System.out.println("There are " + count_negative + " negative numbers");
        System.out.println("There are " + count_zero + " zeros");

    }
}
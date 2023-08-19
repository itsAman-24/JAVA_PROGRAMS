import java.util.*;
public class pattern10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        int j;                                     // 1                      (0-1 Triangle)
                                                   // 0 1
                                                   // 1 0 1
                                                   // 0 1 0 1
                                                   // 1 0 1 0 1

        for(i=1; i<=num; i++) {
            for(j=1; j<=i; j++) {
                int sum = i+j;                        // cheaking the sum of each column in a matrix
                if(sum % 2 == 0){                     // if sum of i+j is even then print 1 else print 0
                    System.out.print(1+" ");
                }
                else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }

    }
}
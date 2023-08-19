import java.util.*;
public class pattern5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        int i;
        int j;

//      1           (palindrome pyramid)
//     212
//    32123
//   4321234
//  543212345

        for(i=1; i<=num; i++){
            for(j=i; j<=num; j++){
                System.out.print(" ");
            }
            for(j=i; j>=1; j--){
               System.out.print(j);
               }
            
                for(j=2; j<=i; j++){
                    System.out.print(j);
                }
                System.out.println();
        }
    }
}
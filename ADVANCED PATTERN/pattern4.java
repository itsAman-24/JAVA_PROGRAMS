import java.util.*;
public class pattern4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        int i;
        int j;

//      1                 (Pyramid with number)
//     2 2 
//    3 3 3 
//   4 4 4 4 
//  5 5 5 5 5 

        for(i=1; i<=num; i++){
            for(j=i; j<=num; j++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
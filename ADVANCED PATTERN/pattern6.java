import java.util.*;
public class pattern6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        int j;
                           
//       *               (Diamond star)
//      ***
//     *****
//    *******
//   *********
//  ***********
//  ***********
//   *********
//    *******
//     *****
//      ***
//       *
    
        // Upper half

        for(i=1; i<=num; i++){
            for(j=i; j<=num; j++){
                System.out.print(" ");
            }
             
             int star = 2*i-1;
            for(j=1; j<=star; j++){
               System.out.print("*");
            }
            System.out.println();
        }

        //Lower half

         for(i=num; i>=1; i--){                    // reverse the upper half 
            for(j=i; j<=num; j++){
                System.out.print(" ");
            }
             
             int star = 2*i-1;
            for(j=1; j<=star; j++){
               System.out.print("*");
            }
            System.out.println();
        }

        
           
           
    }
}
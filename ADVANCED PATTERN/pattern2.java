import java.util.*;
public class pattern2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        int j;

// *        *                     (Butterfly pattern)
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *   

        //upper level

        for(i=1; i<=num; i++){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            
            int spaces = 2*(num-i);

            for(j=1; j<=spaces; j++){
                System.out.print(" ");
                }
               for(j=1; j<=i; j++){
                System.out.print("*");
               }
               System.out.println();
        }
          
         // lower level  (180 degree rotation of upper part)

         for(i=num; i>=1; i--){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            
            int spaces = 2 * (num-i);

            for(j=1; j<=spaces; j++){
                System.out.print(" ");
                }
               for(j=1; j<=i; j++){
                System.out.print("*");
               }
               System.out.println();
        }


    }
}
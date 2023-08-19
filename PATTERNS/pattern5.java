import java.util.*;
public class pattern5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        int i;
        int j;                                   //     *        (Inverted Half Pyramid 180 degree)
                                                //     **
                                                //    ***
                                                //   ****
                                                                   
        for(i=1; i<=num; i++){
            for(j=i; j<=num; j++){                                
                System.out.print(" ");
            }
               for(j=1; j<=i; j++){
                System.out.print("*");
               }
               System.out.println();
        } 
    }
}
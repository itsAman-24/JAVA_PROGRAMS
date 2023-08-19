import java.util.*;
public class pattern1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        int i;
        int j;
                                                          //     ****               (solid rhombus)
                                                          //    ****
                                                          //   ****
                                                          //  ****
        for(i=1; i<=num; i++){
            for(j=i; j<=num; j++){
                System.out.print(" ");
            }
            for(j=1; j<=num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     
        
    }
}
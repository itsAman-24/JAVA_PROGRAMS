import java.util.*;
public class pattern4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        int j;                                   // ****       (Inverted Half Pyramid)  num = 4
                                                //  ***
                                                //  **
                                                //  *

        for(i=1;i<=num;i++){
            for(j=i;j<=num;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
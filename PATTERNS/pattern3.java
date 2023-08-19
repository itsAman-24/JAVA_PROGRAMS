import java.util.*;
public class pattern3{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int i;
    int j;
                                                //  *        (Half Pyramid)  num = 4
                                                //  **
                                                //  ***
                                                //  ****
    for(i=1;i<=num;i++){
        for(j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
import java.util.*;

public class pattern2{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        int j;
                                                //  *****        (Hollow rectangle)   num = 5
                                                //  *   *
                                                //  *   *
                                                //  *****
        for(i=1;i<=num;i++){                              
                                                              
            for(j=1;j<=num;j++){
                if((i==1||j==1||i==num||j==num)){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
              
            }
            System.out.println();
        }
    }
}
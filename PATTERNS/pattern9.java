import java.util.*;
public class pattern9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        int j;
        int count = 1;                                      // 1                  (Floyd's Triangle)
                                                            // 2 3
                                                            // 4 5 6
                                                            // 7 8 9 10
                                                            // 11 12 13 14 15

        for(i=1; i<=num; i++){
          for(j=1; j<=i; j++){
               System.out.print(count+" ");
               count++;
          }
          System.out.println();
        }
      
    }
}
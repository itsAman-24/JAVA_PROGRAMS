import java.util.*;
public class pattern6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        int i;                                                  // 1             (Half Pyramid with numbers)
        int j;                                                  // 1 2
                                                                // 1 2 3
                                                                // 1 2 3 4
        
        for(i=1; i<=num; i++){
            
            for(j=1; j<=i; j++){
                System.out.print(j+" ");
              }
              System.out.println();

        }
        }
    }

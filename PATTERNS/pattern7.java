import java.util.*;
public class pattern7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;                                       // 1 2 3 4      (rotated pyramid with numbers)
        int j;                                       // 1 2 3
                                                     // 1 2
                                                     // 1

        for(i=1; i<=num; i++){
            
            for(j=1; j<=num-i+1; j++){
                System.out.print(j+" ");
                
            }
            System.out.println();

        }
    }
}
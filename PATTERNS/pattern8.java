import java.util.*;
  
public class pattern8{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  

   /*   1                  pattern (triangle with number)                         
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5  */
    
        int i;
        int j;
       
        for(i=1; i<=num; i++){
            for(j=i; j<=num; j++){
                System.out.print(" ");

            }
             for(j=1; j<=i; j++){
                System.out.print(i+" ");
             }
              System.out.println();
            
        }
      
    }
}
     
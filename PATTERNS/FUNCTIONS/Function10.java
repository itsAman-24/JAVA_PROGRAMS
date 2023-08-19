import java.util.*;
public class Function10{
    public static double power(int a, int b){       // calculating the power of no.
    
          int i;
          int m = 1;
          for(i=1; i<=b; i++)
          {
              m = a*m;
          }
          return m;
       
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();

       System.out.println(power(num_1, num_2));
    }
}
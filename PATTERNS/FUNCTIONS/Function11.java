import java.util.*;
public class Function11{
    public static void fiboSeries(int limit){    // fibonacci series
        int i;
        int a = 0;
        int b = 1;
        int c;

        System.out.print(a+" "+b);

        for(i=1; i<=limit; i++){
             c = a + b;
             a = b;
             b = c;
            
            System.out.print(" "+c+" ");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        fiboSeries(num);
    
     }
}
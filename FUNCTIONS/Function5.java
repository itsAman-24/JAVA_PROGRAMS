import java.util.*;
public class Function5{
    public static int moreOrLess(int a, int b){

        if(a > b){
            return a;
        }
        else if(a == b){
            System.out.println("Both no.are equal");
        }
        else{
            return b;
        }
        return 0;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Result :: " + moreOrLess(a, b));
    }
}
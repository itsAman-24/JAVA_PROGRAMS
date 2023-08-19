import java.util.*;
public class pattern3{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int  num = sc.nextInt();
    int i;
    int j;

    
//      *****                   (Hollow Rhombus)
//     *   *
//    *   *
//   *   *
//  *****

    for(i=1; i<=num; i++){
        for(j=i; j<=num; j++){
            System.out.print(" ");
        }
       // Print stars after spaces
            // Print stars for each solid rows
            if (i==1 || i==num)
                for (j=1; j<=num; j++)
                    System.out.print("*");
                  
            // Print stars for each hollow rows
            else
                for (j=1; j<=num; j++){            // its the differnt (j) , it will always == 1 after printing spaces in the hollow rows
                    if (j==1 || j==num)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
           
            System.out.println();
        
    }
    }
      

}


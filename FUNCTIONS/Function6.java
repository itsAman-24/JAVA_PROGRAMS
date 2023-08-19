import java.util.*;
public class Function6{
    public static double calcuCircumference(float radius){      // circumference of the circle 
        double circum = 2*3.14*(radius * radius);
        return circum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int radius = sc.nextInt();
        System.out.println("The circumference of circle is : " +calcuCircumference(radius));
    }
}
import java.util.*;
public class Function7{
    public static void checkVoteer(int age){      // checking voteer age 
        if(age < 18){
            System.out.println("You are not eligible for vote");
        }
        else if(age == 18){
            System.out.println("You are just eligible for the vote");
        }
        else{
            System.out.println("You are definetely eligible for vote");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        checkVoteer(age);
    }
}
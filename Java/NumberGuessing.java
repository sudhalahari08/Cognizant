import java.util.*;
public class NumberGuessing{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random x=new Random();
        int target=x.nextInt(100)+1;
        int guess;
        do{
            System.out.println("Enter guess");
            guess=sc.nextInt();
            if(guess>target){
                System.out.println("Too high");
            }
            else if(guess<target){
                System.out.println("Too low");
            }
            else{
                System.out.println("Correct");
            }
        }while(guess!=target);
    }
}
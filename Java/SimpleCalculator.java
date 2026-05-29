import java.util.*;
public class SimpleCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Choose an operation");
        char op=sc.next().charAt(0);
        double res=0;
        switch(op){
            case '+':
                res=a+b;
                break;
            case '-':
                res=a-b;
                break;
            case '*':
                res=a*b;
                break;
            case '/':
                res=a/b;
                break;
            default:System.out.println("Invalid operator");
            return ;
        }
        System.out.println("Result: "+res);
    }
}
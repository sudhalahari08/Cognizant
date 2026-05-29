import java.util.*;
public class MethodOverloading{
    static int add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(add(1,2));
        System.out.println(add(2.2,3.4));
        System.out.println(add(2,3,4));
    }
}
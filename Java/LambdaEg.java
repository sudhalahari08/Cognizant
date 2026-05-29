import java.util.*;
import java.util.Scanner;
public class LambdaEg{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> lt=Arrays.asList("apple","banana","mango");
        Collections.sort(lt,(a,b)->a.compareTo(b));
        System.out.println(lt);
    }
}
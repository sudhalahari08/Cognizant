import java.util.*;
public class StringReverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        System.out.println("Reversed String:"+sb.reverse());
    }
}

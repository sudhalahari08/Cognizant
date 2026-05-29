import java.util.*;
record Person(String name,int age){}
public class Records{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Person p=new Person("Lahari",20 );
        System.out.println(p);
    }
}

import java.util.*;
public class PatternMatching{
    static void check(Object obj){
        switch(obj){
            case Integer i->System.out.println("Integer:"+i);
            case Double d->System.out.println("Double:"+d);
            case String s->System.out.println("String:"+s);           
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        check(10);
        check("hello");
    }
}
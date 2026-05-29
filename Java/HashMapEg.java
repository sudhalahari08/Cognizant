import java.util.HashMap;
import java.util.Scanner;
public class HashMapEg{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Pranitha");
        map.put(102, "Lahari");
        System.out.println(map.get(101));
    }
}

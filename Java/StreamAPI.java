import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class StreamAPI{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> nums=Arrays.asList(1,2,3,4,5);
        List<Integer> even=nums.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(even);
    }
}
import java.util.*;
public class ArraySumAverage{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        System.out.println("Enter array elements");
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        double avg=sum/n;
        System.out.println("Sum :"+sum);
        System.out.println("Average:"+avg);
    }
}
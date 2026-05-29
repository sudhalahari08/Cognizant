import java.io.*;
import java.util.*;
public class FileWriting{
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        String txt=sc.nextLine();
        FileWriter fw=new FileWriter("output.txt");
        fw.write(txt);
        fw.close();
        System.out.println("Data written");
    }
}
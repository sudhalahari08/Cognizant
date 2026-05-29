import java.io.*;
import java.util.*;
public class FileReading{
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new FileReader("output.txt"));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}

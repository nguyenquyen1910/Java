import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TinhTongLong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DATA.in"));
        long sum=0;
        while(sc.hasNext()){
            String s=sc.next();

            try{
                if(Long.parseLong(s)>2147483647) {
                    sum += Long.parseLong(s);
                }
            }catch (NumberFormatException e){

            }
        }
        System.out.println(sum);
    }
}

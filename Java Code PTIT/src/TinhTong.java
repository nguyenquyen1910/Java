import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int res=0;
        while(sc.hasNext()){
            String s=sc.next();

            try{
                res+=Integer.parseInt(s);
            }catch (NumberFormatException e){

            }
        }
        System.out.println(res);
    }
}

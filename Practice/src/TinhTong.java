import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum=0;
        while(sc.hasNext()) {
            String res = sc.next();
            try {
                sum+=Integer.parseInt(res);
            } catch (NumberFormatException ignored){

            }
        }
        System.out.println(sum);
    }
}

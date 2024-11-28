import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J07007_LietKeTuKhacNhau {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> se=new TreeSet<>();
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            String[] tmp=line.toLowerCase().split("\\s++");
            for(String s : tmp){
                se.add(s);
            }
        }
        se.forEach(System.out::println);
    }
}

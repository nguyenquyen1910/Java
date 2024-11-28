import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LietKeTuKhacNhau {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int n=2;
        Set<String> set = new TreeSet<>();
        while(sc.hasNextLine()){
            String[] tmp = sc.nextLine().toLowerCase().split("\\s+");
            for(String it : tmp){
                set.add(it);
            }
        }
        set.forEach(e -> {
            System.out.println(e);
        });
    }
}

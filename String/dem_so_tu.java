import java.util.Scanner;
import java.util.TreeSet;

public class dem_so_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine().trim();
        String[] res=s.split("\\s++");
        TreeSet<String> se=new TreeSet<>();
        for(String x : res){
            se.add(x);
        }
        System.out.println(se.size());
    }
}

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J02006_HopCua2DaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Set<Integer> se=new TreeSet<Integer>();
        for(int i=0;i<n;i++){
            Integer x=sc.nextInt();
            se.add(x);
        }
        for(int i=0;i<m;i++){
            Integer x=sc.nextInt();
            se.add(x);
        }
        for(Integer x : se){
            System.out.print(x+" ");
        }
    }
}

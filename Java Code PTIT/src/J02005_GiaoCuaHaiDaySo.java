import java.util.*;

public class J02005_GiaoCuaHaiDaySo {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        int n=sc.nextInt();
        int m=sc.nextInt();
        Set<Integer> se1 = new TreeSet<>();
        Set<Integer> se2 = new TreeSet<>();
        for(int i=0;i<n;i++){
            Integer x=sc.nextInt();
            se1.add(x);
        }
        for(int i=0;i<m;i++){
            Integer x=sc.nextInt();
            se2.add(x);
        }
        se1.retainAll(se2);
        for (Integer x : se1) {
            System.out.print(x + " ");
        }

    }
    public static void main(String[] args) {
        testCase();
    }
}

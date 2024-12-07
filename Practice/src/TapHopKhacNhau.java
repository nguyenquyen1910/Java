import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TapHopKhacNhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(), m=sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[m+1];
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        Set<Integer> tapGiao = new TreeSet<>();
        Set<Integer> setAB = new TreeSet<>();
        Set<Integer> setBA = new TreeSet<>();
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            set1.add(a[i]);
        }
        for(int i=0;i<m;i++){
            b[i] = sc.nextInt();
            set2.add(b[i]);
            if(set1.contains(b[i])){
                tapGiao.add(b[i]);
            }
        }

        set1.forEach(e -> {
            if(!set2.contains(e)){
                setAB.add(e);
            }
        });

        set2.forEach(e -> {
            if(!set1.contains(e)){
                setBA.add(e);
            }
        });

        tapGiao.forEach(e -> System.out.print(e + " "));
        System.out.println();
        setAB.forEach(e -> System.out.print(e + " "));
        System.out.println();
        setBA.forEach(e -> System.out.print(e + " "));
    }
}

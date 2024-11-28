import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TapHopSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Set<Integer> se1=new TreeSet<>();
        Set<Integer> se2=new TreeSet<>();
        for(int i=0;i<n;i++){
            se1.add(sc.nextInt());
        }
        for(int i=0;i<m;i++){
            se2.add(sc.nextInt());
        }
        for(Integer x : se1){
            if(se2.contains(x)){
                System.out.print(x+" ");
            }
        }
        System.out.println();
        for(Integer x : se1){
            if(!se2.contains(x)){
                System.out.print(x+" ");
            }
        }
        System.out.println();
        for(Integer x : se2){
            if(!se1.contains(x)){
                System.out.print(x+" ");
            }
        }
    }
}

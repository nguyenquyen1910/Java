import java.util.*;

public class TangDanGiamDan {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        int n= sc.nextInt();
        Set<Integer> set = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>(Comparator.reverseOrder());
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x%2==0){
                set.add(x);
            }
            else{
                set2.add(x);
            }
        }
        for(Integer x : set){
            System.out.print(x+" ");
        }
        System.out.println();
        for(Integer x : set2){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            testCase();
        }
    }
}

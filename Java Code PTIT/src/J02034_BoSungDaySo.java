import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J02034_BoSungDaySo {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        int n=sc.nextInt();
        int a[]=new int[n+1];
        Map<Integer,Integer> mp=new HashMap<>();
        int Max=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            mp.put(a[i],mp.getOrDefault(a[i],0)+1);
            Max=Math.max(Max,a[i]);
        }
        boolean ok=false;
        for(int i=1;i<=Max;i++){
            if(mp.getOrDefault(i,0)==0){
                System.out.println(i);
                ok=true;
            }
        }
        if(ok==false){
            System.out.println("Excellent!");
        }
    }
    public static void main(String[] args) {
        testCase();
    }
}

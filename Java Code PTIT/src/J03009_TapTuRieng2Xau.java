import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;;

public class J03009_TapTuRieng2Xau {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        String x1=sc.nextLine();
        String x2=sc.nextLine();
        String[] tmp=x1.split("\\s+");
        Set<String> set=new HashSet<>();
        for(String s : tmp){
            if(!x2.contains(s)){
                set.add(s);
            }
        }
        for(String s : set){
            System.out.print(s+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            testCase();
        }
    }
}

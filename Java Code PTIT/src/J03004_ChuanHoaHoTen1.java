import java.util.Locale;
import java.util.Scanner;

public class J03004_ChuanHoaHoTen1 {
    public static Scanner sc = new Scanner(System.in);
    public static String solveFullName(String s) {
        if(s.length()==1){
            return s.toUpperCase();
        }
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
    public static void testCase(){
        String x=sc.nextLine().trim();
        String[] tmp=x.split("\\s+");
        for(int i=0;i<tmp.length;i++){
            tmp[i]=solveFullName(tmp[i]);
        }
        System.out.println(String.join(" ",tmp));
    }
    public static void main(String[] args) {
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            testCase();
        }
    }
}

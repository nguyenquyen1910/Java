import java.util.Scanner;

public class J03005_ChuanHoaHoTen2 {
    public static Scanner sc = new Scanner(System.in);
    public static String solveName(String s){
        if(s.length()==1){
            return s.toUpperCase();
        }
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
    public static void testCase(){
        String s=sc.nextLine().trim();
        String[] tmp=s.split("\\s+");
        for(int i=0;i<tmp.length;i++){
            tmp[i]=solveName(tmp[i]);
        }
        for(int i=1;i<tmp.length;i++){
            System.out.print(tmp[i]);
            if(i!=tmp.length-1){
                System.out.print(" ");
            }
        }
        System.out.println(", "+tmp[0].toUpperCase());
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            testCase();
        }
    }
}

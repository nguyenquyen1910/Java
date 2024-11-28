import java.util.Scanner;

public class ChuanHoaHoTen {
    public static Scanner sc = new Scanner(System.in);
    public static String solveName(String s){
        if(s.length()==1){
            return s.toUpperCase();
        }
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
    public static void testCase(){
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        String[] tmp=s.trim().split("\\s+");
        for(int i=0;i<tmp.length;i++){
            tmp[i]=solveName(tmp[i]);
        }
        if(n==1){
            System.out.print(tmp[tmp.length-1]+" ");
            for(int i=0;i<tmp.length-1;i++){
                System.out.print(tmp[i]+" ");
            }
        }
        else{
            for(int i=1;i<tmp.length;i++){
                System.out.print(tmp[i]+" ");
            }
            System.out.print(tmp[0]);
        }
    }
    public static void main(String[] args) {
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            testCase();
            System.out.println();
        }
    }
}

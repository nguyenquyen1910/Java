import java.util.Scanner;

public class J03032_DaoTu {
    public static Scanner sc = new Scanner(System.in);
    public static String reverseString(String s){
        StringBuilder str=new StringBuilder(s);
        return str.reverse().toString();
    }
    public static void testCase(){
        String[] tmp=sc.nextLine().trim().split("\\s+");
        for(String s : tmp){
            System.out.print(reverseString(s)+" ");
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

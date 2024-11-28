import java.util.Scanner;

public class J03007_SoDep2 {
    public static Scanner sc = new Scanner(System.in);
    public static boolean checkReverse(String s){
        StringBuilder str=new StringBuilder(s);
        str.reverse();
        return s.equals(str.toString());
    }
    public static boolean check(String s){
        if(checkReverse(s)==false){
            return false;
        }
        if(s.charAt(0)!='8' && s.charAt(s.length()-1)!='8'){
            return false;
        }
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i)-'0';
        }
        if(sum%10!=0){
            return false;
        }
        return true;
    }
    public static void testCase(){
        String s=sc.next();
        if(check(s)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(sc.next());
        while(n-->0){
            testCase();
        }
    }
}

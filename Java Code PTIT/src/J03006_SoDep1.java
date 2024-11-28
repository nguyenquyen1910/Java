import java.util.Scanner;

public class J03006_SoDep1 {
    public static Scanner sc = new Scanner(System.in);
    public static boolean check(String s){
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0')%2==1){
                return false;
            }
        }
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            ++l;--r;
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

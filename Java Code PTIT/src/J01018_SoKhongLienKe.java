import java.util.Scanner;

public class J01018_SoKhongLienKe {
    public static Scanner sc = new Scanner(System.in);
    public static Boolean isDivisibleTen(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i)-'0';
        }
        return sum%10==0;
    }
    public static Boolean isTwoUnit(String s){
        for(int i=0;i<s.length()-1;i++){
            if(Math.abs((s.charAt(i)-'0')-(s.charAt(i+1)-'0'))!=2){
                return false;
            }
        }
        return true;
    }
    public static void testCase(){
        String s=sc.next();
        if(isDivisibleTen(s) && isTwoUnit(s)){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-- >0){
            testCase();
        }
    }
}

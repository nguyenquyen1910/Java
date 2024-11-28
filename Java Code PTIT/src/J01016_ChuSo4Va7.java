import java.util.Scanner;

public class J01016_ChuSo4Va7 {
    public static Boolean iSSumEqualZero(String s){
        int count4=0,count7=0;
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='4'){
                count4++;
            }
            else if(x=='7'){
                count7++;
            }
        }
        return count4+count7==4 || count7+count4==7;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        System.out.println(iSSumEqualZero(s) ? "YES" : "NO");
    }
}

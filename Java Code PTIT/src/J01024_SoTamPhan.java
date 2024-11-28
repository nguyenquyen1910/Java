import java.util.Scanner;

public class J01024_SoTamPhan {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x!='0' && x!='1' && x!='2'){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-- >0){
            testCase();
        }
    }
}

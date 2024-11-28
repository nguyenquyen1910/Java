import java.util.Scanner;

public class J03021_DienThoaiCucGach {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        String s=sc.nextLine().toUpperCase();
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='B' || s.charAt(i)=='C'){
                res+="2";
            }
            else if(s.charAt(i)=='D' || s.charAt(i)=='E' || s.charAt(i)=='F'){
                res+="3";
            }
            else if(s.charAt(i)=='G' || s.charAt(i)=='H' || s.charAt(i)=='I'){
                res+="4";
            }
            else if(s.charAt(i)=='J' || s.charAt(i)=='K' || s.charAt(i)=='L'){
                res+="5";
            }
            else if(s.charAt(i)=='M' || s.charAt(i)=='N' || s.charAt(i)=='O'){
                res+="6";
            }
            else if(s.charAt(i)=='P' || s.charAt(i)=='Q' || s.charAt(i)=='R' || s.charAt(i)=='S'){
                res+="7";
            }
            else if(s.charAt(i)=='T' || s.charAt(i)=='U' || s.charAt(i)=='V'){
                res+="8";
            }
            else if(s.charAt(i)=='W' || s.charAt(i)=='X' || s.charAt(i)=='Y' || s.charAt(i)=='Z'){
                res+="9";
            }
        }
        StringBuilder str=new StringBuilder(res);
        str=str.reverse();
        System.out.println(str.toString().equals(res) ? "YES" : "NO");
    }
    public static void main(String[] args) {
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            testCase();
        }
    }
}

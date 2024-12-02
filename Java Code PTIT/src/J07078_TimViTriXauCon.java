import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07078_TimViTriXauCon {

    public static boolean check(String a, String b, int l){
        for(int i=0;i<b.length();i++){
            if(a.charAt(i+l) != b.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("STRING.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            for(int i=0;i<=a.length()-b.length();i++){
                if(check(a, b, i)){
                    System.out.print((i+1)+" ");
                }
            }
            System.out.println();
        }
    }
}

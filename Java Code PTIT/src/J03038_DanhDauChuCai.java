import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J03038_DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        Set<Character> se=new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            se.add(s.charAt(i));
        }
        System.out.println(se.size());
    }
}

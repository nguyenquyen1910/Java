import java.util.Scanner;
import java.util.TreeSet;

public class ki_tu_xuat_hien_1in2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        TreeSet<Character> se=new TreeSet<>();
        TreeSet<Character> se2=new TreeSet<>();
        TreeSet<Character> se3=new TreeSet<>();
        for(int i=0;i<s1.length();i++){
            se.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++){
            if(!se.contains(s2.charAt(i))){
                se2.add(s2.charAt(i));
            }
            se3.add(s2.charAt(i));
        }
        for(Character x : se2){
            System.out.print(x);
        }
        System.out.println("");
        for(Character x : se){
            if(!se3.contains(x)){
                System.out.print(x);
            }
        }
    }
}

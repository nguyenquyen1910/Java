import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class ki_tu_xuat_hien_o_2xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next(),s2=sc.next();
        TreeSet<Character> se=new TreeSet<>();
        TreeMap<Character,Integer> mp=new TreeMap<>();
        for(int i=0;i<s1.length();i++){
            mp.put(s1.charAt(i), 1);
            se.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++){
            if(mp.containsKey(s2.charAt(i))){
                if(mp.get(s2.charAt(i))==1){
                    mp.put(s2.charAt(i), 2);
                }
            }
            se.add(s2.charAt(i));
        }
        for(Character x : mp.keySet()){
            if(mp.get(x)==2){
                System.out.print(x);
            }
        }
        System.out.println("");
        for(Character x : se){
            System.out.print(x);
        }
    }
}

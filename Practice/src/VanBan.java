import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class VanBan {
    public static boolean check1(String s){
        String x = ".,!?:";
        for(int i=0;i<x.length();i++){
            if(s.contains(Character.toString(x.charAt(i)))){
                return false;
            }
        }
        return true;
    }

    public static boolean check2(String s){
        for(Character x : s.toCharArray()){
            if(Character.isDigit(x)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> set = new TreeSet<>();
        while(sc.hasNext()){
            String word = sc.next();
            if(check1(word) && check2(word)){
                set.add(word);
            }
        }
        set.forEach(System.out::println);
    }
}

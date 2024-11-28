import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class tan_suat_xuat_hien_kitu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        LinkedHashMap<Character,Integer> mp=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(mp.containsKey(c)){
                int fre=mp.get(c);
                mp.put(c,fre+1);
            }
            else mp.put(c, 1);
        }
        TreeMap<Character,Integer> mp2=new TreeMap<>();
        mp2.putAll(mp);
        for(Map.Entry<Character,Integer> entry : mp.entrySet()){
            System.out.print(entry.getKey()+":"+entry.getValue()+" ");
        }
        System.out.println("");
        for(Map.Entry<Character,Integer> entry : mp2.entrySet()){
            System.out.print(entry.getKey()+":"+entry.getValue()+" ");
        }
    }
}

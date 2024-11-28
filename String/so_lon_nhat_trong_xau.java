import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class so_lon_nhat_trong_xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int res=0;
        for(int i=0;i<s.length();i++){
            int num=0;
            if(Character.isDigit(s.charAt(i))){
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    num=num*10+s.charAt(i)-'0';
                    ++i;
                }
            } 
            res=Math.max(res,num);
        }
        System.out.println(res);


        //Cach 2
        s+="a";
        ArrayListList<String> arr=new ArrayList<>();
        String num="";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                num+=s.charAt(i);
            }
            else{
                while(num.length()>1 && num.charAt(0)=='0'){
                    num=num.replaceFirst("0", "");
                }
                arr.add(num);
                num="";
            }
        }
        Collections.sort(arr, new Comparator<T>() {
            @Override
            public int compare(String o1, String o2) {
                int len1=o1.length();
                int len2=o2.length();
                if(len1!=len2)
                    return len2-len1;
                else return o2.compareTo(o1);
            }
        });
        System.out.println(arr.get(0));
    }
}

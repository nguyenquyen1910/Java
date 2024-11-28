import java.util.*;
public class chuan_hoa_ho_ten {
    public static String nameRemake(String s){
        String res="";
        res+=s.charAt(0);
        res=res.toUpperCase();
        s=s.toLowerCase();
        for(int i=1;i<s.length();i++){
            res+=s.charAt(i);
        }
        return res;
    }
    public static String dateRemake(String s){
        StringBuilder str=new StringBuilder(s);
        if(str.charAt(1)=='/'){
            str=str.insert(0, "0");
        }
        if(str.charAt(4)=='/'){
            str=str.insert(3, "0");
        }
        return str.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine().trim();
        String s2=sc.nextLine();
        String[] res=s1.split("\\s++");
        s2=dateRemake(s2);
        System.out.println(s2);
        for(int i=0;i<res.length-1;i++){
            res[i]=nameRemake(res[i]);
            System.out.print(res[i]);
            if(i!=res.length-2){
                System.out.print(" ");
            }
            else System.out.print(", ");
        }
        System.out.print(nameRemake(res[res.length-1]));
    }
}

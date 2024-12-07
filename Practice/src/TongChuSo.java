import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class TongChuSo {
    public static long sumNum(String num) {
        long sum=0;
        for(int i=0;i<num.length();i++){
            sum+=num.charAt(i)-'0';
        }
        return sum;
    }

    public static String toNumber(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                res+=s.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> list = (ArrayList<String>) ois.readObject();
        for(String it : list) {
            String num = toNumber(it).replaceFirst("^0+","");
            System.out.println(num+" "+sumNum(num));
        }
    }
}

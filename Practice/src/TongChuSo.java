import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class TongChuSo {
    public static boolean checkNumberInString(String x) {
        for(char i : x.toCharArray()) {
            if(Character.isDigit(i)){
                return true;
            }
        }
        return false;
    }

    public static int sumNumber(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=(s.charAt(i)-'0');
        }
        return sum;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> list = (ArrayList<String>) ois.readObject();
        for(String it : list) {
            if(checkNumberInString(it)){
                StringBuilder str = new StringBuilder();
                for(char c : it.toCharArray()) {
                    if(Character.isDigit(c)){
                        str.append(c);
                    }
                }
                String numberString = str.toString().replaceFirst("^0+", "");
                System.out.println(numberString+" "+sumNumber(numberString.toString()));
            }
        }
    }
}

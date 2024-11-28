import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class GiaTriNhiPhan {
    public static String remake(String x){
        String res="";
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='0' || x.charAt(i)=='1'){
                res+=x.charAt(i);
            }
        }
        return res;
    }
    public static BigInteger toDecimal(String x){
        BigInteger res=new BigInteger(x,2);
        return res;
    }
    public static void main(String[] args) throws IOException, FileNotFoundException,ClassNotFoundException {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
            ArrayList<String> list = (ArrayList<String>) ois.readObject();
            for (String num : list) {
                System.out.println(remake(num)+" "+toDecimal(remake(num)));
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

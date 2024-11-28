import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07032_SoThuanNghichFile {
    public static boolean check(String str){
        StringBuilder rev = new StringBuilder(str).reverse();
        if(str.length()==1 || str.length()%2==0){
            return false;
        }
        if(!str.equals(rev.toString())){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)-'0')%2==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        int cnt[] = new int[1000001];
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        for(Integer i : list1){
            if(check(i.toString()) && list2.contains(i)){
                cnt[i]++;
            }
        }

        for(Integer i : list2){
            if(check(i.toString()) && cnt[i]!=0){
                cnt[i]++;
            }
        }
        int dem=0;
        for(int i=0;i<=1000000;i++){
            if(cnt[i]>0){
                System.out.println(i+" "+cnt[i]);
                dem++;
            }
            if(dem==10){
                break;
            }
        }
    }
}

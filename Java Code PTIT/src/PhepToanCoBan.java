import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhepToanCoBan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<BigInteger> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new BigInteger(sc.nextLine()));
        }
        Collections.sort(list);
        System.out.println(list.get(0).toString());
        System.out.println(list.get(list.size()-1).toString());
        BigInteger res=new BigInteger("0");
        for(BigInteger i : list){
            res=res.add(i);
        }
        System.out.println(res.toString());
    }
}

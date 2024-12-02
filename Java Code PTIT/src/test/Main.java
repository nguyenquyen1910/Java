package test;

import java.io.*;
import java.util.*;

public class Main {
    public static int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b, a % b);
    }
    public static boolean isPrimeTogether(int a, int b){
        if(a>=b) return false;
        return gcd(a,b)==1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> list = (ArrayList<Pair>) ois.readObject();
        Collections.sort(list);
        Set<String> set = new HashSet<>();
        for(Pair it : list){
            if(isPrimeTogether(it.getFirst(), it.getSecond()) && !set.contains(it.toString())){
                set.add(it.toString());
                System.out.println(it);
            }
        }
    }
}

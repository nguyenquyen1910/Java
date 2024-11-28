import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07023_NguyenToVaThuanNghich {

    public static boolean isReverseNumber(int x) {
        String s = String.format("%d", x);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static int N = 10000;
    public static int[] prime = new int[N+5];

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        for (int i = 2; i <= N; i++)
            prime[i] = 1;
        for (int i = 2; i <= (int) Math.sqrt(N); i++) {
            if (prime[i] == 1) {
                for(int j=i*i;j<=N;j+=i){
                    prime[j] = 0;
                }
            }
        }
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) o1.readObject();
        TreeMap<Integer, Integer> h1 = new TreeMap<>();
        a1.forEach(it -> {
            if(prime[it]==1 && isReverseNumber(it)){
                h1.put(it, h1.getOrDefault(it, 0) + 1);
            }
        });

        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a2 = (ArrayList<Integer>) o2.readObject();
        TreeMap<Integer, Integer> h2 = new TreeMap<>();
        a2.forEach(it -> {
            if(prime[it]==1 && isReverseNumber(it)){
                h2.put(it, h2.getOrDefault(it, 0) + 1);
            }
        });
        h1.forEach((k, v) -> {
            if (h2.get(k) != null) {
                System.out.printf("%d %d %d\n", k, v, h2.get(k));
            }
        });
    }
}

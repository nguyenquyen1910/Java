import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07029_SoNguyenToLonNhatFile {
    public static int N=(int) 1e6;
    public static int[] prime = new int[N+1];
    public static void sieve(){
        Arrays.fill(prime,1);
        prime[0]=prime[1]=0;
        for(int i=2;i<=Math.sqrt(N);i++){
            if(prime[i]==1){
                for(int j=i*i;j<=N;j+=i){
                    prime[j]=0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sieve();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> list = (ArrayList<Integer>) ois.readObject();
        Map<Integer,Integer> mp = new HashMap<>();
        for(Integer i:list){
            if(prime[i]==1){
                mp.put(i,mp.getOrDefault(i,0)+1);
            }
        }
        int cnt=0;
        for(int i=1000000;i>=2;i--){
            if(mp.containsKey(i)){
                System.out.println(i+" "+ mp.get(i));
                cnt++;
                if(cnt==10){
                    break;
                }
            }
        }
    }
}

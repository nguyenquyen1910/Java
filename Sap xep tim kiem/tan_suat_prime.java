import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
// Khong biet truoc so luong phan tu
public class tan_suat_prime {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return n>1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        while(sc.hasNext()){
            int x=sc.nextInt();
            if(isPrime(x)){
                if(map.containsKey(x)){
                    int fre=map.get(x);
                    map.put(x, fre+1);
                }
                else{
                    map.put(x, 1);
                }
            }
        }
        Set<Map.Entry<Integer,Integer>> entrySet=map.entrySet();
        for(Map.Entry<Integer,Integer> entry : entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}

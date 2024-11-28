import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Queue;

public class tim_so_k_thoa_man {
    public static boolean isDifferent(int n){
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        while(n>0){
            int x=n%10;
            if(mp.containsKey(x)){
                return false;
            }
            else mp.put(x, 1);
            n/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=5;i++){
            q.add(i);
        }
        while(!q.isEmpty()){
            int top=q.poll();
            if(top>k){
                break;
            }
            System.out.print(top+" ");
            for(int i=0;i<=5;i++){
                int tmp=top*10+i;
                if(isDifferent(tmp)){
                    q.add(tmp);
                }
            }
        }
    }
}

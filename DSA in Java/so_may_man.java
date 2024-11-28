import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class so_may_man {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Queue<String> q=new LinkedList<>();
        q.add("6");
        q.add("8");
        while(!q.isEmpty()){
            String top=q.poll();
            if(top.length()>n){
                break;
            }
            System.out.print(top+" ");
            q.add(top+"6");
            q.add(top+"8");
        }
    }
}

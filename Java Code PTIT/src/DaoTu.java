import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Stack<String> st = new Stack<>();
        for(int i=0;i<n;i++){
            String[] tmp = sc.nextLine().trim().split("\\s+");
            for(String s : tmp){
                st.push(s);
            }
            while(!st.isEmpty()){
                System.out.print(st.pop()+" ");
            }
            System.out.println();
        }
    }
}

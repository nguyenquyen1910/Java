import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class J07077_TinhGiaTriBieuThuc {
    public static boolean isNumber(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<'0' || s.charAt(i)>'9') {
                return false;
            }
        }
        return true;
    }

    public static Long caculate(String a, String b, String op){
        Long x = Long.parseLong(a);
        Long y = Long.parseLong(b);
        if(op.compareTo("*") == 0) return x*y;
        if(op.compareTo("/") == 0) return x/y;
        if(op.compareTo("+") == 0) return x+y;
        return x-y;
    }

    public static String handle(Stack<String> a) {
        Stack<String> res = new Stack<>();
        while(!a.empty()){
            String top = a.pop();
            if("*/".contains(top)){
                String m = res.pop();
                String n = a.pop();
                res.push(caculate(m, n, top).toString());
            }
            else{
                res.push(top);
            }
        }
        while(!res.isEmpty()){
            a.push(res.pop());
        }
        Long tmp = Long.parseLong(a.pop());
        while(!a.empty()){
            String op = a.pop();
            String m = a.pop();
            tmp = caculate(tmp.toString(), m, op);
        }
        return tmp.toString();
    }

    public static void testCase(String s) {
        Stack<String> st = new Stack<>();
        Stack<String> st1 = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') continue;
            queue.add(Character.toString(s.charAt(i)));
        }
        while(!queue.isEmpty()){
            String top = queue.poll();
            if(isNumber(top)){
                while(queue.peek() != null && isNumber(queue.peek())){
                    top+=queue.poll();
                }
                st.push(top);
            }
            else{
                st.push(top);
            }
        }
        while(!st.isEmpty()){
            st1.push(st.pop());
        }
        while(!st1.isEmpty()){
            String top = st1.pop();
            if(top.compareTo(")")==0){
                Stack<String> tmp = new Stack<>();
                while(st.lastElement().compareTo("(") !=0){
                    tmp.push(st.pop());
                }
                st.pop();
                st.push(handle(tmp));
            }
            else{
                st.push(top);
            }
        }
        System.out.println(st.pop());
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BIEUTHUC.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = "("+sc.nextLine()+")";
            testCase(s);
        }
    }
}

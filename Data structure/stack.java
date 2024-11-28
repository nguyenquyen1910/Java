import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        //Check size
        System.out.println(st.size());
        //Check empty
        System.out.println(st.empty());
        //Lay phan tu dau tien
        System.out.println(st.peek());
        st.pop();

        //Ham vua lay vua xoa
        System.out.println(st.pop());
    }
}

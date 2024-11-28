import java.util.Scanner;
import java.util.Stack;

public class CapSoThoaMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long count = 0;
        Stack<Integer> stack = new Stack<>();
        int[] cnt = new int[n];
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && a[stack.peek()] < a[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                cnt[i] = i - stack.peek();
            } else {
                cnt[i] = i + 1;
            }
            stack.push(i);
        }

        // Tính tổng số lượng cặp hợp lệ
        for (int i = 0; i < n; i++) {
            count += cnt[i];
        }

        System.out.println(count);
    }
}

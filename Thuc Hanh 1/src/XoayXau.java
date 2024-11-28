import java.util.Scanner;

public class XoayXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng trống sau khi nhập N

        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextLine();
        }
        int minSteps = findMinSteps(S);
        if (minSteps == -1) {
            System.out.println("NO");
        } else {
            System.out.println(minSteps);
        }
    }

    private static int findMinSteps(String[] S) {
        int n = S.length;
        int len = S[0].length();

        int minSteps = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            String target = S[i];
            int totalSteps = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                int steps = findRotationSteps(S[j], target);
                if (steps == -1) {
                    return -1;
                }
                totalSteps += steps;
            }
            minSteps = Math.min(minSteps, totalSteps);
        }
        return minSteps;
    }

    private static int findRotationSteps(String s, String target) {
        int len = s.length();
        String temp = s + s;
        for (int i = 0; i < len; i++) {
            if (temp.substring(i, i + len).equals(target)) {
                return i;
            }
        }
        return -1;
    }
}

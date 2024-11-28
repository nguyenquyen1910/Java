import java.util.Scanner;

public class SapXepBi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int countX = 0, countT = 0, countD = 0;
        for (char c : s.toCharArray()) {
            if (c == 'X') countX++;
            else if (c == 'T') countT++;
            else if (c == 'D') countD++;
        }
        int swaps = 0;
        int[] misplaced = new int[3];
        for (int i = 0; i < countX; i++) {
            if (s.charAt(i) == 'T') misplaced[0]++;
            if (s.charAt(i) == 'D') misplaced[2]++;
        }
        for (int i = countX; i < countX + countT; i++) {
            if (s.charAt(i) == 'X') misplaced[0]++;
            if (s.charAt(i) == 'D') misplaced[1]++;
        }

        // Check segment for D's: [countX+countT, N-1]
        for (int i = countX + countT; i < n; i++) {
            if (s.charAt(i) == 'X') misplaced[2]++;
            if (s.charAt(i) == 'T') misplaced[1]++;
        }

        // Total swaps required
        swaps = Math.max(misplaced[0], Math.max(misplaced[1], misplaced[2]));

        System.out.println(swaps);
    }
}

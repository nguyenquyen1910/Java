package danhsachcanh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        List<Pair<Integer, Integer>> edges = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i][j] == 1) {
                    edges.add(new Pair<>(i + 1, j + 1));
                }
            }
        }

        for (Pair<Integer, Integer> i : edges) {
            System.out.println(i);
        }
    }
}

/*
6
0 1 1 0 1 0
1 0 1 0 1 0
1 1 0 1 0 0
0 0 1 0 1 1
1 1 0 1 0 1
0 0 0 1 1 0
 */

package J05060_ketquaxettuyen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Candidate> candidates = new ArrayList<>();
        for(int i=0;i<n;i++){
            candidates.add(new Candidate(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(candidates);
        candidates.forEach(System.out::println);
    }
}

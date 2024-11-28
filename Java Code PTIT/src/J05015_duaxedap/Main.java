package J05015_duaxedap;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Player> players = new ArrayList<>();
        for(int i=0;i<n;i++){
            players.add(new Player(sc.nextLine(), sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(players);
        players.forEach(System.out::println);
    }
}

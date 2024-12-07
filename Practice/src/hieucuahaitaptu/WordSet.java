package hieucuahaitaptu;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private Scanner sc;
    private TreeSet<String> mySet;

    public WordSet(String input) throws IOException {
        this.sc = new Scanner(new File(input));
        this.mySet = new TreeSet<>();

        while(sc.hasNextLine()) {
            String s = sc.nextLine().toLowerCase();
            String[] words = s.split("\\s+");
            mySet.addAll(Arrays.asList(words));
        }
    }

    public String difference(WordSet wordSet) {
        TreeSet<String> set = new TreeSet<>(mySet);
        set.removeAll(wordSet.mySet);
        return String.join(" ", set);
    }
}

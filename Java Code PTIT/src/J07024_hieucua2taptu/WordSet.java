package J07024_hieucua2taptu;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> mySet;
    private Scanner sc;

    public WordSet(String input) throws IOException {
        mySet = new TreeSet<>();
        sc = new Scanner(new File(input));
        while (sc.hasNextLine()) {
            String s = sc.nextLine().toLowerCase();
            String[] tmp = s.split("\\s+");
            mySet.addAll(Arrays.asList(tmp));
        }
    }

    public TreeSet<String> getMySet() {
        return mySet;
    }

    public String difference(WordSet wordSet){
        TreeSet<String> diffSet = new TreeSet<>(mySet);
        diffSet.removeAll(wordSet.getMySet());
        return String.join(" ", diffSet);
    }
}

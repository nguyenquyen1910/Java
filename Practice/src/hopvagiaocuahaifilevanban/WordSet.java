package hopvagiaocuahaifilevanban;

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
        String s;
        while(sc.hasNextLine()) {
            s = sc.nextLine();
            s = s.toLowerCase();
            String[] words = s.trim().split("\\s+");
            mySet.addAll(Arrays.asList(words));
        }
    }

    public TreeSet<String> getMySet() {
        return mySet;
    }

    public String union(WordSet wordSet) {
        TreeSet<String> set = new TreeSet<>(wordSet.getMySet());
        String res="";
        set.addAll(mySet);
        for(String word : set){
            res += word+" ";
        }
        return res;
    }

    public String intersection(WordSet wordSet) {
        String res="";
        TreeSet<String> set = wordSet.getMySet();
        for(String word : mySet) {
            if(set.contains(word)) {
                res+=word+" ";
            }
        }
        return res;
    }
}

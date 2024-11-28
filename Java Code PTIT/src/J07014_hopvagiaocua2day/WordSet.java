package J07014_hopvagiaocua2day;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private Scanner sc;
    private TreeSet<String> mySet;

    public WordSet(String input) throws IOException {
        sc = new Scanner(new File(input));
        mySet = new TreeSet<>();
        String s;
        while (sc.hasNextLine())
        {
            s = sc.nextLine();
            s = s.toLowerCase();
            String[] arr = s.split("\\s+");
            mySet.addAll(Arrays.asList(arr));
        }
    }

    public TreeSet<String> getMySet() {
        return mySet;
    }

    public String union(WordSet wordSet)
    {
        String res = "";
        TreeSet<String> set = new TreeSet<>(wordSet.getMySet());
        set.addAll(mySet);
        for (String i : set)
            res += i + " ";
        return res;
    }

    public String intersection(WordSet wordSet)
    {
        String res = "";
        TreeSet<String> set = wordSet.getMySet();
        for (String i : mySet)
            if (set.contains(i))
                res += i + " ";
        return res;
    }
}

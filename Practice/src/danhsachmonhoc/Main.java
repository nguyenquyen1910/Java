package danhsachmonhoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        List<Subject> subjects = new ArrayList<>();
        Set<String> subFilter = new HashSet<>();
        while (sc.hasNextLine()) {
            String subId = sc.nextLine();
            String subName = sc.nextLine();
            String subType = sc.nextLine();
            if(!subFilter.contains(subId)){
                subjects.add(new Subject(subId,subName,subType));
                subFilter.add(subId);
            }
        }

        Collections.sort(subjects);
        subjects.forEach(System.out::println);
    }
}

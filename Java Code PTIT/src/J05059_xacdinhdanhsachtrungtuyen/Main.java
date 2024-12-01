package J05059_xacdinhdanhsachtrungtuyen;
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
            candidates.add(new Candidate(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(candidates);
        int target = Integer.parseInt(sc.nextLine());
        Double targetScore = candidates.get(target-1).getTotalScore();
        System.out.println(String.format("%.1f", targetScore));
        for(Candidate candidate : candidates){
            if(candidate.getTotalScore() >= targetScore){
                candidate.setStatus("TRUNG TUYEN");
            }
            else{
                candidate.setStatus("TRUOT");
            }
        }
        candidates.forEach(System.out::println);
    }
}

package J05060_ketquaxettuyen;

public class Candidate implements Comparable<Candidate> {
    private String id;
    private String name;
    private String dateOfBirth;
    private long age;
    private double theoryScore;
    private double practiceScore;
    private double bonusScore;
    private long totalScore;
    private String rank;

    public Candidate(int i, String name, String dateOfBirth, double theoryScore, double practiceScore) {
        this.id = "PH"+String.format("%02d", i+1);
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = 2021 - Long.parseLong(dateOfBirth.split("/")[2]);
        this.theoryScore = theoryScore;
        this.practiceScore = practiceScore;
        this.bonusScore = solveBonusScore();
        this.totalScore = Math.min(10,Math.round((theoryScore+practiceScore)/2 + bonusScore));
        this.rank = solveRank();

    }

    private double solveBonusScore() {
        if(theoryScore >= 8 && practiceScore >= 8) {
            return 1.0;
        }
        if(theoryScore >= 7.5 && practiceScore >= 7.5){
            return 0.5;
        }
        return 0.0;
    }

    private String solveRank() {
        if(totalScore>=9){
            return "Xuat sac";
        }
        if(totalScore>=8){
            return "Gioi";
        }
        if(totalScore>=7){
            return "Kha";
        }
        if(totalScore>=5){
            return "Trung binh";
        }
        return "Truot";
    }

    @Override
    public String toString() {
        return id+" "+name+" "+age+" "+totalScore+" "+rank;
    }

    @Override
    public int compareTo(Candidate o) {
        if(this.totalScore != o.totalScore){
            return (int)(o.totalScore - this.totalScore);
        }
        return this.id.compareTo(o.id);
    }
}

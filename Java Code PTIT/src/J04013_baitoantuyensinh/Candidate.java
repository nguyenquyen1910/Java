package J04013_baitoantuyensinh;

public class Candidate {
    private String id;
    private String name;
    private double mathScore;
    private double physicScore;
    private double chemistryScore;
    private double bonusScore;
    private double totalScore;
    private String status;

    public Candidate(String id, String name, double mathScore, double physicScore, double chemistryScore) {
        this.id = id;
        this.name = name;
        this.mathScore = mathScore;
        this.physicScore = physicScore;
        this.chemistryScore = chemistryScore;
        this.bonusScore = solveBonusScore();
        this.totalScore = mathScore*2+physicScore+chemistryScore;
        this.status = (this.totalScore+this.bonusScore) >= 24 ? "TRUNG TUYEN" : "TRUOT";
    }

    private double solveBonusScore() {
        if(id.startsWith("KV1")){
            return 0.5;
        }
        if(id.startsWith("KV2")) {
            return 1.0;
        }
        return 2.5;
    }

    private String solveScore(double score) {
        if((int) score==score){
            return String.format("%.0f", score);
        }
        return String.format("%.1f", score);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+solveScore(bonusScore)+" "+solveScore(totalScore)+" "+status;
    }
}

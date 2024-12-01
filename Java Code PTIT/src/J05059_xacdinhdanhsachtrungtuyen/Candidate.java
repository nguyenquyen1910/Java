package J05059_xacdinhdanhsachtrungtuyen;

public class Candidate implements Comparable<Candidate> {
    private String id;
    private String name;
    private Double mathScore;
    private Double physicScore;
    private Double chemistryScore;
    private Double bonusScore;
    private Double totalScore;
    private String status;

    public Candidate(String id, String name, Double mathScore, Double physicScore, Double chemistryScore) {
        this.id = id;
        this.name = name;
        this.mathScore = mathScore;
        this.physicScore = physicScore;
        this.chemistryScore = chemistryScore;
        this.bonusScore = handleBonusScore();
        this.totalScore = mathScore*2 + physicScore + chemistryScore + this.bonusScore;
    }

    private Double handleBonusScore() {
        if(id.startsWith("KV1")){
            return 0.5;
        }
        if(id.startsWith("KV2")){
            return 1.0;
        }
        return 2.5;
    }

    private String formatScore(double score) {
        if((int) score == score){
            return String.format("%.0f", score);
        }
        return String.format("%.1f", score);
    }

    public Double getTotalScore() {
        return totalScore;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+formatScore(bonusScore)+" "+formatScore(totalScore)+" "+status;
    }

    @Override
    public int compareTo(Candidate o) {
        if(Double.compare(this.totalScore, o.totalScore) != 0){
            return Double.compare(o.totalScore, this.totalScore);
        }
        return this.id.compareTo(o.id);
    }
}

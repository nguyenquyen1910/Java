package J05058_sapxepketquatuyensinh;

public class SinhVien implements Comparable<SinhVien> {
    private String id;
    private String name;
    private double mathScore;
    private double physicScore;
    private double chemistryScore;
    private double bonusScore;
    private double totalScore;
    private String status;

    public SinhVien(String id, String name, double mathScore, double physicScore, double chemistryScore) {
        this.id = id;
        this.name = name;
        this.mathScore = mathScore;
        this.physicScore = physicScore;
        this.chemistryScore = chemistryScore;
        this.bonusScore = solveBonusScore();
        this.totalScore = 2*mathScore+physicScore+chemistryScore+bonusScore;
        this.status = this.totalScore >= 24 ? "TRUNG TUYEN" : "TRUOT";
    }

    private double solveBonusScore() {
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

    @Override
    public int compareTo(SinhVien o) {
        if(this.totalScore != o.totalScore) {
            return Double.compare(o.totalScore, this.totalScore);
        }
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+formatScore(bonusScore)+" "+formatScore(totalScore)+" "+status;
    }
}

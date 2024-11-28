package J07057_diemtuyensinh;

public class ThiSinh implements Comparable<ThiSinh> {
    private String id;
    private String name;
    private double score;
    private String nation;
    private double bonusScore;
    private int area;
    private double totalScore;
    private String status;

    public ThiSinh(int i, String name, double score, String nation, int area) {
        this.id = "TS" + String.format("%02d", i+1);
        this.name = name;
        this.score = score;
        this.nation = nation;
        this.area = area;
        this.bonusScore = sovleBonusScore();
        this.totalScore = score + this.bonusScore;
        this.status = this.totalScore >= 20.5 ? "Do" : "Truot";
    }

    public double sovleBonusScore() {
        double res = 0f;
        if(area == 1) res+=1.5;
        else if(area == 2) res+=1;
        if(!"Kinh".equals(nation)) res+=1.5;
        return res;
    }


    @Override
    public int compareTo(ThiSinh o) {
        if(o.totalScore != this.totalScore){
            return Double.compare(o.totalScore, this.totalScore);
        }
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+String.format("%.1f",totalScore)+" "+status;
    }
}

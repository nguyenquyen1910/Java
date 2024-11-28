package J07052_danhsachtrungtuyenfile;

import java.text.DecimalFormat;

public class ThiSinh implements Comparable<ThiSinh> {
    private String id;
    private String name;
    private double mathScore;
    private double physiScore;
    private double chemiScore;
    private double bonusScore;
    private double totalScore;
    private String status;

    public ThiSinh(String id, String name, double mathScore, double physiScore, double chemiScore) {
        this.id = id;
        this.name = name;
        this.mathScore = mathScore;
        this.physiScore = physiScore;
        this.chemiScore = chemiScore;
        this.bonusScore = solveBonusScore();
        this.totalScore = mathScore*2+physiScore+chemiScore+bonusScore;
    }

    public double solveBonusScore() {
        String s = id.substring(0, 3);
        if (s.equals("KV1")) {
            return 0.5;
        }
        if (s.equals("KV2")) {
            return 1.0;
        }
        if (s.equals("KV3")) {
            return 2.5;
        }
        return 0;
    }

    public static String removeZero(double number) {
        DecimalFormat format = new DecimalFormat("#.#");
        return format.format(number);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalScore() {
        return totalScore;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.totalScore != o.totalScore){
            return Double.compare(o.totalScore, this.totalScore);
        }
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + removeZero(bonusScore) + " " + removeZero(totalScore) + " " + status;
    }
}

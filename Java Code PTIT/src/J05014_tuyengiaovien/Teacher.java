package J05014_tuyengiaovien;

public class Teacher implements Comparable<Teacher> {
    private String id;
    private String name;
    private String code;
    private Double itScore;
    private Double speScore;
    private String speSubject;
    private Double bonusScore;
    private Double totalScore;
    private String status;

    public Teacher(int i, String name, String code, Double itScore, Double speScore) {
        this.id = "GV"+String.format("%02d", i+1);
        this.name = name;
        this.code = code;
        this.itScore = itScore;
        this.speScore = speScore;
        this.speSubject = solveSpeSubject();
        this.bonusScore = solveBonusScore();
        this.totalScore = this.itScore * 2 + this.speScore + this.bonusScore;
        this.status = this.totalScore >= 18 ? "TRUNG TUYEN" : "LOAI";
    }

    private String solveSpeSubject() {
        if (code.charAt(0) == 'A') {
            return "TOAN";
        }
        if (code.charAt(0) == 'B') {
            return "LY";
        }
        return "HOA";
    }

    private Double solveBonusScore() {
        if (code.charAt(1) == '1') {
            return 2.0;
        }
        if (code.charAt(1) == '2') {
            return 1.5;
        }
        if (code.charAt(1) == '3') {
            return 1.0;
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+speSubject+" "+String.format("%.1f", totalScore)+" "+status;
    }

    @Override
    public int compareTo(Teacher o) {
        if(!this.totalScore.equals(o.totalScore)){
            return o.totalScore.compareTo(this.totalScore);
        }
        return this.id.compareTo(o.id);
    }
}

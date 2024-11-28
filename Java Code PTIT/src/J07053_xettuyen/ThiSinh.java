package J07053_xettuyen;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThiSinh {
    private String id;
    private String name;
    private Date birth;
    private double theoryScore;
    private double practiceScore;
    private double bonusScore;
    private Long meanScore;
    private String status;

    public ThiSinh(int i, String name, Date birth, double theoryScore, double practiceScore) {
        this.id = "PH" + String.format("%02d",i+1);
        this.name = name;
        this.birth = birth;
        this.theoryScore = theoryScore;
        this.practiceScore = practiceScore;
        this.bonusScore = solveBonusScore();
        this.meanScore = Math.round((theoryScore+practiceScore)/2.0 + this.bonusScore) > 10 ? 10 : Math.round((theoryScore+practiceScore)/2.0 + this.bonusScore);
        this.status = solveStatus();
    }

    public double solveBonusScore() {
        if(theoryScore>=8 && practiceScore>=8){
            return 1;
        }
        if(theoryScore>=7.5 && practiceScore>=7.5){
            return 0.5;
        }
        return 0;
    }

    public String solveStatus(){
        if(5 <= meanScore && meanScore <=6){
            return "Trung binh";
        }
        else if(meanScore==7){
            return "Kha";
        }
        else if(meanScore==8){
            return "Gioi";
        }
        else if(meanScore==9 || meanScore==10){
            return "Xuat sac";
        }
        return "Truot";
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return id+" "+name+" "+(2021-Integer.parseInt(sdf.format(birth).toString().substring(6)))+" "+meanScore+" "+status;
    }
}

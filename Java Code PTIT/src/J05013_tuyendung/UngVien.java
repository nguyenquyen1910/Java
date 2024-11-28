package J05013_tuyendung;

public class UngVien implements Comparable<UngVien> {
    private String id,name,status;
    private double score1,score2,total;

    public UngVien(int i, String name, double score1, double score2) {
        this.id = "TS"+String.format("%02d",i+1);
        this.name = name;
        this.score1 = solveScore(score1);
        this.score2 = solveScore(score2);
        this.total=(this.score1+this.score2)/2;
        this.status=solveStatus();
    }

    public double solveScore(double score){
        if(score>10){
            return score/10;
        }
        return score;
    }

    public String solveStatus(){
        String res="";
        if(total<5){
            res="TRUOT";
        }
        else if(5<=total && total<8){
            res="CAN NHAC";
        }
        else if(8<=total && total<9.5){
            res="DAT";
        }
        else{
            res="XUAT SAC";
        }
        return res;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+String.format("%.2f",total)+" "+status;
    }

    @Override
    public int compareTo(UngVien o) {
        return Double.compare(o.total,this.total);
    }
}

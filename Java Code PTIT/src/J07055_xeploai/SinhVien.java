package J07055_xeploai;

public class SinhVien implements Comparable<SinhVien> {
    private String id;
    private String name;
    private int practiceScore;
    private int onlineScore;
    private int testScore;
    private double meanScore;
    private String status;

    public SinhVien(int i, String name, int practiceScore, int onlineScore, int testScore) {
        this.id = "SV" + String.format("%02d", i+1);
        this.name = name;
        this.practiceScore = practiceScore;
        this.onlineScore = onlineScore;
        this.testScore = testScore;
        this.meanScore = (practiceScore * 0.25 + onlineScore * 0.35 + testScore * 0.4);
        this.status = solveStatus();
    }

    public String solveStatus(){
        String res="";
        if(meanScore >= 8){
            res += "GIOI";
        }
        else if(6.5 <= meanScore && meanScore < 8){
            res += "KHA";
        }
        else if(5 <= meanScore && meanScore < 6.5){
            res += "TRUNG BINH";
        }
        else if(meanScore<5){
            res += "KEM";
        }
        return res;
    }

    @Override
    public int compareTo(SinhVien o) {
        return Double.compare(o.meanScore, this.meanScore);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+String.format("%.2f",meanScore)+" "+status;
    }
}

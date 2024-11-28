package J04005_khaibaolopthisinh;

public class ThiSinh {
    private String name,date;
    private float score1,score2,score3,total;

    public ThiSinh(String name, String date, float score1, float score2, float score3) {
        this.name = name;
        this.date = date;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.total = score1 + score2 + score3;
    }

    @Override
    public String toString() {
        return name+" "+date+" "+String.format("%.1f",total);
    }
}

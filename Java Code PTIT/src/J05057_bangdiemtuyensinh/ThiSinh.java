package J05057_bangdiemtuyensinh;

public class ThiSinh {
    private String id,name,status;
    private Float score1,score2,score3,total,priScore;

    public ThiSinh(String id, String name, Float score1, Float score2, Float score3) {
        this.id = id;
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.priScore=caculatePriScore();
        this.total=score1*2+score2+score3;
        this.status=solveStatus();
    }

    public Float caculatePriScore() {
        switch (id.substring(0, 3)) {
            case "KV1":
                return 0.5f;
            case "KV2":
                return 1f;
            case "KV3":
                return 2.5f;
            default:
                return 0f;
        }
    }

    private String solveStatus() {
        return total+priScore >= 24 ? "TRUNG TUYEN" : "TRUOT";
    }

    @Override
    public String toString() {
        String priScoreStr = (priScore == priScore.intValue()) ? String.format("%d", priScore.intValue()) : String.format("%.1f", priScore);
        String totalStr = (total == total.intValue()) ? String.format("%d", total.intValue()) : String.format("%.1f", total);
        return id+" "+name+" "+priScoreStr+" "+totalStr+" "+status;
    }
}

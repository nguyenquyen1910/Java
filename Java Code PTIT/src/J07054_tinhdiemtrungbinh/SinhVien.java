package J07054_tinhdiemtrungbinh;

public class SinhVien implements Comparable<SinhVien> {
    private String id;
    private String name;
    private double oopScore;
    private double cppScore;
    private double cScore;
    private double meanScore;
    private int rank;

    public SinhVien(int i, String name, double oopScore, double cppScore, double cScore) {
        this.id = "SV" + String.format("%02d", i+1);
        this.name = solveName(name);
        this.oopScore = oopScore;
        this.cppScore = cppScore;
        this.cScore = cScore;
        this.meanScore = (3*this.oopScore + 3*this.cppScore + 2*this.cScore) / 8.0;
    }

    public double getMeanScore() {
        return meanScore;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    private String solveName(String name){
        String[] tmp = name.split("\\s+");
        String res="";
        for(String it : tmp){
            res+=it.substring(0,1).toUpperCase()+it.substring(1).toLowerCase()+" ";
        }
        return res.trim();
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.meanScore != o.meanScore){
            return Double.compare(o.meanScore, this.meanScore);
        }
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+String.format("%.2f", meanScore)+" "+rank;
    }
}

package J05030_bangdiemthanhphan1;

import java.util.List;

public class SinhVien implements Comparable<SinhVien> {
    private String id;
    private String name;
    private String className;
    private List<Double> score;

    public SinhVien(String id, String name, String className, List<Double> score) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.score = score;
    }


    @Override
    public int compareTo(SinhVien o) {
        return this.name.compareTo(o.name);
    }

        @Override
        public String toString() {
            String scoresString = "";
            for(Double it : score){
                scoresString += String.format("%.1f",it) + " ";
            }
        return id+" "+name+" "+className+" "+scoresString;
    }
}

package J05054_xephanghocsinh;

public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private Double score;
    private String status;
    private Integer rank;
    public Student(int i, String name, Double score) {
        this.id = "HS" + String.format("%02d", i+1);
        this.name = name;
        this.score = score;
        this.status = solveStatus();
    }

    public Double getScore() {
        return score;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    private String solveStatus() {
        if(score < 5){
            return "Yeu";
        }
        if(score < 7){
            return "Trung Binh";
        }
        if(score < 9){
            return "Kha";
        }
        return "Gioi";
    }

    @Override
    public String toString() {
        return id+" "+name+" "+score+" "+status+" "+rank;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.score, this.score);
    }
}

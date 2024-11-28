package luyentaplaptrinh;

public class SinhVien implements Comparable<SinhVien> {
    private String name;
    private int correct,submit;
    public SinhVien(String name, int correct, int submit) {
        this.name = name;
        this.correct = correct;
        this.submit = submit;
    }

    @Override
    public String toString() {
        return name+" "+correct+" "+submit;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.correct != o.correct){
            return o.correct - this.correct;
        }
        if(this.submit != o.submit){
            return this.submit - o.submit;
        }
        return this.name.compareTo(o.name);
    }

    public String getName() {
        return null;
    }
}

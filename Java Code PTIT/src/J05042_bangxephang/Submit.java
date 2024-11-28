package J05042_bangxephang;

public class Submit implements Comparable<Submit> {
    private String name;
    private Integer correct;
    private Integer test;

    public Submit(String name, Integer correct, Integer test) {
        this.name = name;
        this.correct = correct;
        this.test = test;
    }

    @Override
    public String toString() {
        return name+" "+correct+" "+test;
    }

    @Override
    public int compareTo(Submit o) {
        if(!this.correct.equals(o.correct)){
            return o.correct.compareTo(this.correct);
        }
        if(!this.test.equals(o.test)){
            return this.test.compareTo(o.test);
        }
        return this.name.compareTo(o.name);
    }
}

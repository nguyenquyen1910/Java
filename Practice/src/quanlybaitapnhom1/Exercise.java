package quanlybaitapnhom1;

public class Exercise {
    private int exid;
    private String exName;
    public Exercise(int i, String exName) {
        this.exid = i+1;
        this.exName = exName;
    }

    public int getExid() {
        return exid;
    }

    public String getExName() {
        return exName;
    }
}

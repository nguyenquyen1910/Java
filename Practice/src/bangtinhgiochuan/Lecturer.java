package bangtinhgiochuan;

public class Lecturer {
    private String lecId;
    private String lecName;
    private Double totalTime;

    public Lecturer(String lecId, String lecName) {
        this.lecId = lecId;
        this.lecName = lecName;
        this.totalTime = 0.0;
    }

    public String getLecId() {
        return lecId;
    }

    public String getLecName() {
        return lecName;
    }

    public void addTotalTime(double time){
        this.totalTime+=time;
    }

    public Double getTotalTime() {
        return totalTime;
    }

    @Override
    public String toString() {
        return lecName+" "+String.format("%.2f", totalTime);
    }
}

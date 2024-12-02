package J06008_tinhgiochuanchogiaovien;

public class Subject {
    private String id;
    private String name;
    private double totalTime;

    public Subject(String id, String name) {
        this.id = id;
        this.name = name;
        this.totalTime = 0.0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addTime(double time) {
        this.totalTime += time;
    }

    public double getTotalTime() {
        return totalTime;
    }

    @Override
    public String toString() {
        return name+" "+totalTime;
    }
}

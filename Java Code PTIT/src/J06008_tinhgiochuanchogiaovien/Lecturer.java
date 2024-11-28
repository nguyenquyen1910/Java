package J06008_tinhgiochuanchogiaovien;

public class Lecturer {
    private String id;
    private String name;
    private double totalTime;
    public Lecturer(String id, String name) {
        this.id = id;
        this.name = name;
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

    public double getTime() {
        return totalTime;
    }

    public double getTotalTime() {
        return totalTime;
    }
}

package J06007_bangtinhgio;

public class Lecturer {
    private String info,id,name;
    private double totalTime;
    public Lecturer(String info) {
        this.info=info;
        this.id=info.substring(0,4);
        this.name = info.substring(5);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void addTotalTime(double time){
        this.totalTime+=time;
    }
    public double getTotalTime(){
        return totalTime;
    }
}

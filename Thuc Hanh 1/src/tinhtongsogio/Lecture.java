package tinhtongsogio;

public class Lecture {
    private String info,id,name;
    private double totalTime;
    public Lecture(String info) {
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

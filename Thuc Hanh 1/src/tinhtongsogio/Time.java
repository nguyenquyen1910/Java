package tinhtongsogio;

public class Time implements Comparable<Time> {
    private String info,lecId,subId;
    private double time;
    private Lecture lecture;
    public Time(String info){
        this.info=info;
        this.lecId=info.substring(0,4);
        this.subId=info.substring(6,12);
        this.time=Double.parseDouble(info.substring(13));
    }

    public String getLecId() {
        return lecId;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public double getTime(){
        return time;
    }


    @Override
    public int compareTo(Time o) {
        return this.lecId.compareTo(o.lecId);
    }
}

package J07074_lichgiangdaytheomonhoc;

public class Schedule implements Comparable<Schedule> {
    private String scheId;
    private String subId;
    private String date;
    private int times;
    private String lecName;
    private String room;
    private Subject subject;

    public Schedule(int i, String subId, String date, int times, String lecName, String room) {
        this.scheId = "HP" + String.format("%03d", i+1);
        this.subId = subId;
        this.date = date;
        this.times = times;
        this.lecName = lecName;
        this.room = room;
    }

    public String getSubId() {
        return subId;
    }

    public String getLecName() {
        return lecName;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return scheId+" "+subject.getSubName()+" "+date+" "+times+" "+room;
    }

    @Override
    public int compareTo(Schedule o) {
        if(this.date.equals(o.date)){
            if(this.times == o.times){
                return this.lecName.compareTo(o.lecName);
            }
            return this.times - o.times;
        }
        return this.date.compareTo(o.date);
    }
}

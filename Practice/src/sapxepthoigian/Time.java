package sapxepthoigian;

public class Time implements Comparable<Time> {
    private int hour, minute, second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return hour+" "+minute+" "+second;
    }

    @Override
    public int compareTo(Time o) {
        if(this.hour != o.hour){
            return this.hour - o.hour;
        }
        if(this.minute != o.minute){
            return this.minute - o.minute;
        }
        return this.second - o.second;
    }
}

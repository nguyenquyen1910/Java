package J05055_xephangvdv1;

import java.util.Calendar;
import java.util.Date;

public class Athlete implements Comparable<Athlete> {
    private String id;
    private String name;
    private Date birthday;
    private Date timeStart;
    private Date timeEnd;
    private long realTime;
    private long priorityTime;
    private Long rankTime;
    private int rank;

    public Athlete(int i, String name, Date birthday, Date timeStart, Date timeEnd) {
        this.id = "VDV"+String.format("%02d", i+1);
        this.name = name;
        this.birthday = birthday;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.realTime = solveRealTime();
        this.priorityTime = solvePriorityTime();
        this.rankTime = solveRankTime();
    }

    private long solveRealTime() {
        return (timeEnd.getTime() - timeStart.getTime()) / 1000;
    }

    private long solvePriorityTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(birthday);
        int year = calendar.get(Calendar.YEAR);
        int age = 2021-year;

        if(age < 18) {
            return 0;
        }
        if(age < 25){
            return 1;
        }
        if(age < 32){
            return 2;
        }
        return 3;
    }

    private Long solveRankTime() {
        return realTime - priorityTime;
    }

    private String formatTime(long time) {
        long hour = time / 3600;
        long minute = time % 3600 / 60;
        long second = time % 60;
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public Long getRankTime() {
        return rankTime;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+formatTime(realTime)+" "+formatTime(priorityTime)+" "+formatTime(rankTime)+" "+rank;
    }

    @Override
    public int compareTo(Athlete o) {
        return Long.compare(this.rankTime, o.rankTime);
    }
}

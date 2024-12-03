package J07060_sapxeplichthi;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Schedule implements Comparable<Schedule> {
    private String sesId;
    private String subId;
    private String group;
    private int numberOfStudent;
    private Subject subject;
    private Session session;
    private Long date;

    public Schedule(String sesId, String subId, String group, int numberOfStudent) {
        this.sesId = sesId;
        this.subId = subId;
        this.group = group;
        this.numberOfStudent = numberOfStudent;
    }

    public String getSesId() {
        return sesId;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setSession(Session session) throws ParseException {
        this.session = session;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        this.date = sdf.parse(session.getDay()+" "+session.getTime()).getTime();
    }

    @Override
    public String toString() {
        return session.getDay()+" "+session.getTime()+" "+session.getRoom()+" "+subject.getSubName()+" "+group+" "+numberOfStudent;
    }

    @Override
    public int compareTo(Schedule o) {
        if((long) this.date != o.date){
            return Long.compare(this.date, o.date);
        }
        return this.sesId.compareTo(o.sesId);
    }
}

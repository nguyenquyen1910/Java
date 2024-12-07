package sapxeplichthi;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Schedule implements Comparable<Schedule> {
    private String sesId, subId, group;
    private int quantity;
    private Subject subject;
    private Session session;
    private long time;

    public Schedule(String sesId, String subId, String group, int quantity) {
        this.sesId = sesId;
        this.subId = subId;
        this.group = group;
        this.quantity = quantity;
    }

    public String getSubId() {
        return subId;
    }

    public String getSesId() {
        return sesId;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setSession(Session session) throws ParseException {
        this.session = session;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        this.time = sdf.parse(session.getDate()+" "+session.getTime()).getTime();
    }

    @Override
    public String toString() {
        return session.getDate()+" "+session.getTime()+" "+session.getRoomId()+" "+subject.getSubName()+" "+group+" "+quantity;
    }

    @Override
    public int compareTo(Schedule o) {
        if(this.time != o.time){
            return Long.compare(this.time, o.time);
        }
        return this.sesId.compareTo(o.sesId);
    }
}

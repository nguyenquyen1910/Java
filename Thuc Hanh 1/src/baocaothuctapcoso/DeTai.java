package baocaothuctapcoso;

public class DeTai {
    private String idTopic;
    private String nameLecturer;
    private String nameTopic;

    public DeTai(int i, String nameLecturer, String nameTopic) {
        this.idTopic = "DT"+String.format("%03d",i+1);
        this.nameLecturer = nameLecturer;
        this.nameTopic = nameTopic;
    }

    public String getIdTopic() {
        return idTopic;
    }

    public String getNameLecturer() {
        return nameLecturer;
    }

    public String getNameTopic() {
        return nameTopic;
    }
}

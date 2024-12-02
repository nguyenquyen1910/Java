package J07020_hoadon2;

public class Customer {
    private String cusId;
    private String cusName;
    private String gender;
    private String dateOfBirth;
    private String address;

    public Customer(int i, String cusName, String gender, String dateOfBirth, String address) {
        this.cusId = "KH"+String.format("%03d", i+1);
        this.cusName = cusName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getCusId() {
        return cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}

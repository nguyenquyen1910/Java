package J06005_quanlibanhang;

public class Customer {
    private String cusId,cusName,cusGender,cusBirth,cusAddress;

    public Customer(int i, String cusName, String cusGender, String cusBirth, String cusAddress) {
        this.cusId = "KH"+String.format("%03d",i+1);
        this.cusName = cusName;
        this.cusGender = cusGender;
        this.cusBirth = cusBirth;
        this.cusAddress = cusAddress;
    }

    public String getCusId() {
        return cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public String getCusAddress() {
        return cusAddress;
    }
}

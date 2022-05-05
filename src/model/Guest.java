package model;

public class Guest {
    private String name;
    private String nic;
    private String telNo;
    private String email;
    private String address;

    public Guest(String name, String nic, String telNo, String email, String address) {
        this.name = name;
        this.nic = nic;
        this.telNo = telNo;
        this.email = email;
        this.address = address;
    }

    public Guest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                ", telNo='" + telNo + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

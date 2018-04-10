package be.dumbo.switchfully.parkshark.domain.contactinformation;

public class ContactInformation {

    private int id;
    private String mobilePhone;
    private String fixedLine;
    private String email;

    public ContactInformation() {
    }

    public ContactInformation(String mobilePhone, String fixedLine, String email) {
        this.mobilePhone = mobilePhone;
        this.fixedLine = fixedLine;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getFixedLine() {
        return fixedLine;
    }

    public String getEmail() {
        return email;
    }
}

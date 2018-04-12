package be.dumbo.switchfully.parkshark.api.contactinformation;

//copied and adpated code from order solution switchfully

public class ContactInformationDto {

    private String mobilePhone;
    private String fixedLine;
    private String email;

    private ContactInformationDto() {}

    public static ContactInformationDto contactInformationDto() {
        return new ContactInformationDto();
    }

    public ContactInformationDto withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public ContactInformationDto withFixedLine(String fixedLine) {
        this.fixedLine = fixedLine;
        return this;
    }

    public ContactInformationDto withEmail(String email) {
        this.email = email;
        return this;
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

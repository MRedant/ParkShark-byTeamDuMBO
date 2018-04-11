package be.dumbo.switchfully.parkshark.api.contactinformation;

import be.dumbo.switchfully.parkshark.domain.contactinformation.ContactInformation;

public class ContactInformationDto {

    private String mobilePhone;
    private String fixedLine;
    private String email;

    public ContactInformationDto() {}

    public ContactInformationDto(String mobilePhone, String fixedLine, String email) {
        this.mobilePhone = mobilePhone;
        this.fixedLine = fixedLine;
        this.email = email;
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

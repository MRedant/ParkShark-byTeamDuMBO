package be.dumbo.switchfully.parkshark.api.member;

//copied and adpated code from order solution switchfully

import be.dumbo.switchfully.parkshark.api.address.AddressDto;
import be.dumbo.switchfully.parkshark.api.contactinformation.ContactInformationDto;
import be.dumbo.switchfully.parkshark.api.licenseplate.LicensePlateDto;

public class MemberDto {

    private String name;
    private AddressDto address;
    private ContactInformationDto contactInformation;
    private LicensePlateDto licensePlate;
    private String registrationDate;

    private MemberDto() {}

    public static MemberDto memberDto() {
        return new MemberDto();
    }

    public MemberDto withName(String name) {
        this.name = name;
        return this;
    }

    public MemberDto withAddress(AddressDto address) {
        this.address = address;
        return this;
    }

    public MemberDto withContactInformation(ContactInformationDto contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }

    public MemberDto withLicensePlate(LicensePlateDto licensePlate) {
        this.licensePlate = licensePlate;
        return this;
    }

    public MemberDto withRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    public String getName() {
        return name;
    }

    public AddressDto getAddress() {
        return address;
    }

    public ContactInformationDto getContactInformation() {
        return contactInformation;
    }

    public LicensePlateDto getLicensePlate() {
        return licensePlate;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }
}

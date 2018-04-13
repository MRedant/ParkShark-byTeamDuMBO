package be.dumbo.switchfully.parkshark.api.member;

//copied and adapted code from order solution switchfully

import be.dumbo.switchfully.parkshark.api.address.AddressDto;
import be.dumbo.switchfully.parkshark.api.licenseplate.LicensePlateDto;

public class MemberDto {

    private int id;
    private String name;
    private LicensePlateDto licensePlate;
    private String registrationDate;
    private AddressDto address;
    private String mobilePhone;
    private String fixedLine;
    private String email;

    private MemberDto() {}

    public static MemberDto memberDto() {
        return new MemberDto();
    }

    public String getName() {
        return name;
    }

    public LicensePlateDto getLicensePlate() {
        return licensePlate;
    }

    public String getRegistrationDate() {
        return registrationDate;
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

    public AddressDto getAddress() {
        return address;
    }

    public MemberDto withName(String name) {
        this.name = name;
        return this;
    }

    public MemberDto withId(int id) {
        this.id = id;
        return this;
    }

    public MemberDto withAddress (AddressDto address){
        this.address = address;
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

    public MemberDto withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public MemberDto withFixedLine(String fixedLine) {
        this.fixedLine = fixedLine;
        return this;
    }

    public MemberDto withEmail(String email) {
        this.email = email;
        return this;
    }

}

package be.dumbo.switchfully.parkshark.api.member.licenseplate;

//copied and adpated code from order solution switchfully

public class LicensePlateDto {

    private int id;
    private String plateNumber;
    private String issuingCountry;

    private LicensePlateDto() {}

    public static LicensePlateDto licensePlateDto() {
        return new LicensePlateDto();
    }

    public LicensePlateDto withPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
        return this;
    }

    public LicensePlateDto withIssuingCountry(String issuingCountry) {
        this.issuingCountry = issuingCountry;
        return this;
    }

    public LicensePlateDto withId(int id) {
        this.id = id;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getIssuingCountry() {
        return issuingCountry;
    }


}

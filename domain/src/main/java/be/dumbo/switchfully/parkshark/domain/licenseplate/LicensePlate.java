package be.dumbo.switchfully.parkshark.domain.licenseplate;

public class LicensePlate {

    private int id;
    private String plateNumber;
    private String issuingCountry;

    public LicensePlate() {
    }

    public LicensePlate(String plateNumber, String issuingCountry) {
        this.plateNumber = plateNumber;
        this.issuingCountry = issuingCountry;
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

package be.dumbo.switchfully.parkshark.domain.licenseplate;

public class LicensePlate {

    private int id;
    private String plateNumber;
    private String issuingCountry;

    private LicensePlate() {}

    private LicensePlate(LicensePlateBuilder licensePlateBuilder) {
        this.plateNumber = licensePlateBuilder.getPlateNumber();
        this.issuingCountry = licensePlateBuilder.getIssuingCountry();
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

    public static class LicensePlateBuilder {

        private String plateNumber;
        private String issuingCountry;

        private LicensePlateBuilder() {}

        public static LicensePlateBuilder licensePlate() {
            return new LicensePlateBuilder();
        }

        public LicensePlate build() {
            return new LicensePlate(this);
        }

        public LicensePlateBuilder withPlateNumber(String plateNumber) {
            this.plateNumber = plateNumber;
            return this;
        }

        public LicensePlateBuilder withIssuingCountry(String issuingCountry) {
            this.issuingCountry = issuingCountry;
            return this;
        }

        public String getPlateNumber() {
            return plateNumber;
        }

        public String getIssuingCountry() {
            return issuingCountry;
        }
    }
}

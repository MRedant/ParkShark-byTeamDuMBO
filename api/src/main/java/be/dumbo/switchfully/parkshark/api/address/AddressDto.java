package be.dumbo.switchfully.parkshark.api.address;

public class AddressDto {

    private String streetName;
    private String streetNumber;
    private String postalCode;
    private String label;

    private AddressDto() {}

    public static AddressDto addressDto() {
        return new AddressDto();
    }

    public AddressDto withStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public AddressDto withStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    public AddressDto withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public AddressDto withLabel(String label) {
        this.label = label;
        return this;
    }

}

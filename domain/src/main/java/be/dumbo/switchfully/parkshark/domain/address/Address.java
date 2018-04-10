package be.dumbo.switchfully.parkshark.domain.address;

public class Address {

    private int id;
    private String streetName;
    private String streetNumber;
    private String postalCode;
    private String label;

    public Address() {
    }

    public Address(String streetName, String streetNumber, String postalCode, String label) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getLabel() {
        return label;
    }
}

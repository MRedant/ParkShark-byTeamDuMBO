package be.dumbo.switchfully.parkshark.domain.address;

public class Address {

    private String streetName;
    private String streetNumber;
    private String postalCode;
    private String label;

    private Address() {
    }

    public Address(AddressBuilder addressBuilder) {
        this.streetName = addressBuilder.getStreetName();
        this.streetNumber = addressBuilder.getStreetNumber();
        this.postalCode = addressBuilder.getPostalCode();
        this.label = addressBuilder.getLabel();
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

    public static class AddressBuilder {

        private String streetName;
        private String streetNumber;
        private String postalCode;
        private String label;

        private AddressBuilder() {}

        public static AddressBuilder address() {
            return new AddressBuilder();
        }

        public Address build() {
            return new Address(this);
        }

        public AddressBuilder withStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public AddressBuilder withStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public AddressBuilder withPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public AddressBuilder withLabel(String label) {
            this.label = label;
            return this;
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
}

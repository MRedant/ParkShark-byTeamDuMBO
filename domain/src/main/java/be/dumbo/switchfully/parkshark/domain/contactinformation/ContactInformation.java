package be.dumbo.switchfully.parkshark.domain.contactinformation;

public class ContactInformation {

    private int id;
    private String mobilePhone;
    private String fixedLine;
    private String email;

    private ContactInformation() {}

    private ContactInformation(ContactInformationBuilder contactInformationBuilder) {
        this.mobilePhone = contactInformationBuilder.getMobilePhone();
        this.fixedLine = contactInformationBuilder.getFixedLine();
        this.email = contactInformationBuilder.getFixedLine();
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

    public static class ContactInformationBuilder {

        private String mobilePhone;
        private String fixedLine;
        private String email;

        private ContactInformationBuilder() {}

        public static ContactInformationBuilder contactInformation() {
            return new ContactInformationBuilder();
        }

        public ContactInformation build() {
            return new ContactInformation(this);
        }

        public ContactInformationBuilder withMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }

        public ContactInformationBuilder withFixedLine(String fixedLine) {
            this.fixedLine = fixedLine;
            return this;
        }

        public ContactInformationBuilder withEmail(String email) {
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
}

package be.dumbo.switchfully.parkshark.domain.member;

import be.dumbo.switchfully.parkshark.domain.address.Address;
import be.dumbo.switchfully.parkshark.domain.contactinformation.ContactInformation;
import be.dumbo.switchfully.parkshark.domain.licenseplate.LicensePlate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;


@Entity
@Table(name="MEMBERS")
public class Member {

    @Id
    @Column(name="ID")
    private int id;
    private String name;
    private Address address;
    private ContactInformation contactInformation;
    private LicensePlate licensePlate;
    private LocalDate registrationDate;

    private Member() {}

    private Member(MemberBuilder memberBuilder) {
        this.name = memberBuilder.getName();
        this.address = memberBuilder.getAddress();
        this.contactInformation = memberBuilder.getContactInformation();
        this.licensePlate = memberBuilder.getLicensePlate();
        this.registrationDate = memberBuilder.getRegistrationDate();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public LicensePlate getLicensePlate() {
        return licensePlate;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public static class MemberBuilder {

        private String name;
        private Address address;
        private ContactInformation contactInformation;
        private LicensePlate licensePlate;
        private LocalDate registrationDate;

        private MemberBuilder() {}

        public static MemberBuilder member() {
            return new MemberBuilder();
        }

        public Member build() {
            return new Member(this);
        }

        public MemberBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public MemberBuilder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public MemberBuilder withContactInformation(ContactInformation contactInformation) {
            this.contactInformation = contactInformation;
            return this;
        }

        public MemberBuilder withLicensePlate(LicensePlate licensePlate) {
            this.licensePlate = licensePlate;
            return this;
        }

        public MemberBuilder withRegistrationDate(LocalDate registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }

        public String getName() {
            return name;
        }

        public Address getAddress() {
            return address;
        }

        public ContactInformation getContactInformation() {
            return contactInformation;
        }

        public LicensePlate getLicensePlate() {
            return licensePlate;
        }

        public LocalDate getRegistrationDate() {
            return registrationDate;
        }
    }
}

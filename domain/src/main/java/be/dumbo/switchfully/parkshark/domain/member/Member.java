package be.dumbo.switchfully.parkshark.domain.member;

import be.dumbo.switchfully.parkshark.domain.BaseEntity;
import be.dumbo.switchfully.parkshark.domain.member.address.Address;
import be.dumbo.switchfully.parkshark.domain.member.licenseplate.LicensePlate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="MEMBERS")
public class Member extends BaseEntity{

    @Id
    @Column(name="ID", updatable = false, nullable = false)
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "UUID")
    private UUID id;
    @Column(name="NAME")
    private String name;
    @Embedded
    private Address address;
    @OneToMany(cascade = {CascadeType.PERSIST})
    @JoinColumn(name="LICENSE_PLATE_ID")
    private List<LicensePlate> licensePlateList;
    @Column(name="MOBILE_PHONE")
    private String mobilePhone;
    @Column(name="FIXED_LINE")
    private String fixedLine;
    @Column(name="EMAIL")
    private String email;
    @Column(name="REGISTRATION_DATE")
    private LocalDate registrationDate;

    private Member() {}

    private Member(String name, Address address, List<LicensePlate> licensePlateList, String mobilePhone, String fixedLine, String email) {
        this.name = name;
        this.address = address;
        this.licensePlateList = licensePlateList;
        this.mobilePhone = mobilePhone;
        this.fixedLine = fixedLine;
        this.email = email;
        this.registrationDate = LocalDate.now();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public List<LicensePlate> getLicensePlate() {
        return licensePlateList;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public String getMobilePhone() { return mobilePhone; }

    public String getFixedLine() { return fixedLine; }

    public String getEmail() {  return email; }

    public static class MemberBuilder {

        private String name;
        private Address address;
        private List<LicensePlate> licensePlateList;
        private String mobilePhone;
        private String fixedLine;
        private String email;

        private MemberBuilder() {}

        public static MemberBuilder member() {
            return new MemberBuilder();
        }

        public MemberBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public MemberBuilder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public MemberBuilder withLicensePlate(List<LicensePlate> licensePlateList) {
            this.licensePlateList = licensePlateList;
            return this;
        }

        public MemberBuilder withEmail(String email) {
            this.email = email;
            return this;
        }
        public MemberBuilder withMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }

        public MemberBuilder withFixedLine(String fixedLine) {
            this.fixedLine = fixedLine;
            return this;
        }

        public Member build() {
            return new Member(name,address,licensePlateList,mobilePhone,fixedLine,email);
        }

    }
}

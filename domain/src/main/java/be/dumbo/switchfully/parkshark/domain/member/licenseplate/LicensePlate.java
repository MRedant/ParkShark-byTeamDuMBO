package be.dumbo.switchfully.parkshark.domain.member.licenseplate;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="LICENSEPLATES")
public class LicensePlate {

    @Id
    @Column(name="ID", updatable = false, nullable = false)
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "UUID")
    private int memberId;
    @Column(name="PLATE_NUMBER")
    private String plateNumber;
    @Column(name="ISSUING_COUNTRY")
    private String issuingCountry;

    private LicensePlate() {}

    public LicensePlate(String plateNumber, String issuingCountry) {
        this.plateNumber = plateNumber;
        this.issuingCountry = issuingCountry;
    }

    public UUID getId() {
        return memberId;
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

        public LicensePlateBuilder withPlateNumber(String plateNumber) {
            this.plateNumber = plateNumber;
            return this;
        }

        public LicensePlateBuilder withIssuingCountry(String issuingCountry) {
            this.issuingCountry = issuingCountry;
            return this;
        }

        public LicensePlate build() {
            return new LicensePlate(plateNumber, issuingCountry);
        }
    }
}

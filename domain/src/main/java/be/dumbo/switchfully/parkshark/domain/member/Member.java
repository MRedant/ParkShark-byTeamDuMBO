package be.dumbo.switchfully.parkshark.domain.member;

import be.dumbo.switchfully.parkshark.domain.address.Address;
import be.dumbo.switchfully.parkshark.domain.contactinformation.ContactInformation;
import be.dumbo.switchfully.parkshark.domain.licenseplate.LicensePlate;

import java.time.LocalDate;


public class Member {

    private int id;
    private String name;
    private Address address;
    private ContactInformation contactInformation;
    private LicensePlate licensePlate;
    private LocalDate registrationDate;

    public Member() {
    }

    public Member(String name, Address address, ContactInformation contactInformation, LicensePlate licensePlate, LocalDate registrationDate) {

        this.name = name;
        this.address = address;
        this.contactInformation = contactInformation;
        this.licensePlate = licensePlate;
        this.registrationDate = registrationDate;
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
}

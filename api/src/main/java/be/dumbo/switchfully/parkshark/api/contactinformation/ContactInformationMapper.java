package be.dumbo.switchfully.parkshark.api.contactinformation;

import be.dumbo.switchfully.parkshark.domain.contactinformation.ContactInformation;
import be.dumbo.switchfully.parkshark.infrastructure.dto.Mapper;

public class ContactInformationMapper extends Mapper<ContactInformationDto, ContactInformation> {


    @Override
    public ContactInformationDto toDto(ContactInformation domainObject) {
        return null;
    }

    @Override
    public ContactInformation toDomain(ContactInformationDto dtoObject) {
        return null;
    }
}

package be.dumbo.switchfully.parkshark.api.contactinformation;

//copied and adpated code from order solution switchfully

import be.dumbo.switchfully.parkshark.domain.contactinformation.ContactInformation;
import be.dumbo.switchfully.parkshark.infrastructure.dto.Mapper;

import javax.inject.Named;

import static be.dumbo.switchfully.parkshark.api.contactinformation.ContactInformationDto.contactInformationDto;
import static be.dumbo.switchfully.parkshark.domain.contactinformation.ContactInformation.ContactInformationBuilder.contactInformation;

@Named
public class ContactInformationMapper extends Mapper<ContactInformationDto, ContactInformation> {


    @Override
    public ContactInformationDto toDto(ContactInformation contactInformation) {
        return contactInformationDto()
                .withMobilePhone(contactInformation.getMobilePhone())
                .withFixedLine(contactInformation.getFixedLine())
                .withEmail(contactInformation.getEmail());
    }

    @Override
    public ContactInformation toDomain(ContactInformationDto contactInformationDto) {
        return contactInformation()
                .withMobilePhone(contactInformationDto.getMobilePhone())
                .withFixedLine(contactInformationDto.getFixedLine())
                .withEmail(contactInformationDto.getEmail())
                .build();
    }
}

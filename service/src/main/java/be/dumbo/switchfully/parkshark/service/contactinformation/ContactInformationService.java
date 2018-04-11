package be.dumbo.switchfully.parkshark.service.contactinformation;

import be.dumbo.switchfully.parkshark.domain.contactinformation.ContactInformation;
import be.dumbo.switchfully.parkshark.repository.contactinformation.ContactInformationRepository;

import javax.inject.Inject;

//copied from order solution switchfully

public class ContactInformationService {

    private ContactInformationRepository contactInformationRepository;
    private ContactInformationValidator contactInformationValidator;

    @Inject
    public ContactInformationService(ContactInformationRepository contactInformationRepository, ContactInformationValidator contactInformationValidator) {
        this.contactInformationRepository = contactInformationRepository;
        this.contactInformationValidator = contactInformationValidator;
    }

    public ContactInformation registerContactInformation(ContactInformation contactInformation) {
        if (!contactInformationValidator.isValidForCreation(contactInformation)) {
            contactInformationValidator.throwInvalidStateException(contactInformation, "registration");
        }
        return contactInformationRepository.save(contactInformation);
    }

}

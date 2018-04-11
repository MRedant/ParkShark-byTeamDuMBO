package be.dumbo.switchfully.parkshark.service.contactinformation;

//copied from order solution switchfully

import be.dumbo.switchfully.parkshark.domain.contactinformation.ContactInformation;

public class ContactInformationValidator {

    public boolean isValidForCreation(ContactInformation contactInformation) {
        return !isARequiredFieldEmptyOrNull(contactInformation) && contactInformation.getId() == 0;
    }

    private boolean isARequiredFieldEmptyOrNull(ContactInformation contactInformation) {
        return isNull(contactInformation) || isEmptyOrNull(contactInformation.getMobilePhone())
                || isEmptyOrNull(contactInformation.getFixedLine())
                || isEmptyOrNull(contactInformation.getEmail());
    }

    private boolean isNull(ContactInformation contactInformation) {
        return contactInformation == null;
    }

    private boolean isEmptyOrNull(String attribute) {
        return attribute == null || attribute.isEmpty();
    }

    public void throwInvalidStateException(ContactInformation contactInformation, String type) {
        throw new IllegalStateException("Invalid " + (contactInformation == null ? "NULL_ENTITY" : contactInformation.getClass().getSimpleName())
                + " provided for " + type + ". Provided object: " + (contactInformation == null ? null : contactInformation.toString()));
    }

}

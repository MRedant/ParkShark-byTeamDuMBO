package be.dumbo.switchfully.parkshark.repository.contactinformation;

import be.dumbo.switchfully.parkshark.domain.contactinformation.ContactInformation;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ContactInformationRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public ContactInformation save(ContactInformation contactInformation) {
        entityManager.persist(contactInformation);
        return contactInformation;
    }

}

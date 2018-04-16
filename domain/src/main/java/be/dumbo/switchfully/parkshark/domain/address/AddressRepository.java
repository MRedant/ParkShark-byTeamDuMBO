package be.dumbo.switchfully.parkshark.domain.address;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AddressRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Address save(Address address) {
        entityManager.persist(address);
        return address;
    }

}

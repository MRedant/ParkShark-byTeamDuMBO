package be.dumbo.switchfully.parkshark.repository.division;

import be.dumbo.switchfully.parkshark.domain.division.Division;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class DivisionRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Division save(Division division) {
        entityManager.persist(division);
        return division;
    }
}

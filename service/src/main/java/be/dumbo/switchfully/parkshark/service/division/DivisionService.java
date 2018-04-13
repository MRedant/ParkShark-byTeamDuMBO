package be.dumbo.switchfully.parkshark.service.division;

import be.dumbo.switchfully.parkshark.domain.division.Division;
import be.dumbo.switchfully.parkshark.repository.division.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Named;
import java.util.List;

@Named
public class DivisionService {

    @Autowired
    private DivisionRepository divisionRepository;

    public List<Division> getAllDivisions() {
        return divisionRepository.getAll();
    }
}

package be.dumbo.switchfully.parkshark.repository.division;

import be.dumbo.switchfully.parkshark.Application;
import be.dumbo.switchfully.parkshark.domain.division.Division;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class DivisionRepositoryTest {

    @Autowired
    private DivisionRepository divisionRepository;
//
//    public DivisionRepositoryTest() {
//    }
//
//
//    DivisionRepositoryTest(DivisionRepository divisionRepository) {
//        this.divisionRepository = divisionRepository;
//    }

    @Test
    public void save_createDivisionReturnsDivisionWithId() {
        //GIVEN

        //WHEN
        Division returnedDivision = divisionRepository.save(new Division("DivisionABC","SomeOldName","Maarten Supreme Leader"));
        //THEN
        Assertions.assertThat(returnedDivision).isNotNull();
        Assertions.assertThat(returnedDivision.getId()).isNotZero();
    }

//    @Test
//    public void getAll_returnsAllDivisions() {
//        //GIVEN
//        Division division1 = divisionRepository.save(new Division("DivisionABC","SomeOldName","Maarten Supreme Leader"));
//        Division division2 = divisionRepository.save(new Division("DivisionDEF","SomeOtherOldName","Omar"));
//        Division division3 = divisionRepository.save(new Division("DivisionGHI","SomeLastOldName","Brecht"));
//        //WHEN
//        List<Division> retrievedDivisions = divisionRepository.getAll();
//        //THEN
//        Assertions.assertThat(retrievedDivisions).containsExactly(division1,division2,division3);
//    }

}



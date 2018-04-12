package be.dumbo.switchfully.parkshark.repository.division;

import be.dumbo.switchfully.parkshark.domain.division.Division;
import be.dumbo.switchfully.parkshark.repository.member.TestApplication;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=TestApplication.class)
public class DivisionRepositoryTest {

    private DivisionRepository divisionRepository;

    public DivisionRepositoryTest() {
    }

    @Autowired
    DivisionRepositoryTest(DivisionRepository divisionRepository) {
        this.divisionRepository = divisionRepository;
    }

    @Test
    public void save_createDivisionReturnsDivisionWithId() {
        //GIVEN
        Division division = new Division("DivisionABC","SomeOldName","Maarten Supreme Leader");
        //WHEN
        Integer id = divisionRepository.save(division).getId();
        //THEN
        Assertions.assertThat(id).isNotNull();
    }

}


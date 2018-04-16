package be.dumbo.switchfully.parkshark.domain.division;

import be.dumbo.switchfully.parkshark.infrastructure.TestApplication;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=TestApplication.class)
@Transactional
//@Commit
public class DivisionRepositoryTest {

    @Autowired
    private DivisionRepository divisionRepository;

    @Test
    public void save_createDivisionReturnsDivisionWithId() {
        //GIVEN

        //WHEN
        Division returnedDivision = divisionRepository.save(new Division("DivisionABC","SomeOldName","Jan"));
        //THEN
        Assertions.assertThat(returnedDivision).isNotNull();
        Assertions.assertThat(returnedDivision.getId()).isNotZero();
    }

}



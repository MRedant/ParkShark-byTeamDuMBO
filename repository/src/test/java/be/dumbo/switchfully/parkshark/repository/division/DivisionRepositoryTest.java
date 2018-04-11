package be.dumbo.switchfully.parkshark.repository.division;

import be.dumbo.switchfully.parkshark.domain.division.Division;
import be.dumbo.switchfully.parkshark.repository.ParkSharkConfig;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(ParkSharkConfig.class)
@SpringBootTest(classes=DivisionRepositoryTest.DivisionRepositoryTestRunner.class)
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

    @SpringBootApplication(scanBasePackages = {"be.dumbo.switchfully"})
    public static class DivisionRepositoryTestRunner {
        public static void main(String[] args) {
            SpringApplication.run(DivisionRepositoryTestRunner.class,args);
        }
    }

}


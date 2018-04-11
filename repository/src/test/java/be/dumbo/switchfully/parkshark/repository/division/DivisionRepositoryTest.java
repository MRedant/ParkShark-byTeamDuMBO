//package be.dumbo.switchfully.parkshark.repository.division;
//
//import be.dumbo.switchfully.parkshark.domain.division.Division;
//import be.dumbo.switchfully.parkshark.repository.Parksharkconfig;
//import org.assertj.core.api.Assertions;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
//
//@SpringJUnitConfig(Parksharkconfig.class)
//public class DivisionRepositoryTest {
//
//    private DivisionRepository divisionRepository;
//
//    @Autowired
//    DivisionRepositoryTest(DivisionRepository divisionRepository) {
//        this.divisionRepository = divisionRepository;
//    }
//
//    @Test
//    void save_createDivisionReturnsDivisionWithId() {
//        //GIVEN
//        Division division = new Division("DivisionABC","SomeOldName","Maarten Supreme Leader");
//        //WHEN
//        Integer id = divisionRepository.save(division).getId();
//        //THEN
//        Assertions.assertThat(id).isNotNull();
//
//    }
//}
//

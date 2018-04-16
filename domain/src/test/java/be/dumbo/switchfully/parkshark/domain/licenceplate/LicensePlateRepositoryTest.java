package be.dumbo.switchfully.parkshark.domain.licenceplate;

import be.dumbo.switchfully.parkshark.domain.licenseplate.LicensePlate;
import be.dumbo.switchfully.parkshark.domain.licenseplate.LicensePlateRepository;
import be.dumbo.switchfully.parkshark.infrastructure.TestApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=TestApplication.class)
@Transactional
public class LicensePlateRepositoryTest {

    @Autowired
    private LicensePlateRepository licensePlateRepository;

    @Test
    public void saveLicensePlate_happyPath() {
        //GIVEN

        //WHEN
        LicensePlate savedLicencePlate = licensePlateRepository.save(LicensePlate.LicensePlateBuilder.licensePlate()
                    .withIssuingCountry("Belgium")
                    .withPlateNumber("1-ABC-123")
                    .build());
        //THEN
        assertThat(savedLicencePlate).isNotNull();
        assertThat(savedLicencePlate.getId()).isNotZero();
    }
}
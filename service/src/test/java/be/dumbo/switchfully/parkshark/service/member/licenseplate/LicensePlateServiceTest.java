//package be.dumbo.switchfully.parkshark.service.member.licenseplate;
//
//import be.dumbo.switchfully.parkshark.domain.member.licenseplate.LicensePlate;
//import be.dumbo.switchfully.parkshark.infrastructure.testApplication.TestApplication;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = TestApplication.class)
//public class LicensePlateServiceTest {
//
//    @Autowired
//    private LicensePlateService licensePlateService;
//
//    @Test
//    public void registerLicenseService() {
//        LicensePlate savedLicencePlate = licensePlateService.registerLicenseService(LicensePlate.LicensePlateBuilder.licensePlate()
//                .withIssuingCountry("Belgium")
//                .withPlateNumber("1-ABC-123")
//                .build());
//        assertThat(savedLicencePlate).isNotNull();
//        assertThat(savedLicencePlate.getId()).isNotZero();
//
//    }
//}

package be.dumbo.switchfully.parkshark.repository.member;

import be.dumbo.switchfully.parkshark.domain.address.Address;
import be.dumbo.switchfully.parkshark.domain.licenseplate.LicensePlate;
import be.dumbo.switchfully.parkshark.domain.member.Member;
import be.dumbo.switchfully.parkshark.infrastructure.TestApplication;
import be.dumbo.switchfully.parkshark.repository.licenseplate.LicensePlateRepository;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
@Transactional
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private LicensePlateRepository licensePlateRepository;

    private LicensePlate returnedLicenceplate;
    private Member returnedMember;

    @Before
    public void setUp() throws Exception {
        returnedLicenceplate = licensePlateRepository.save(LicensePlate.LicensePlateBuilder.licensePlate()
                .withPlateNumber("1-abc-213")
                .withIssuingCountry("BE")
                .build());
        returnedMember = memberRepository.save(Member.MemberBuilder.member()
                .withName("Maarten")
                .withAddress(Address.AddressBuilder.address()
                        .withStreetName("Kerkstraat")
                        .withStreetNumber("69")
                        .withPostalCode("9000")
                        .withLabel("Gent")
                        .build()
                )
                .withEmail("maarten@gent.be")
                .withFixedLine("089/555555")
                .withMobilePhone("0489898989")
                .withLicensePlate(returnedLicenceplate)
                .build());
    }

    @Test
    public void save_givenAMember_thenPersistPersonToDatabaseAndReturnMember() {
        Assertions.assertThat(returnedMember.getId()).isNotZero();
        Assertions.assertThat(returnedMember).isNotNull();
    }
}



package be.dumbo.switchfully.parkshark.domain.member;

import be.dumbo.switchfully.parkshark.domain.member.address.Address;
import be.dumbo.switchfully.parkshark.domain.member.licenseplate.LicensePlate;
import be.dumbo.switchfully.parkshark.infrastructure.testApplication.TestApplication;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
@Transactional
@Commit
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;


    private Member returnedMember;

    @Before
    public void setUp() throws Exception {
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
                .withLicensePlate(Arrays.asList(LicensePlate.LicensePlateBuilder.licensePlate()
                        .withPlateNumber("1-abc-213")
                        .withIssuingCountry("BE")
                        .build()))
                .build());
    }

    @Test
    public void save_givenAMember_thenPersistPersonToDatabaseAndReturnMember() {
        Assertions.assertThat(returnedMember.getId()).isNotZero();
        Assertions.assertThat(returnedMember).isNotNull();
    }
}


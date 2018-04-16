package be.dumbo.switchfully.parkshark.service.member;

import be.dumbo.switchfully.parkshark.domain.member.address.Address;
import be.dumbo.switchfully.parkshark.domain.member.licenseplate.LicensePlate;
import be.dumbo.switchfully.parkshark.domain.member.Member;
import be.dumbo.switchfully.parkshark.infrastructure.testApplication.TestApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    private Member returnedMember;

    @Before
    public void setUp() throws Exception {
        returnedMember = memberService.registerMember(Member.MemberBuilder.member()
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
                .withLicensePlate(LicensePlate.LicensePlateBuilder.licensePlate()
                        .withPlateNumber("1-abc-213")
                        .withIssuingCountry("BE")
                        .build())
                .build());
    }

    @Test
    public void registerMember() {
        assertThat(returnedMember.getId()).isNotZero();
        assertThat(returnedMember).isNotNull();
    }
}
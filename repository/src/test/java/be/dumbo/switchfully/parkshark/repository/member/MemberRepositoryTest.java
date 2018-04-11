
package be.dumbo.switchfully.parkshark.repository.member;

import be.dumbo.switchfully.parkshark.repository.ParkSharkConfig;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(ParkSharkConfig.class)
public class MemberRepositoryTest {

    private MemberRepository memberRepository;

    @Autowired
    public MemberRepositoryTest(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Test
    void save_givenAMember_thenPersistPersonToDatabaseAndReturnMember() {

    }
}


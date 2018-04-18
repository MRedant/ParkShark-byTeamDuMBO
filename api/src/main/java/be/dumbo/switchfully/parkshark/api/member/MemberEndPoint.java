package be.dumbo.switchfully.parkshark.api.member;

import org.springframework.web.bind.annotation.RequestBody;

public interface MemberEndPoint {

    String registerMember(@RequestBody MemberDto memberDto);

}

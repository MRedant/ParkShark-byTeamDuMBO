package be.dumbo.switchfully.parkshark.api.member;
// copied and adapted code from order solution switchfully
import be.dumbo.switchfully.parkshark.service.member.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import javax.inject.Inject;

@RestController
@RequestMapping(path = "/" + MemberController.RESOURCE_NAME)
public class MemberController {

    public static final String RESOURCE_NAME = "member";

    private MemberMapper memberMapper;
    private MemberService memberService;

    @Inject
    public MemberController(MemberMapper memberMapper, MemberService memberService) {
        this.memberMapper = memberMapper;
        this.memberService = memberService;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public MemberDto registerMember(@RequestBody MemberDto memberDto){
        return memberMapper.toDto(memberService.registerMember(memberMapper.toDomain(memberDto)));
    }
}

package be.dumbo.switchfully.parkshark.api.member;

import be.dumbo.switchfully.parkshark.domain.member.Member;
import be.dumbo.switchfully.parkshark.infrastructure.dto.Mapper;

public class MemberMapper extends Mapper<MemberDto, Member> {


    @Override
    public MemberDto toDto(Member domainObject) {
        return null;
    }

    @Override
    public Member toDomain(MemberDto dtoObject) {
        return null;
    }
}

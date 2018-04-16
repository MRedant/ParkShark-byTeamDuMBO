
package be.dumbo.switchfully.parkshark.api.member;

import be.dumbo.switchfully.parkshark.api.member.address.AddressMapper;
import be.dumbo.switchfully.parkshark.api.member.licenseplate.LicensePlateMapper;
import be.dumbo.switchfully.parkshark.domain.member.Member;
import be.dumbo.switchfully.parkshark.infrastructure.dto.Mapper;

import javax.inject.Inject;
import javax.inject.Named;

import static be.dumbo.switchfully.parkshark.api.member.MemberDto.memberDto;

@Named
public class MemberMapper extends Mapper<MemberDto, Member> {

    private AddressMapper addressMapper;
    private LicensePlateMapper licensePlateMapper;

    @Inject
    public MemberMapper(AddressMapper addressMapper, LicensePlateMapper licensePlateMapper) {
        this.addressMapper = addressMapper;
        this.licensePlateMapper = licensePlateMapper;

    }

    @Override
    public MemberDto toDto(Member member) {
        return memberDto()
                .withId(member.getId());
    }

    @Override
    public Member toDomain(MemberDto memberDto) {
        return Member.MemberBuilder.member()
                .withName(memberDto.getName())
                .withAddress(addressMapper.toDomain(memberDto.getAddress()))
                .withMobilePhone(memberDto.getMobilePhone())
                .withFixedLine(memberDto.getFixedLine())
                .withEmail(memberDto.getEmail())
                .withLicensePlate(licensePlateMapper.toDomain(memberDto.getLicensePlate()))
                .build();
    }
}


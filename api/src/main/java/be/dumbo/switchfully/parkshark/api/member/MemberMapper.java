/*
package be.dumbo.switchfully.parkshark.api.member;

//copied and adpated code from order solution switchfully

import be.dumbo.switchfully.parkshark.api.address.AddressMapper;
import be.dumbo.switchfully.parkshark.api.contactinformation.ContactInformationMapper;
import be.dumbo.switchfully.parkshark.api.licenseplate.LicensePlateMapper;
import be.dumbo.switchfully.parkshark.domain.member.Member;
import be.dumbo.switchfully.parkshark.infrastructure.dto.Mapper;

import javax.inject.Inject;
import javax.inject.Named;

import java.time.LocalDate;

import static be.dumbo.switchfully.parkshark.api.member.MemberDto.memberDto;

@Named
public class MemberMapper extends Mapper<MemberDto, Member> {

    private AddressMapper addressMapper;
    private ContactInformationMapper contactInformationMapper;
    private LicensePlateMapper licensePlateMapper;

    @Inject
    public MemberMapper(AddressMapper addressMapper, ContactInformationMapper contactInformationMapper
            , LicensePlateMapper licensePlateMapper) {
        this.addressMapper = addressMapper;
        this.contactInformationMapper = contactInformationMapper;
        this.licensePlateMapper = licensePlateMapper;
    }

    @Override
    public MemberDto toDto(Member member) {
        return memberDto()
                .withName(member.getName())
                .withContactInformation(contactInformationMapper.toDto(member.getContactInformation()))
                .withAddress(addressMapper.toDto(member.getAddress()))
                .withLicensePlate(licensePlateMapper.toDto(member.getLicensePlate()))
                .withRegistrationDate(member.getRegistrationDate().toString());

    }

    @Override
    public Member toDomain(MemberDto memberDto) {
        return Member.MemberBuilder.member()
                .withName(memberDto.getName())
                .withContactInformation(contactInformationMapper.toDomain(memberDto.getContactInformation()))
                .withAddress(addressMapper.toDomain(memberDto.getAddress()))
                .withLicensePlate(licensePlateMapper.toDomain(memberDto.getLicensePlate()))
                .withRegistrationDate(LocalDate.)
    }
}
*/

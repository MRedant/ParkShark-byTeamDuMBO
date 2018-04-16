package be.dumbo.switchfully.parkshark.api.member.licenseplate;

import be.dumbo.switchfully.parkshark.domain.member.licenseplate.LicensePlate;
import be.dumbo.switchfully.parkshark.infrastructure.mapper.Mapper;

import javax.inject.Named;

@Named
public class LicensePlateMapper extends Mapper<LicensePlateDto, LicensePlate>{
    @Override
    public LicensePlateDto toDto(LicensePlate licensePlate) {
        return LicensePlateDto.licensePlateDto()
                .withId(licensePlate.getId())
                .withPlateNumber(licensePlate.getPlateNumber())
                .withIssuingCountry(licensePlate.getIssuingCountry());
    }

    @Override
    public LicensePlate toDomain(LicensePlateDto licensePlateDto) {
        return LicensePlate.LicensePlateBuilder.licensePlate()
                .withPlateNumber(licensePlateDto.getPlateNumber())
                .withIssuingCountry(licensePlateDto.getIssuingCountry())
                .build();
    }
}
package com.example.demo.mapper;

import com.example.demo.dto.phongBan.PhongBanRequest;
import com.example.demo.dto.phongBan.PhongBanResponse;
import com.example.demo.entity.PhongBan;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PhongBanMapper {
    PhongBanResponse toDto(PhongBan phongBan);
    PhongBan toCreateEntity(PhongBanRequest phongBanRequest);
    List<PhongBanResponse> toEntityDtoList (List<PhongBan> phongBanList);
}

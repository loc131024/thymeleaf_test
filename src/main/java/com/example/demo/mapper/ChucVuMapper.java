package com.example.demo.mapper;

import com.example.demo.dto.chucVu.ChucVuRequest;
import com.example.demo.dto.chucVu.ChucVuResponse;
import com.example.demo.entity.ChucVu;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ChucVuMapper{

    ChucVuResponse toDto(ChucVu chucVu);
    ChucVu toCreateEntity(ChucVuRequest chucVuRequest);
    List<ChucVuResponse> toEntityDtoList(List<ChucVu> chucVuList);
}

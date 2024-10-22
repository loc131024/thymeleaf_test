package com.example.demo.mapper;

import com.example.demo.dto.nhanVien.NhanVienRequest;
import com.example.demo.dto.nhanVien.NhanVienResponse;
import com.example.demo.entity.ChucVu;
import com.example.demo.entity.NhanVien;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NhanVienMapper {
    NhanVienResponse toDto (NhanVien nhanVien);
    NhanVien toCreateEntity (NhanVienRequest nhanVienRequest);
    List<NhanVienResponse> toEntityDtoList (List<NhanVien> nhanVienList);
}

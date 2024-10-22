package com.example.demo.dto.nhanVien;

import com.example.demo.entity.ChucVu;
import com.example.demo.entity.PhongBan;

import lombok.*;
import lombok.experimental.FieldDefaults;


import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NhanVienResponse {
    Integer maNhanVien;

    String hoTen;
    LocalDate ngaySinh;
    String gioiTinh;
    String soDienThoai;
    String email;
    PhongBan phongBan;

    ChucVu chucVu;

    LocalDate ngayVaoLam;
    Double luong;
}

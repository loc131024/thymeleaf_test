package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "nhan_vien")
@Getter
@Setter
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NhanVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer maNhanVien;

    String hoTen;
    LocalDate ngaySinh;
    String gioiTinh;
    String soDienThoai;
    String email;

    @OneToOne
    @JoinColumn(name = "ma_phong_ban", referencedColumnName = "maPhongBan")
    PhongBan phongBan;

    @OneToOne
    @JoinColumn(name = "ma_chuc_vu", referencedColumnName = "maChucVu")
    ChucVu chucVu;

    LocalDate ngayVaoLam;
    Double luong;

}

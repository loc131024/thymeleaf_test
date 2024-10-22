package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "chuc_vu")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChucVu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer maChucVu;

    String tenChucVu;
}

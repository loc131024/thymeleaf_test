package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "phong_ban")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PhongBan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer maPhongBan;
    String tenPhongBan;


}

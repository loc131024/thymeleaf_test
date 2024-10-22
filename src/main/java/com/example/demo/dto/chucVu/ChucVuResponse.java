package com.example.demo.dto.chucVu;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChucVuResponse {
    Integer maChucVu;

    String tenChucVu;
}

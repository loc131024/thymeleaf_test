package com.example.demo.service;

import com.example.demo.dto.phongBan.PhongBanRequest;
import com.example.demo.dto.phongBan.PhongBanResponse;
import com.example.demo.entity.PhongBan;

import java.util.List;

public interface PhongBanService {

    List<PhongBanResponse> getAll ();
    PhongBanResponse create (PhongBanRequest phongBanRequest);
    PhongBanResponse update(Integer id, PhongBanRequest phongBanRequest);
    void delete(Integer id);
    PhongBanResponse getDtoById(Integer id);
    PhongBan getById(Integer id);
    List<PhongBanResponse> createEntities(List<PhongBanRequest> requests);
}

package com.example.demo.service;

import com.example.demo.dto.phongBan.PhongBanRequest;
import com.example.demo.dto.phongBan.PhongBanResponse;
import com.example.demo.entity.PhongBan;
import com.example.demo.mapper.PhongBanMapper;
import com.example.demo.repository.PhongBanRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhongBanServiceImpl implements PhongBanService{

    protected final PhongBanRepository phongBanRepository;
    protected final PhongBanMapper phongBanMapper;

    public PhongBanServiceImpl(PhongBanRepository phongBanRepository
            , PhongBanMapper phongBanMapper) {
        this.phongBanRepository = phongBanRepository;
        this.phongBanMapper = phongBanMapper;
    }

    @Override
    public List<PhongBanResponse> getAll() {
        List<PhongBan> phongBanList = phongBanRepository.findAll();
        return phongBanMapper.toEntityDtoList(phongBanList);
    }

    @Override
    public PhongBanResponse create(PhongBanRequest phongBanRequest) {
        PhongBan phongBan = phongBanMapper.toCreateEntity(phongBanRequest);
        return phongBanMapper.toDto(phongBanRepository.save(phongBan));
    }

    @Override
    public PhongBanResponse update(Integer id, PhongBanRequest phongBanRequest) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public PhongBanResponse getDtoById(Integer id) {
        return null;
    }

    @Override
    public PhongBan getById(Integer id) {
        return null;
    }

    @Override
    public List<PhongBanResponse> createEntities(List<PhongBanRequest> requests) {
        List<PhongBan> phongBanList = phongBanRepository.findAll();
        return phongBanMapper.toEntityDtoList(phongBanList);
    }
}

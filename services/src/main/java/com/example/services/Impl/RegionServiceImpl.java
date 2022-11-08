package com.example.services.Impl;

import com.example.entiry.Regions;
import com.example.repository.regionRepository.RegionRepository;
import com.example.services.regionService.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {
    @Autowired
    RegionRepository regionRepository;
    @Override
    public Regions getRegionsById(Long regionId) {
        if (regionRepository.findById(regionId).isPresent())
            return regionRepository.findById(regionId).get();
        else
            throw new NullPointerException();
    }

    @Override
    public List<Regions> getAllRegions() {
        return regionRepository.findAll();
    }
}

package com.example.services.regionService;

import com.example.entiry.Regions;

import java.math.BigDecimal;
import java.util.List;

public interface RegionService {
    public Regions getRegionsById(Long regionId);
    public List<Regions> getAllRegions();
}

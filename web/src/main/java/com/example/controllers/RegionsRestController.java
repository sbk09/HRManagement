package com.example.controllers;

import com.example.entiry.Regions;
import com.example.services.regionService.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/regions")
public class RegionsRestController {
    @Autowired
    private RegionService regionService;

    @GetMapping("")
    public Regions getRegion(@RequestParam Long regionId){
        return regionService.getRegionsById(regionId);
    }

    @GetMapping("/all")
    public List<Regions> getAllRegions(){
        return regionService.getAllRegions();
    }
}

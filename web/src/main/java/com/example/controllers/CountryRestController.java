package com.example.controllers;

import com.example.entiry.Country;
import com.example.services.contryService.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryRestController {

    @Autowired
    private CountryService countryService;

    @GetMapping("")
    public Country geCountry(@RequestParam String countryId){
        return countryService.getCountryById(countryId);
    }

    @GetMapping("/all")
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }

}

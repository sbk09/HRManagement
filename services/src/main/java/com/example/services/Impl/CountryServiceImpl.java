package com.example.services.Impl;

import com.example.entiry.Country;
import com.example.repository.countryRepository.CountryRepository;
import com.example.services.contryService.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Country getCountryById(String countryId) {
        if (countryRepository.findById(countryId).isPresent())
            return countryRepository.findById(countryId).get();
        else
            throw new NullPointerException();
    }

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}

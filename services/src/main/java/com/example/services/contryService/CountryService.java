package com.example.services.contryService;

import com.example.entiry.Country;

import java.util.List;

public interface CountryService {
    public Country getCountryById(String countryId);
    public List<Country> getAllCountries();
}

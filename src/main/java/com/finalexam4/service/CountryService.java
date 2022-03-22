package com.finalexam4.service;

import com.finalexam4.entity.Country;

import java.util.Optional;

public interface CountryService {
    Iterable<Country> findAllCountries();

    Optional<Country> findById(Long id);
}

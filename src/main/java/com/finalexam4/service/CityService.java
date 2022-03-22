package com.finalexam4.service;

import com.finalexam4.entity.City;

import java.util.Optional;

public interface CityService {
    Iterable<City> findAllCities();

    Optional<City> findById(Long id);

    City save(City city);

    void remove(Long id);
}

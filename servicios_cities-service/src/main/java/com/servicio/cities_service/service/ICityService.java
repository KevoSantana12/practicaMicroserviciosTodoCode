package com.servicio.cities_service.service;

import com.servicio.cities_service.dto.CityDTO;

import java.util.List;

public interface ICityService {

    public CityDTO getCitiesHotels(String name, String country);
}

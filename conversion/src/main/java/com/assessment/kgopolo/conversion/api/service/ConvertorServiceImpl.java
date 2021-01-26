package com.assessment.kgopolo.conversion.api.service;

import org.springframework.stereotype.Service;

@Service
public class ConvertorServiceImpl implements ConvertorService{


    @Override
    public Double kelvinToCelsius(double kelvin) {
        double celsius = kelvin - 273.15;
        return celsius;
    }

    @Override
    public Double poundsToKilograms(double pounds) {

        double kilograms = pounds*0.4536;
        return kilograms;
    }

    @Override
    public Float milesToKilometers(float miles) {
        float kilometers = miles * 1.609344f;
        return kilometers;
    }
}

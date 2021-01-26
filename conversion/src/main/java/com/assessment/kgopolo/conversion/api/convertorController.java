package com.assessment.kgopolo.conversion.api;


import com.assessment.kgopolo.conversion.api.service.ConvertorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class convertorController {


    @Autowired
    ConvertorService convertorService;

    @RequestMapping("/")
    public String index() {
        return "Kgopolo Assessment";
    }


    @RequestMapping(value = "/celsius/{kelvin}", method = RequestMethod.GET)
    public ResponseEntity <Object> kelvinToCelsius(@PathVariable("kelvin") Double kelvin) {
        return new ResponseEntity<>(convertorService.kelvinToCelsius(kelvin), HttpStatus.OK);
    }

    @RequestMapping(value = "/kilograms/{pounds}", method = RequestMethod.GET)
    public ResponseEntity <Object> poundsToKilograms(@PathVariable("pounds") Double pounds) {
        return new ResponseEntity<>(convertorService.poundsToKilograms(pounds), HttpStatus.OK);
    }

    @RequestMapping(value = "/kilometers/{miles}", method = RequestMethod.GET)
    public ResponseEntity <Object> milesToKilometers(@PathVariable("miles") Float miles) {
        return new ResponseEntity<>(convertorService.kelvinToCelsius(miles), HttpStatus.OK);
    }
}

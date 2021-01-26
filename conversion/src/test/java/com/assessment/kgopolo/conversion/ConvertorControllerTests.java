package com.assessment.kgopolo.conversion;


import com.assessment.kgopolo.conversion.api.service.ConvertorServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ConvertorControllerTests {
    @Autowired
    ConvertorServiceImpl convertorService;

    @Test
    public void testConversationToCelsius(){
    double celsius = 50 - 273.15;
        assertEquals(celsius, convertorService.kelvinToCelsius(50));
    }
    @Test
    public void testConversationToKilograms(){
        double pounds = 50 *0.4536;
        assertEquals(pounds, convertorService.poundsToKilograms(50));
    }
    @Test
    public void testConversationToKilometers(){
        float miles = 50 * 1.609344f;
        assertEquals(miles, convertorService.milesToKilometers(50));
    }

}

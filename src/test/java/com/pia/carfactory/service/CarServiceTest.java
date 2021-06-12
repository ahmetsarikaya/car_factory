package com.pia.carfactory.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarServiceTest {
    @Autowired
    private CarService carService;

    @Test
    public void shouldBeProducedCabrio(){
        String message = carService.produceCar("cabrio");
        Assertions.assertEquals("Cabrio Car has produced.",message);
    }
    @Test
    public void shouldBeProducedSedan(){
        String message = carService.produceCar("sedan");
        Assertions.assertEquals("Sedan Car has produced.",message);
    }
    @Test
    public void shouldBeProducedHatchback(){
        String message = carService.produceCar("hatchback");
        Assertions.assertEquals("Hatchback Car has produced.",message);
    }
    @Test
    public void shouldBeProducedNoCar(){
        String message = carService.produceCar("null");
        Assertions.assertEquals("No Car has produced.",message);
    }
}

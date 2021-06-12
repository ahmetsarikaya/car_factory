package com.pia.carfactory.factory;

import com.pia.carfactory.factory.model.Cabrio;
import com.pia.carfactory.factory.model.Car;
import com.pia.carfactory.factory.model.Hatchback;
import com.pia.carfactory.factory.model.Sedan;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarFactoryTest {
    @Test
    public void shouldBeReturnedCabrioObject(){
        Car producedCar = CarFactory.getCar("cabrio");
        Assertions.assertEquals(producedCar instanceof Cabrio, Boolean.TRUE);
    }
    @Test
    public void shouldBeReturnedSedanObject(){
        Car producedCar = CarFactory.getCar("sedan");
        Assertions.assertEquals(producedCar instanceof Sedan, Boolean.TRUE);
    }
    @Test
    public void shouldBeReturnedHatchbackObject(){
        Car producedCar = CarFactory.getCar("Hatchback");
        Assertions.assertEquals(producedCar instanceof Hatchback, Boolean.TRUE);
    }
}

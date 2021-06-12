package com.pia.carfactory.service;

import com.pia.carfactory.factory.CarFactory;
import com.pia.carfactory.factory.model.Car;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService{
    @Override
    public String produceCar(String type) {
        Car producedCar = CarFactory.getCar(type);
        if(producedCar != null){
            return producedCar.getType()+" Car has produced.";
        }
        return "No Car has produced.";
    }
}

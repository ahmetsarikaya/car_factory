package com.pia.carfactory.factory;

import com.pia.carfactory.enums.CarType;
import com.pia.carfactory.factory.model.Cabrio;
import com.pia.carfactory.factory.model.Car;
import com.pia.carfactory.factory.model.Hatchback;
import com.pia.carfactory.factory.model.Sedan;

public class CarFactory {
    public static Car getCar(String type){
        if(CarType.SEDAN.getType().equalsIgnoreCase(type)){
            return new Sedan();
        }else if(CarType.HATCHBACK.getType().equalsIgnoreCase(type)) {
            return new Hatchback();
        }else if(CarType.CABRIO.getType().equalsIgnoreCase(type)) {
            return new Cabrio();
        }else{
            return null;
        }
    }
}

package com.pia.carfactory.factory.model;

import com.pia.carfactory.enums.CarType;
import com.pia.carfactory.factory.model.Car;

public class Cabrio implements Car {
    @Override
    public String getType() {
        return CarType.CABRIO.getType();
    }
}

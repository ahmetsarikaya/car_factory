package com.pia.carfactory.enums;

public enum CarType {
    CABRIO("Cabrio"),SEDAN("Sedan"),HATCHBACK("Hatchback");

    private String type;

    CarType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

}

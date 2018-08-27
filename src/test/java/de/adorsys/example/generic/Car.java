package de.adorsys.example.generic;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Car {
    private final String identifier;
    private final String driver;
    private final String model;

    public Car(String identifier, String driver, String model) {
        this.identifier = identifier;
        this.driver = driver;
        this.model = model;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getDriver() {
        return driver;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }

        if(o instanceof Car) {
            Car otherCar = (Car) o;
            return this.identifier.equals(otherCar.identifier) && this.driver.equals(otherCar.driver) && this.model.equals(otherCar.model);
        }

        return false;
    }

    @Override
    public int hashCode() {
        throw new NotImplementedException();
    }
}

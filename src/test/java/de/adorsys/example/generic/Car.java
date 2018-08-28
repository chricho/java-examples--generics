package de.adorsys.example.generic;

public class Car {

    private static final int HASHCODE_OFFSET = -639365053;
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
        int result = HASHCODE_OFFSET + identifier.hashCode();
        result = 31 * result + driver.hashCode();
        result = 31 * result + model.hashCode();
        return result;
    }
}

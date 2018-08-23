package de.adorsys.example.generic;

import org.junit.Before;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class Test {

    private Dictionary<String, Car> carDictionary;


    @Before
    public void setup() {
        carDictionary = new Dictionary<>();

        carDictionary.add("N-AD-123", new Car("N-AD-123", "fst", "BMW 3er"));
        carDictionary.add("N-AD-1", new Car("N-AD-1", "fpo", "Porsche Cayenne"));
        carDictionary.add("N-AD-5", new Car("N-AD-5", "kts", "Mercedes E-Klasse"));
        carDictionary.add("N-AD-666", new Car("N-AD-666", "cch", "VW Golf 7"));
    }


    @org.junit.Test
    public void shouldFindCarByIdentifier() {
        Car foundCar = carDictionary.search("N-AD-123");

        assertThat(foundCar.getDriver(), is(equalTo("fst")));
    }

    @org.junit.Test
    public void shouldRemoveCarByIdentifier() {
        carDictionary.remove("N-AD-123");

        assertThat(carDictionary.size(), is(equalTo(3)));
        assertThat(carDictionary.get(0).getIdentifier(), is(equalTo("N-AD-1")));
        assertThat(carDictionary.get(1).getIdentifier(), is(equalTo("N-AD-5")));
        assertThat(carDictionary.get(2).getIdentifier(), is(equalTo("N-AD-666")));
    }

}

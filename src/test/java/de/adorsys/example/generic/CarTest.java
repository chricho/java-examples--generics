package de.adorsys.example.generic;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class CarTest {

    @Test
    public void shouldBeEqualIfSame() {
        Car car = new Car("N-AD-12", "fst", "BWM 3er");
        Car other = car;

        assertThat(car.equals(other), is(equalTo(true)));
        assertThat(car.hashCode() == other.hashCode(), is(equalTo(true)));
    }

    @Test
    public void shouldBeEqualIfEqualButNotSame() {
        Car car = new Car("N-AD-12", "fst", "BWM 3er");
        Car other = new Car("N-AD-12", "fst", "BWM 3er");

        assertThat(car.equals(other), is(equalTo(true)));
        assertThat(car.hashCode() == other.hashCode(), is(equalTo(true)));
    }

    @Test
    public void shouldBeEqualIfEqualButReallyNotSame() {
        Car car = new Car("N-AD-12", "fst", "BWM 3er");
        Car other = new Car(new String("N-AD-12"), new String("fst"), new String("BWM 3er"));

        assertThat(car.equals(other), is(equalTo(true)));
        assertThat(car.hashCode() == other.hashCode(), is(equalTo(true)));
    }

    @Test
    public void shouldNotBeEqual() {
        Car car = new Car("N-AD-12", "fst", "BMW 3er");
        Car other = new Car("N-AD-1", "fst", "BMW 3er");

        assertThat(car.equals(other), is(equalTo(false)));
        assertThat(car.hashCode() == other.hashCode(), is(equalTo(false)));
    }

    @Test
    public void shouldNotBeEqualToString() {
        Car car = new Car("N-AD-12", "fst", "BMW 3er");

        assertThat(car.equals("N-AD-12"), is(equalTo(false)));
        assertThat(car.hashCode() == "N-AD-12".hashCode(), is(equalTo(false)));
    }

    @Test
    public void shouldNotBeEqualToObject() {
        Car car = new Car("N-AD-12", "fst", "BMW 3er");

        assertThat(car.equals(new Object()), is(equalTo(false)));
        assertThat(car.hashCode() == new Object().hashCode(), is(equalTo(false)));
    }

    @Test
    public void shouldNotBeEqualToNull() {
        Car car = new Car("N-AD-12", "fst", "BMW 3er");

        assertThat(car.equals(null), is(equalTo(false)));
    }

    @Test
    public void shouldNotBeEqualToNullCar() {
        Car nullCar = null;
        Car car = new Car("N-AD-12", "fst", "BMW 3er");

        assertThat(car.equals(nullCar), is(equalTo(false)));
    }


}

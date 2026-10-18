package lab2.Activities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActivitiesTest {

    @Test
    void runCalculatesCalories() {
        Run run = new Run(5);
        assertEquals(500, run.calculateCalories());
    }

    @Test
    void runWithZeroKmThrowsException() {
        assertThrows(IncorrectValueException.class, () -> new Run(0));
    }

    @Test
    void bikeCalculatesCalories() {
        Bike bike = new Bike(10, 3);
        assertEquals(300, bike.calculateCalories());
    }

    @Test
    void bikeWithZeroGearsThrowsException() {
        assertThrows(IncorrectValueException.class, () -> new Bike(10, 0));
    }

    @Test
    void swimCalculatesCalories() {
        Swim swim = new Swim(2, 20);
        assertEquals(80, swim.calculateCalories());
    }

    @Test
    void swimWithNegativeKmThrowsException() {
        assertThrows(IncorrectValueException.class, () -> new Swim(-1, 20));
    }

    @Test
    void swimWithWaterTooHotThrowsException() {
        assertThrows(IncorrectValueException.class, () -> new Swim(2, 31));
    }
}

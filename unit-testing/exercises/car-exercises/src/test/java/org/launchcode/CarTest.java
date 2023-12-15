package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car test_car;

    @BeforeEach
    public void initCar() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }


    //constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        assertEquals( 10, test_car.getGasTankLevel(),.001);
    }

    //gasTankLevel is accurate after driving within tank range
    @Test
    public void testTankLevelAfterDrive() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }
    //gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testTankLevelOverDriveRange() {
        test_car.drive(550);
        assertEquals(0, test_car.getGasTankLevel(), .001);
    }
    //can't have more gas than tank size, expect an exception
    @Test
    public void testGasOverfillException() {
        assertThrows(IllegalArgumentException.class, () -> test_car.addGas(5), "Car cannot have more gas in tank than the size of the tank");
    }
}
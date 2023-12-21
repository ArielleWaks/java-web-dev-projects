package technology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {



    @Test
    public void plugIn_method_given_battery_25_should_increases_battery_by_50() {
        Computer computer = new Computer(2024, "OS", 25);
        computer.plugIn();
        assertEquals(25+50, computer.getBattery(), 0.001);
    }

    @Test
    public void given_computer_with_negative_battery_sets_battery_to_0 () {
        Computer computer = new Computer(2024, "OS", -25);
        assertEquals(0, computer.getBattery());
    }

    @Test
    public void given_computer_over_100_batter_sets_battery_to_100() {
        Computer computer = new Computer(2024, "OS", 500);
        assertEquals(100, computer.getBattery());
    }

    @Test
    public void given_battery_under_50_isCharged_returns_false() {
        Computer computer = new Computer(2024, "OS", 25);
        assertFalse(computer.isCharged());
    }

    @Test
    public void given_battery_over_50_isCharged_returns_true() {
        Computer computer = new Computer(2024, "OS", 75);
        assertTrue(computer.isCharged());
    }




}

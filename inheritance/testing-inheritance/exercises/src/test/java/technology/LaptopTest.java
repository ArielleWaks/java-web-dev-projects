package technology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LaptopTest {

    Laptop laptop_test;

    @BeforeEach
    public void create_laptop_object() {
        laptop_test = new Laptop(2020,"macOS", 100, "MacBook");
    }

    @Test
    public void first_constructor_inherits_super_fields() {
        assertEquals(2020, laptop_test.getYear());
        assertEquals("macOS", laptop_test.getOperatingSystem());
        assertEquals(100, laptop_test.getBattery());
    }

    @Test
    public void first_constructor_sets_model() {
        assertEquals("MacBook", laptop_test.getModel());
    }

    @Test
    public void softwareUpdate_method_returns_message() {
        assertEquals("Software up to date", laptop_test.updateSoftware());
    }


}

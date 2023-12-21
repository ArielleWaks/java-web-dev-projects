package technology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartPhoneTest {

    SmartPhone smartPhone_test;

    @BeforeEach
    public void create_smartphone_object() {
        smartPhone_test = new SmartPhone(2023, "iOS", 25, "My Phone");
    }

    @Test
    public void first_constructor_inherits_super_fields() {
        assertEquals(2023, smartPhone_test.getYear());
        assertEquals("iOS", smartPhone_test.getOperatingSystem());
        assertEquals(25, smartPhone_test.getBattery());
    }

    @Test
    public void first_constructor_sets_deviceName() {
        assertEquals("My Phone", smartPhone_test.getDeviceName());
    }

    @Test
    public void syncToCloud_method_returns_message_with_deviceName() {
        assertEquals("Your device My Phone has successfully synced to the cloud", smartPhone_test.syncToCloud());
    }
}

package Part8.StorageFacilityExercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StorageFacilityTest {

    private StorageFacility facility;

    @BeforeEach
    void setup() {
        facility = new StorageFacility();
    }

    @Test
        // naming convention:
        // method_ShouldDoThis_WhenDoingThisOrWhenStateIsAsSuch
    void add_ShouldStoreOneItem_WhenAddingOneItem() {
        String unit = "a14";

        facility.add(unit, "skates");

        ArrayList<String> contents = facility.contents(unit);

        assertEquals(1, contents.size());
    }

    @Test
    void add_ShouldStoreMultipleItems_WhenAddingMultipleItems() {
        String unit = "a14";

        facility.add(unit, "skates");
        facility.add(unit, "shoes");
        facility.add(unit, "car");

        ArrayList<String> contents = facility.contents(unit);

        assertEquals(3, contents.size());
    }

    @Test
    void add_ShouldThrowException_WhenUnitOrItemIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> {
            facility.add("", "socks");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            facility.add("", "socks");
        });
    }

    @Test
    void contents_ShouldThrowException_WhenUnitIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> {
            facility.contents("");
        });
    }

    @Test
    void contents_ShouldReturnNull_IfUnitDoesNotExist() {
        assertNull(facility.contents("fakeUnit"));
    }

    @Test
    void contents_ShouldReturnItems_IfUnitExists() {
        String unit = "a14";
        String[] items = {"socks", "spoons"};

        for (String item : items) {
            facility.add(unit, item);
        }

        ArrayList<String> contents = facility.contents(unit);

        for (int i = 0; i < items.length; i++) {
            assertEquals(items[i], contents.get(i));
        }

    }

}
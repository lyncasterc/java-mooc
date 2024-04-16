package Part8.StorageFacilityExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> unitsContentsMap;

    public StorageFacility() {
        this.unitsContentsMap = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (unit.isEmpty() || item.isEmpty()) {
            throw new IllegalArgumentException("unit and item cannot be empty");
        }

        if (unitsContentsMap.containsKey(unit)) {
            unitsContentsMap.get(unit).add(item);
        } else {
            unitsContentsMap.put(unit, new ArrayList<>(Arrays.asList(item)));
        }
    }

    public ArrayList<String> contents(String unit) {
        if (unit.isEmpty()) {
            throw new IllegalArgumentException("unit cannot  be empty");
        }

        return unitsContentsMap.containsKey(unit) ? unitsContentsMap.get(unit) : null;
    }
}

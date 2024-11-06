package Classes;

import java.util.HashMap;
import java.util.Map;

public class PolySum {
    public static HashMap<Integer, Double> addPoly(HashMap<Integer, Double> poly1, HashMap<Integer, Double> poly2) {
        HashMap<Integer, Double> result = new HashMap<>(poly1);

        for (Map.Entry<Integer, Double> entry : poly2.entrySet()) {
            result.put(entry.getKey(), result.getOrDefault(entry.getKey(), 0.0) + entry.getValue());
        }

        return result;
    }
}



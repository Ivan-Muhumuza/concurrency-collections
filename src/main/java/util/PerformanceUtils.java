package util;

import java.util.List;
import java.util.Map;

public class PerformanceUtils {

    // Measure the time taken to perform a task with a Map
    public static long measureMapPerformance(Map<String, Integer> map) {
        long startTime = System.currentTimeMillis();

        // Populate the map with a large number of entries
        for (int i = 0; i < 1000000; i++) {
            map.put("key" + i, i);
        }

        // Access each entry in the map
        for (int i = 0; i < 1000000; i++) {
            map.get("key" + i);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    // Measure the time taken to perform a task with a List
    public static long measureListPerformance(List<String> list) {
        long startTime = System.currentTimeMillis();

        // Add elements to the list
        for (int i = 0; i < 100000; i++) {
            list.add("Element " + i);
        }

        // Access each element in the list
        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    // Helper method to format and print performance results
    public static void printPerformanceResult(String collectionType, long timeTaken) {
        System.out.println(collectionType + " Time: " + timeTaken + "ms");
    }
}


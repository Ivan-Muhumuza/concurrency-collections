package concurrency;

import util.PerformanceUtils;

import java.util.*;
import java.util.concurrent.*;

public class PerformanceComparison {
    public static void runComparison() {
        // HashMap vs ConcurrentHashMap
        System.out.println();
        System.out.println("Comparing HashMap and ConcurrentHashMap:");
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        long hashMapTime = PerformanceUtils.measureMapPerformance(hashMap);
        long concurrentMapTime = PerformanceUtils.measureMapPerformance(concurrentMap);

        PerformanceUtils.printPerformanceResult("HashMap", hashMapTime);
        PerformanceUtils.printPerformanceResult("ConcurrentHashMap", concurrentMapTime);

        // ArrayList vs CopyOnWriteArrayList
        System.out.println();
        System.out.println("\nComparing ArrayList and CopyOnWriteArrayList:");
        List<String> arrayList = new ArrayList<>();
        List<String> copyOnWriteList = new CopyOnWriteArrayList<>();

        long arrayListTime = PerformanceUtils.measureListPerformance(arrayList);
        long copyOnWriteListTime = PerformanceUtils.measureListPerformance(copyOnWriteList);

        PerformanceUtils.printPerformanceResult("ArrayList", arrayListTime);
        PerformanceUtils.printPerformanceResult("CopyOnWriteArrayList", copyOnWriteListTime);
    }
}

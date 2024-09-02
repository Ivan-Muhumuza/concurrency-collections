package concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollectionsDemo {
    public static void runDemo() {
        demoConcurrentHashMap();
        demoCopyOnWriteArrayList();
    }

    private static void demoConcurrentHashMap() {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        Runnable task1 = () -> {
            for (int i = 0; i < 5; i++) {
                map.put("key" + i, i);
                System.out.println("Task 1 added key" + i);
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Task 2 read key" + i + ": " + map.get("key" + i));
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }

    private static void demoCopyOnWriteArrayList() {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        Runnable task1 = () -> {
            for (int i = 0; i < 5; i++) {
                list.add("Element " + i);
                System.out.println("Task 1 added Element " + i);
            }
        };

        Runnable task2 = () -> {
            for (String element : list) {
                System.out.println("Task 2 read: " + element);
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}


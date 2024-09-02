public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Concurrency vs. Multithreading Demo...");
        concurrency.ConcurrencyDemo.runDemo();

        System.out.println("\nStarting Concurrent Collections Demo...");
        concurrency.ConcurrentCollectionsDemo.runDemo();

        System.out.println("\nStarting Performance Comparison...");
        concurrency.PerformanceComparison.runComparison();
    }
}


# Concurrency Lab Project

[loom-video-link](https://www.loom.com/share/c016093c7fb04510949390c1f5b5d7e7)
# ConcurrencyLab

## Overview

The `ConcurrencyLab` project is designed to demonstrate key concepts in Java concurrency, including multithreading, the use of concurrent collections, and performance comparison between concurrent and non-concurrent collections. The project includes examples and performance benchmarks to illustrate these concepts effectively.

## Project Structure

The project is organized into the following structure:

```plaintext
ConcurrencyLab
│
├── src
│   ├── Main.java                   // Entry point to run all demonstrations
│   ├── concurrency
│   │   ├── ConcurrencyDemo.java    // Demonstrates concurrency vs. multithreading
│   │   ├── ConcurrentCollectionsDemo.java  // Demonstrates use of concurrent collections
│   │   └── PerformanceComparison.java      // Compares performance of collections
│   └── util
│       └── PerformanceUtils.java   // Utility methods for measuring performance
│
└── README.md                       // Documentation and instructions
```


## Description of Classes

- **`Main.java`**:
    - The entry point of the project. It runs all demonstrations, including concurrency vs. multithreading, the use of concurrent collections, and performance comparisons.

- **`ConcurrencyDemo.java`**:
    - Demonstrates the difference between concurrency and multithreading using basic examples of tasks running in parallel.

- **`ConcurrentCollectionsDemo.java`**:
    - Shows practical usage of concurrent collections like `ConcurrentHashMap` and `CopyOnWriteArrayList` in multi-threaded environments.

- **`PerformanceComparison.java`**:
    - Compares the performance of concurrent and non-concurrent collections, including `HashMap` vs. `ConcurrentHashMap` and `ArrayList` vs. `CopyOnWriteArrayList`.

- **`PerformanceUtils.java`**:
    - Contains utility methods for measuring the performance of various collections, including methods for timing operations and printing results.

## How to Run

### Using an IDE

1. Import the project into your IDE (e.g., IntelliJ IDEA, Eclipse).
2. Run the `Main` class to execute all demonstrations.

### Using Command Line

1. **Compile the project**:
   ```bash
   javac Main.java
   ```


## How to Run

```bash
  java Main
```



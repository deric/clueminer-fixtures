package org.clueminer.report;

/**
 * Class for measuring memory usage, it should be used only as a rough estimate
 * of resources that is JVM allocating.
 *
 * @author Tomas Barton
 */
public class MemInfo {

    private static final long MEGABYTE = 1024L * 1024L;
    protected long startTime;
    protected long startMemory;
    protected long stopTime;
    private boolean isRunning = false;

    public MemInfo() {
        startClock();
    }

    public MemInfo(boolean start) {
        if (start) {
            startClock();
        }
    }

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }

    public final void startClock() {
        // Get the Java runtime
        Runtime runtime = Runtime.getRuntime();
        // Run the garbage collector
        runtime.gc();
        startMemory = runtime.totalMemory() - runtime.freeMemory();
        startTime = System.currentTimeMillis();
        isRunning = true;
    }

    public void stopClock() {
        if (isRunning) {
            stopTime = System.currentTimeMillis();
            isRunning = false;
        }
    }

    public void report() {
        stopClock();
        long elapsedTime = stopTime - startTime;
        System.out.println("time: " + elapsedTime / 1000 + "s, " + elapsedTime + "ms");
        // Get the Java runtime
        Runtime runtime = Runtime.getRuntime();
        // Run the garbage collector
        runtime.gc();
        // Calculate the used memory
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory: " + memory + " bytes");
        System.out.println("Used memory: " + bytesToMegabytes(memory) + " MB");
        System.out.println("Inc memory: " + bytesToMegabytes(memory - startMemory) + " MB");
    }

}

/*
 * Copyright (C) 2011-2016 clueminer.org
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.clueminer.report;

import java.text.DecimalFormat;

/**
 *
 * @author Tomas Barton
 */
public class BigORes {

    private static final DecimalFormat decimalFormat = new DecimalFormat("###0.0000");
    private static final DecimalFormat integerFormat = new DecimalFormat("###0.0");
    private static final double BY_SECONDS = 1000000000.0;
    private static final long MEGABYTE = 1024L * 1024L;
    private static final long KBYTE = 1024L;
    private long totalTime;
    private long memory;
    private String[] opts;
    private long measurements;
    private String label;

    public BigORes(long time, long memoryUsed, long measurements, String[] opts, String label) {
        this.totalTime = time;
        this.memory = memoryUsed;
        this.opts = opts;
        this.measurements = measurements;
        this.label = label;
    }

    public String avgTimeMs() {
        return decimalFormat.format(totalTime / measurements / 1000000.0);
    }

    /**
     *
     * @return average run in seconds
     */
    public String avgTimeS() {
        return decimalFormat.format(totalTime / measurements / BY_SECONDS);
    }

    /**
     *
     * @return transaction per second
     */
    public String tps() {
        return formatInt(measurements / (totalTime / BY_SECONDS));
    }

    public String measurements() {
        return formatInt(measurements);
    }

    public String totalTimeInS() {
        return decimalFormat.format(totalTime / BY_SECONDS);
    }

    public long getTotalTime() {
        return totalTime;
    }

    public String totalMemoryInMb() {
        return formatDouble(bytesToMegabytes(memory));
    }

    public String totalMemoryInKb() {
        return formatDouble(bytesToKiloBytes(memory));
    }

    public long getMemory() {
        return memory;
    }

    public String[] getOpts() {
        return opts;
    }

    public long getMeasurements() {
        return measurements;
    }

    public String getLabel() {
        return label;
    }

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }

    public static long bytesToKiloBytes(long bytes) {
        return bytes / KBYTE;
    }

    private String formatInt(double value) {
        return integerFormat.format(value);
    }

    private String formatDouble(double value) {
        return decimalFormat.format(value);
    }

}

/*
 * Copyright (C) 2011-2017 clueminer.org
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

/**
 *
 * @author Tomas Barton
 */
public class Collector implements NanoBench.MeasureListener {

    private int count = 0;
    private long timeUsed = 0;
    private long memoryUsed = 0;
    private final Reporter reporter;
    private final String[] opts;

    public Collector(Reporter reporter, String[] opts) {
        this.reporter = reporter;
        this.opts = opts;
    }

    @Override
    public void onMeasure(NanoBench.MeasureState state) {
        count++;
        outputMeasureInfo(state);
    }

    private void outputMeasureInfo(NanoBench.MeasureState state) {
        timeUsed += state.getMeasureTime();

        NanoBench.MemoryUtil.restoreJvm();
        memoryUsed += NanoBench.MemoryUtil.memoryUsed();

        if (isEnd(state)) {
            if (!state.getLabel().equals("_warmup_")) {
                BigORes res = new BigORes(timeUsed, memoryUsed, state.getMeasurements(), opts, state.getLabel());
                reporter.finalResult(res);
            }
            count = 0;
            timeUsed = 0;
        }
    }

    private boolean isEnd(NanoBench.MeasureState state) {
        return count == state.getMeasurements();
    }

}

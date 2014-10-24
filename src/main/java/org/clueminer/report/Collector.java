package org.clueminer.report;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tomas Barton
 */
public class Collector implements NanoBench.MeasureListener {

    private final Logger log;
    private int count = 0;
    private long timeUsed = 0;
    private long memoryUsed = 0;
    private final Reporter reporter;
    private final String[] opts;

    public Collector(Logger log, Reporter reporter, String[] opts) {
        this.log = log;
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

                log.log(Level.INFO, "finished {0}", state.getLabel());
            }
            count = 0;
            timeUsed = 0;
        }
    }

    private boolean isEnd(NanoBench.MeasureState state) {
        return count == state.getMeasurements();
    }

}

package org.clueminer.report;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import org.testng.Reporter;

/**
 * Bridge between Java Logging API and TestNG's Reporter
 *
 * @author mbastian
 */
public class ReporterHandler extends Handler {

    @Override
    public void publish(LogRecord record) {
        String prefix = "";
        if (record.getLevel().equals(Level.INFO)) {
            prefix = "[INFO] ";
        } else if (record.getLevel().equals(Level.WARNING)) {
            prefix = "[WARN] ";
        } else if (record.getLevel().equals(Level.SEVERE)) {
            prefix = "[SEVERE] ";
        }
        Reporter.log(prefix + record.getMessage() + "<br>", true);
    }

    @Override
    public void flush() {
    }

    @Override
    public void close() throws SecurityException {
    }
}

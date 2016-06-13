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

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/**
 * Dummy console reporter
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
        System.out.println(prefix + record.getMessage());
    }

    @Override
    public void flush() {
    }

    @Override
    public void close() throws SecurityException {
    }
}

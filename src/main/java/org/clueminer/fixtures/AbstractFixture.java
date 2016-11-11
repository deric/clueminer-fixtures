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
package org.clueminer.fixtures;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Tomas Barton
 */
public class AbstractFixture {

    protected String localPath;

    public AbstractFixture() {
        try {
            localPath = getPath();
        } catch (IOException ex) {
            LoggerFactory.getLogger(AbstractFixture.class).warn("couldn't get local path", ex);
        }
    }

    @Deprecated
    protected final String getPath() throws IOException {
        File dir = new File(getClass().getProtectionDomain().getCodeSource().
                getLocation().getFile() + "/../../src/main/resources/data");
        return dir.getCanonicalPath();
    }

    /**
     * Existence should be checked in tests
     *
     * @param f
     * @deprecated
     */
    @Deprecated
    protected void checkExistence(File f) {
        if (!f.exists()) {
            throw new RuntimeException("file " + f.getPath() + " not found");
        }
    }

    public String makePath(String name, String ext) throws IOException {
        String path = "/data/" + name + "." + ext;
        URL url = AbstractFixture.class.getResource(path);
        if (url == null) {
            throw new RuntimeException("resource not found: " + path);
        }
        return url.getFile();
    }

    /**
     * Resource packed in jar is not possible to open directly, this method uses
     * a .tmp file which should be on exit deleted
     *
     * @param path
     * @return
     */
    public File resource(String path) {
        String resource = "/data/" + path;
        File file = null;
        URL url = AbstractFixture.class.getResource(resource);
        if (url == null) {
            throw new RuntimeException("resource not found: " + path);
        }

        if (url.toString().startsWith("jar:")) {
            try {
                InputStream input = getClass().getResourceAsStream(resource);
                file = File.createTempFile("nodesfile", ".tmp");
                OutputStream out = new FileOutputStream(file);
                int read;
                byte[] bytes = new byte[1024];

                while ((read = input.read(bytes)) != -1) {
                    out.write(bytes, 0, read);
                }
                file.deleteOnExit();
            } catch (IOException ex) {
                System.err.println(ex.toString());
            }
        } else {
            file = new File(url.getFile());
        }
        return file;
    }
}

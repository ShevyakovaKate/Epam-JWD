package dao;

import java.io.Closeable;
import java.io.IOException;

public interface XMLFileReader extends Closeable {
    String read();
    void close() throws IOException;
    boolean isXMLFileEmpty() throws IOException;
}

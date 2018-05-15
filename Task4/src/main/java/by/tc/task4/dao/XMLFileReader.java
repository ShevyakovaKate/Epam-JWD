package by.tc.task4.dao;

import java.io.IOException;

public interface XMLFileReader extends AutoCloseable {
    String read();
    boolean isXMLFileEmpty() throws IOException;
}

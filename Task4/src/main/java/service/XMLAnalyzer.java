package service;

import entity.Node;

import java.io.Closeable;
import java.io.IOException;

public interface XMLAnalyzer extends Closeable {
    Node nextNode() throws IOException;
}

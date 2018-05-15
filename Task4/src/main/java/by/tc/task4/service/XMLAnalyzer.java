package by.tc.task4.service;

import by.tc.task4.entity.Node;

import java.io.IOException;

public interface XMLAnalyzer extends AutoCloseable {
    Node nextNode() throws IOException;
}

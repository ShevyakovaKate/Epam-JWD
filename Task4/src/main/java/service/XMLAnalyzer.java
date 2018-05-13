package service;

import entity.Node;

import java.io.IOException;

public interface XMLAnalyzer {
    Node nextNode() throws IOException;
}

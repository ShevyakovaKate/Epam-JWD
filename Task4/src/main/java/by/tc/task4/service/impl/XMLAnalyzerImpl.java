package by.tc.task4.service.impl;

import by.tc.task4.dao.DAOFactory;
import by.tc.task4.dao.XMLFileReader;
import by.tc.task4.entity.Node;
import by.tc.task4.entity.NodeType;
import by.tc.task4.service.XMLAnalyzer;

import static by.tc.task4.service.constant.TagConstants.*;

import java.io.IOException;

public class XMLAnalyzerImpl implements XMLAnalyzer {
    DAOFactory daoFactory = DAOFactory.getInstance();
    XMLFileReader xmlFileReader = daoFactory.getXmlFileReader();

    public Node nextNode() throws IOException {
        if (xmlFileReader.isXMLFileEmpty()) {
            return null;
        }
        Node node = new Node();
        String lexeme = xmlFileReader.read().trim();
        NodeType nodeType = determineType(lexeme);
        node.setContent(lexeme);
        node.setType(nodeType);
        return node;
    }

    @Override
    public void close() throws Exception {
        xmlFileReader.close();
    }

    private NodeType determineType(String lexeme) {
        NodeType nodeType = NodeType.TAG_CONTENT;
        if (isOpenTag(lexeme)) {
            nodeType = NodeType.OPEN_TAG;
        } else if (isCloseTag(lexeme)) {
            nodeType = NodeType.CLOSE_TAG;
        } else if (isTagWithoutBody(lexeme)) {
            nodeType = NodeType.TAG_WITHOUT_BODY;
        }
        return nodeType;
    }

    private boolean isCloseTag(String lexeme) {
        return CLOSE_TAG.matcher(lexeme).find();
    }

    private boolean isOpenTag(String lexeme) {
        return OPEN_TAG.matcher(lexeme).find();
    }

    private boolean isTagWithoutBody(String lexeme) {
        return TAG_WITHOUT_BODY.matcher(lexeme).find();
    }
}

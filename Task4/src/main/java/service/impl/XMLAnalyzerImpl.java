package service.impl;

import dao.DAOFactory;
import dao.XMLFileReader;
import dao.constants.NodeConstants;
import entity.Node;
import entity.NodeType;
import service.XMLAnalyzer;

import static service.constants.TagConstants.*;

import java.io.IOException;

public class XMLAnalyzerImpl implements XMLAnalyzer {

    public Node nextNode() throws IOException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        XMLFileReader xmlFileReader = daoFactory.getXmlFileReader();
        if (xmlFileReader.isXMLFileEmpty()) {
            return null;
        }
        Node node = new Node();
        String lexeme = xmlFileReader.read().trim();
        NodeType nodeType = determineType(lexeme);
        node.setContent(lexeme);
        node.setType(nodeType);
        xmlFileReader.close();
        return node;
    }

    private NodeType determineType(String lexeme) {
        NodeType nodeType = NodeType.TAG_CONTENT;
        if (isOpenTag(lexeme)) {
            nodeType = NodeType.OPEN_TAG;
        } else if (isCloseTag(lexeme)) {
            nodeType = NodeType.CLOSE_TAG;
        } else if (isTagWithoutBody(lexeme)) {
            nodeType = NodeType.TAG_WITHOUT_BODY;
        } else if (isTagContent(lexeme)) {
            nodeType = NodeType.TAG_CONTENT;
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

    private boolean isTagContent(String lexeme) {
        return Character.toString(lexeme.charAt(0)).equals(NodeConstants.OPEN_BRACKET);
    }
}

package by.tc.task4.entity;

import java.io.Serializable;

public class Node implements Serializable {
    private String content;
    private NodeType type;

    public Node(){}

    public void setContent(String content) {
        this.content = content;
    }

    public void setType(NodeType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        return (content != null ? content.equals(node.content) : node.content == null) && type == node.type;
    }

    @Override
    public int hashCode() {
        int result = content != null ? content.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content='" + content + '\'' +
                ", type=" + type +
                '}';
    }
}

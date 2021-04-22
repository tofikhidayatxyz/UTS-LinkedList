package uts;

import java.util.LinkedList;
import uts.modes.User;

public class NodeService {
    private LinkedList<Node> nodes = new LinkedList<Node>();

    public void addNode(Node node) {
        Boolean isCanPrevius = this.nodes.size() > 0;
        Node previousNode = isCanPrevius ? this.nodes.get(this.nodes.size() - 1) : null;
        Node firstNode = isCanPrevius ? this.nodes.getFirst() : null;
        // initialite
        this.nodes.add(node);
        // get latest | current
        Node currentNode = this.nodes.getLast();
        // action
        if(isCanPrevius) {
            // single
            previousNode.setNext(currentNode);
            // double
            currentNode.setprev(previousNode);
            // circular
            firstNode.setprev(currentNode);
            currentNode.setNext(firstNode);
        }
    }

    public LinkedList<Node> getAll() {
        return this.nodes;
    }
}

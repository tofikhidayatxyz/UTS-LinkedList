package uts;
import uts.modes.User;

public class Node {
    private User data = null;
    private Node next = null;
    private Node prev = null;

    public Node(User user) {
        this.data = user;
    }

    // attribute accessor
    public User data() {
        return this.data;
    }

    public Node next() {
        return this.next;
    }

    public Node prev() {
        return this.prev;
    }

    public Boolean hasNext() {
        return this.next != null;
    }

    public Boolean hasPrev() {
        return this.prev != null;
    }

    // method acessor
    public void setNext(Node next) {
        this.next = next;
    }

    public void setprev(Node prev) {
        this.prev = prev;
    }
}

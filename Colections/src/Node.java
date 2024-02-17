public class Node {
    //variables
    private Object Data;
    private Node next;

    //Constructor
public Node(Object Data) {
        this.Data = Data;
        this.next = null;
    }

    //Getters and Setters
public Object getData() {
        return Data;
    }

public void setData(Object Data) {
        this.Data = Data;
    }

public Node getNext() {
        return next;
    }

public void setNext(Node next) {
        this.next = next;
    }

    //Methods
public String toString() {
        return Data.toString();
    }

public boolean hasNext() {
        return next != null;
    }


}

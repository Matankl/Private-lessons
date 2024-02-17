public class LinkedList {
    //variables
    private Node head;
    private int size;
    private Node tail;

    //Constructor
    public LinkedList() {
        this.head = null;
        this.size = 0;
        this.tail = null;
    }

    public LinkedList(Node node) {
        this.head = node;
        this.size = 1;
        this.tail = node;
    }

    //Getters and Setters
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }


    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    //Methods
public void add(Object key) {
        Node node = new Node(key);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public void removeLast() {
        if (head != null) {
            Node current = head;
            Node previous = null;
            while (current.getNext() != null) {
                previous = current;
                current = current.getNext();
            }
            if (previous == null) {
                head = null;
                tail = null;
            } else {
                previous.setNext(null);
                tail = previous;
            }
            size--;
        }
    }

        private int getSizerecursive(Node node){
        if (node == null)
            return 0;
        return 1 + getSizerecursive(node.getNext());
        }
    }

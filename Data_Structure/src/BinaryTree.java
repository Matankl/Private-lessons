public class BinaryTree {
    private  Node root; // root of the BST
    private int size;   // size of the BST
    private int height; // height fo the BST

    // constructor
    public void BinaryTree() {
        this.root = null;
    }
    // new tree (the first node have random color)
//    public void BinaryTree(int data) {
//        double rool= Math.random();
//        boolean color = false;
//        if (rool < 0.5){color = true;}
//        this.root = new Node(data,color);
//        this.size ++;
//    }

    //getters
    public Node getRoot() {             //return root
        if (this.root == null) {
            throw new NullPointerException("Empty Tree!");
        }
        return this.root;
    }
    public int getSize() {
        return this.size;
    }       //return size
    public int getHeight() {
        return this.height;
    }   //return height
    public boolean isEmpty() {
        return this.root == null;
    }   //return true if empty

    //setters
    public void Add(Node n){
        // If the tree is empty, set the root to the new node
        if (this.root == null) {
            this.root = new Node(n);
            this.size++;
            return;
        }

        Node current = new Node(this.root);
        while (true) {
            // If the value is already in the tree, return
            // Otherwise, go left or right depending on the value
            if (n.get_data() < current.get_data()) {
                if (current.HasLeft()) {
                    // If there is a left node, go there
                    current = current.get_left();
                } else {
                    current.set_right(new Node(n));
                    this.size++;
                    return;
                }
            } else if (n.get_data() > current.get_data()) {
                // If there is a right node, go there
                if (current.HasRight()) {
                    current = current.get_right();
                } else {
                    current.set_right(new Node(n));
                    this.size++;
                    return;
                }
            } else { // value == current.getValue()
                return;
            }
        }
    }


//    public boolean remove(int value) {
//        if (this.root == null) {
//            return false;
//        }
//
//        if (this.remove(this.root, value)) {
//            this.size--;
//            return true;
//        }
//        return false;
//
//    }
//
//    public boolean remove(Node curr, int value) {
//        if (curr == null) {
//            return false;
//        }
//
//
//        if (value == curr.getValue()) {
//            if (curr.isLeaf()) {
//                curr = null;
//            } else if (curr.hasLeft() && !curr.hasRight()) {
//                curr = curr.getLeft();
//            } else if (!curr.hasLeft() && curr.hasRight()) {
//                curr = curr.getRight();
//            } else {
//                Node successor = curr.getRight();
//                Node successorParent = curr;
//                while (successor.hasLeft()) {
//                    successorParent = successor;
//                    successor = successor.getLeft();
//                }
//
//                if (successorParent == curr) {
//                    successor.setLeft(curr.getLeft());
//                } else {
//                    successorParent.setLeft(successor.getRight());
//                    successor.setLeft(curr.getLeft());
//                    successor.setRight(curr.getRight());
//                }
//                curr = successor;
//            }
//            return true;
//        }
//
//        if (value < curr.getValue()) {
//            return remove(curr.getLeft(), value);
//        } else {
//            return remove(curr.getRight(), value);
//        }
//    }





}

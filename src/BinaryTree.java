public class BinaryTree {

    Node root;

    /**
     * Add node to the Tree
     * @param data integers
     */
    public void addNode(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;

            Node parent;

            while (true) {
                parent = focusNode;

                if (data < focusNode.data) {
                    focusNode = focusNode.leftChild;

                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;

                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    /**
     * Find Biggest value from a Binary tree
     * @param node Node
     * @return the max number as integer
     */
    public int findMaximum(Node node) {

        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int nodeMaxValue = node.data;
        int leftMax = findMaximum(node.leftChild);
        int rightMax = findMaximum(node.rightChild);

        if (leftMax > nodeMaxValue)
            nodeMaxValue = leftMax;

        if (rightMax > nodeMaxValue)
            nodeMaxValue = rightMax;

        return nodeMaxValue;
    }
}



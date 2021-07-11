public class NodeMain {
    public static void main(String[] args) {
        BinaryTree theTree = new BinaryTree();

        theTree.addNode(50);
        theTree.addNode(25);
        theTree.addNode(15);
        theTree.addNode(30);
        theTree.addNode(75);
        theTree.addNode(5);

        int maxValue = theTree.findMaximum(theTree.root);
        System.out.println("The Biggest integer of this structure is: "+ maxValue);
    }
}

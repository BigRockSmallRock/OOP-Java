package cp213;

/**
 * Implements an AVL (Adelson-Velsky Landis) tree. Extends BST.
 *
 * @author Jamal Alizadah - 210786540 - aliz6540@mylaurier.ca
 * @version 2023-03-23
 */
public class AVL<T extends Comparable<T>> extends BST<T> {

    /**
     * Returns the balance item of node. If greater than 1, then left heavy, if less
     * than -1, then right heavy. If in the range -1 to 1 inclusive, the node is
     * balanced. Used to determine whether to rotate a node upon insertion.
     *
     * @param node The TreeNode to analyze for balance.
     * @return A balance number.
     */
    private int balance(final TreeNode<T> node) {

	// your code here

	return 0;
    }

    /**
     * Performs a left rotation around node.
     *
     * @param node The subtree to rotate.
     * @return The new root of the subtree.
     */
    private TreeNode<T> rotateLeft(final TreeNode<T> node) {

	// your code here
	TreeNode<T> root = null;

	if (node != null) {
	    root = node.getRight();

	    node.setRight(root.getLeft());
	    root.setLeft(node);

	    node.updateHeight();
	    root.updateHeight();
	}

	return root;
    }

    /**
     * Performs a right rotation around node.
     *
     * @param node The subtree to rotate.
     * @return The new root of the subtree.
     */
    private TreeNode<T> rotateRight(final TreeNode<T> node) {

	// your code here
	TreeNode<T> root = null;

	if (node != null) {
	    root = node.getLeft();

	    node.setLeft(root.getRight());
	    root.setRight(node);

	    node.updateHeight();
	    root.updateHeight();
	}

	return root;
    }

    /**
     * Auxiliary method for insert. Inserts data into this AVL.
     *
     * @param node The current node (TreeNode).
     * @param cs   Data to be inserted into the node.
     * @return The inserted node.
     */
    @Override
    protected TreeNode<T> insertAux(TreeNode<T> node, final CountedValue<T> cs) {

	// your code here

	return null;
    }

    /**
     * Auxiliary method for valid. Determines if a subtree based on node is a valid
     * subtree. An AVL must meet the BST validation conditions, and additionally be
     * balanced in all its subtrees - i.e. the difference in height between any two
     * children must be no greater than 1.
     *
     * @param node The root of the subtree to test for validity.
     * @return true if the subtree base on node is valid, false otherwise.
     */
    @Override
    protected boolean isValidAux(final TreeNode<T> node, TreeNode<T> minNode, TreeNode<T> maxNode) {

	// your code here

	return false;
    }

    /**
     * Determines whether two AVLs are identical.
     *
     * @param target The AVL to compare this AVL against.
     * @return true if this AVL and target contain nodes that match in position,
     *         item, count, and height, false otherwise.
     */
    public boolean equals(final AVL<T> target) {
	return super.equals(target);
    }

}

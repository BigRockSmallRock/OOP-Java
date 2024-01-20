package cp213;

/**
 * Implements a Popularity Tree. Extends BST.
 *
 * @author your name here
 * @author Jamal Alizadah - 210786540 - aliz6540@mylaurier.ca
 * @version 2023-03-23
 */
public class PopularityTree<T extends Comparable<T>> extends BST<T> {

    /**
     * Auxiliary method for valid. May force node rotation if the retrieval count of
     * the located node item is incremented.
     *
     * @param node The node to examine for key.
     * @param key  The item to search for. Count is updated to count in matching
     *             node item if key is found.
     * @return The updated node.
     */
    private TreeNode<T> retrieveAux(TreeNode<T> node, final CountedValue<T> key) {

	// your code here
	this.comparisons++;

	if (node.getCs().compareTo(key) > 0) {
	    return this.retrieveAux(node.getLeft(), key);
	} else if (node.getCs().compareTo(key) < 0) {
	    return this.retrieveAux(node.getRight(), key);
	} else {
	    node.getCs().incrementCount();
	}

	if (node != null) {
	    node.updateHeight();
	}

	return node;

    }

    /**
     * Performs a left rotation around node.
     *
     * @param parent The subtree to rotate.
     * @return The new root of the subtree.
     */
    private TreeNode<T> rotateLeft(final TreeNode<T> parent) {

	// your code here
	TreeNode<T> root = null;

	if (parent != null) {
	    root = parent.getRight();

	    parent.setRight(root.getLeft());
	    root.setLeft(parent);

	    parent.updateHeight();
	    root.updateHeight();
	}

	return root;

    }

    /**
     * Performs a right rotation around {@code node}.
     *
     * @param parent The subtree to rotate.
     * @return The new root of the subtree.
     */
    private TreeNode<T> rotateRight(final TreeNode<T> parent) {

	// your code here
	TreeNode<T> root = null;

	if (parent != null) {
	    root = parent.getLeft();

	    parent.setLeft(root.getRight());
	    root.setRight(parent);

	    parent.updateHeight();
	    root.updateHeight();
	}

	return root;
    }

    /**
     * Replaces BST insertAux - does not increment count on repeated insertion.
     * Counts are incremented only on retrieve.
     */
    @Override
    protected TreeNode<T> insertAux(TreeNode<T> node, final CountedValue<T> data) {

	// your code here

	return null;
    }

    /**
     * Auxiliary method for valid. Determines if a subtree based on node is a valid
     * subtree. An Popularity Tree must meet the BST validation conditions, and
     * additionally the counts of any node data must be greater than or equal to the
     * counts of its children.
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
     * Determines whether two PopularityTrees are identical.
     *
     * @param target The PopularityTree to compare this PopularityTree against.
     * @return true if this PopularityTree and target contain nodes that match in
     *         position, item, count, and height, false otherwise.
     */
    public boolean equals(final PopularityTree<T> target) {
	return super.equals(target);
    }

    /**
     * Very similar to the BST retrieve, but increments the data count here instead
     * of in the insertion.
     *
     * @param key The key to search for.
     */
    @Override
    public CountedValue<T> retrieve(CountedValue<T> key) {

	// your code here
	if (this.root != null) {
	    this.retrieveAux(this.root, key);
	}

	return null;
    }

}

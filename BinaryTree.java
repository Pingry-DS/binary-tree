import java.util.Iterator;

public interface BinaryTree<V> {

	/**
	 * Returns the left child of the current node.
	 * @return the left child, or null if it does not exist
	 */
	public BinaryTree<V> getLeftChild();

	/**
	 * Returns the right child of the current node.
	 * @return the right child, or null if it does not exist
	 */
	public BinaryTree<V> getRightChild();

	/**
	 * Returns the value of the current node.
	 * @return current value
	 */
	public V getValue();

	/**
	 * Removes the left child from the current node.
	 * @return the node which was removed, null if there is no left child
	 */
	public BinaryTree<V> removeLeftChild();

	/**
	 * Removes the right child from the current node.
	 * @return the node which was removed, null if there is no right child
	 */
	public BinaryTree<V> removeRightChild();

	/**
	 * Returns if the current node has any children.
	 * @return true if the node has any children
	 */
	public boolean hasChildren();

	/**
	 * Returns the height, which is the greatest distance from the current node
	 * to any leaf node.
	 * @return the height
	 */
	public int height();

	/**
	 * Calculates the depth of the given node in this Tree
	 * @return The node's depth or -1 is the node is not in
	 * the Tree
	 */
	public int depthOf(BinaryTree<V> t);

	/**
	 * Traverses the tree with the current node as the root, in preorder.
	 * @return an iterator of the tree ata in preorder
	 */
	public Iterator<V> traversePre();

	/**
	 * Traverses the tree with the current node as the root, in inorder.
	 * @return an iterator of the tree ata in inorder
	 */
	public Iterator<V> traverseIn();

	/**
	 * Traverses the tree with the current node as the root, in postorder.
	 * @return an iterator of the tree ata in postorder
	 */
	public Iterator<V> traversePost();

	/**
	 * Membership test for a value in the tree.
	 * @return true if the value is in the tree
	 */
	public boolean contains(V value);

	/**
	 * The total number of nodes in this tree,
	 * including the root node. Because this datastructure
	 * supports null values, such nodes still count
	 * @return The total number of nodes.
	 */
	public int size();

	/**
	 * Tells whether every leaf is the same depth below this node.
	 * @return true if adding a node to tree would necessarily increase its height
	 */
	public boolean isFull();

	/**
	 * Similar to isFull, but last generation need not be complete.
	 * @return true if and any holes in the tree appear in the bottom right
	 */
	public boolean isComplete();

	/**
	 * Tells whether there are roughly the same number of leaves on the left
	 * and right children.
	 * @return true if the difference of heights of subtrees at every node
	 * is no greater than one.
	 */
	public boolean isBalanced();
}

public interface BinaryTree<V> {
	
	/**
	 * Returns the left child of the current node.
	 * @return the left child, or null if it does not exist
	 */
	public BinaryTree getLeftChild();
	
	/**
	 * Returns the right child of the current node.
	 * @return the right child, or null if it does not exist
	 */
	public BinaryTree getRightChild();
	
	/**
	 * Returns the value of the current node.
	 * @return current value
	 */
	public V getValue();
	
	/**
	 * Adds a new node to the tree with the given value.
	 * @param a the value of the node to add to the tree
	 */
	public void add(V a);
	
	/**
	 * Adds a node and all its children to the tree.
	 * @param a the tree to add to the tree
	 */
	public void add(BinaryTree<V> a);
	
	/**
	 * Removes the left child from the current node.
	 * @return the node which was removed, null if there is no left child
	 */
	public BinaryTree removeLeftChild();
	
	/**
	 * Removes the right child from the current node.
	 * @return the node which was removed, null if there is no right child
	 */
	public BinaryTree removeRightChild();
	
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
	 * Traverses the tree with the current node as the root, returning a List 
	 * of the values of the tree (including the root) in order.
	 * @return a List of values
	 */
	public List<V> traverse();
	
	/**
	 * Membership test for a value in the tree.
	 * @return true if the value is in the tree
	 */
	public boolean contains(V value);
	
	/**
	 * Removes the node of the given value from the tree, readding all of its
	 * children.
	 * @return true if the removal was successful
	 */
	public boolean remove(V value);
	
}
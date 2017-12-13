// You may add to the class signature, but not remove from it.
// For example you may want to inherit methods from another Binary Tree.
// Or you may find other standard java interfaces useful.
public class BasicBinaryTree<V> implements BinaryTree<V>{

  /**
   * Basic constructor leaves all data uninitialized
   */
  public BasicBinaryTree(){
    //TODO implement this
  }

  /**
   * Basic constructor initializes data, but not children.
   * @param val the data value to be stored in this node.
   */
  public BasicBinaryTree(V val){
    //TODO implement this
  }

  /**
   * Constructor initializes data and one child.
   * @param val the data value to be stored in this node.
   * @param child the one child to be initialized.
   */
  public BasicBinaryTree(V val, BasicBinaryTree<V> child){
    //TODO implement this
  }


  /**
   * Adds a new node to the tree with the given value.
   * The node should go in the highest, left-most available
   * position in the tree. This means that if nodes are only
   * ever added using this method, the tree should always
   * be complete
   * @param a the value of the node to add to the tree
   */
  public void add(V a){
    //TODO implement this
  }

  /**
   * Adds the given node (and therefore all of its children)
   * as this node's left child. Should not replace an existing
   * node if it is there. Use removeLeftChild first.
   * @return whether the add was successful
   */
  public boolean addLeftChild(Tree<V>){
    //TODO implement this
  }

  /**
   * Adds the given node (and therefore all of its children)
   * as this node's right child. Should not replace an existing
   * node if it is there. Use removeRightChild first.
   * @return whether the add was successful
   */
  public boolean addRightChild(Tree<V>){
    //TODO implement this
  }

}

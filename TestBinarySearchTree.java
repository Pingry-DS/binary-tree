import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.Assert.*; // Order is expected, actual
import org.junit.Test;
import org.junit.Before;

public class TestBinarySearchTree {

  private BinarySearchTree<Integer> a;
  private BinarySearchTree<Integer> a1;
  private BinarySearchTree<Integer> a2;

  private BinarySearchTree<Integer> b;
  private BinarySearchTree<Integer> b1;
  private BinarySearchTree<Integer> b2;
  private BinarySearchTree<Integer> b3;
  private BinarySearchTree<Integer> b4;

  private BinarySearchTree<Integer> e; // an empty one

  @Before
  public void setUp(){

    /*******************************
     Build a tree called a
                   1
                  / \
                 0  2
    **********************************/
    a = new BinarySearchTree<>(1);
    a1 = new BinarySearchTree<>(0);
    a2 = new BinarySearchTree<>(2);
    a.add(a1);
    a.add(a2);


    /*******************************
     Build a tree called b
                   5
                  /  \
                3     7
                 \     \
                  4     8
    **********************************/
    b = new BinarySearchTree<>(5);
    b1 = new BinarySearchTree<>(3);
    b2 = new BinarySearchTree<>(4);
    b3 = new BinarySearchTree<>(7);
    b4 = new BinarySearchTree<>(8);
    b.add(b3);
    b.add(b4);
    b.add(b1);
    b.add(b2);


    /*******************************
     Build an empty tree called e
    **********************************/
    e = new BinarySearchTree<>(0);
  }

  @Test
  public void testAdd0(){
	  a.add(new BinarySearchTree<String>(3));
	  assertEquals(3, a.getRightChild().getRightChild().getValue());
  }

  @Test
  public void testAdd1(){
	  b.add(new BinarySearchTree<String>(2));
	  assertEquals(2, a.getLeftChild().getLeftChild().getValue());
  }
  @Test
  public void testAdd2(){
	  b.add(new BinarySearchTree<String>(6));
	  assertEquals(6, a.getRightChild().getLeftChild().getValue());
  }
  @Test
  public void testAdd3(){
	  b.add(new BinarySearchTree<String>(7));
	  assertEquals(7, a.getRightChild().getRightChild().getLeftChild().getValue());
  }
  
  @Test
  public void testRemove0(){
	  assertEquals(2, a.remove(new Integer(2)));
  }
  
  @Test
  public void testRemove1(){
	  a.remove(new Integer(7));
	  assertEquals(8, a.getRightChild().get());
  }
  
}

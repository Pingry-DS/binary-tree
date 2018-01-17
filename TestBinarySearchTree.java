import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.Assert.*; // Order is expected, actual
import org.junit.Test;
import org.junit.Before;

public class TestBinarySearchTree {

  private BST<Integer> a;
  private BST<Integer> a1;
  private BST<Integer> a2;

  private BST<Integer> b;
  private BST<Integer> b1;
  private BST<Integer> b2;
  private BST<Integer> b3;
  private BST<Integer> b4;

  private BST<Integer> e; // an empty one

  @Before
  public void setUp(){

    /*******************************
     Build a tree called a
                   1
                  / \
                 0  2
    **********************************/
    a = new BST<>(1);
    a1 = new BST<>(0);
    a2 = new BST<>(2);
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
    b = new BST<>(5);
    b1 = new BST<>(3);
    b2 = new BST<>(4);
    b3 = new BST<>(7);
    b4 = new BST<>(8);
    b.add(b3);
    b.add(b4);
    b.add(b1);
    b.add(b2);


    /*******************************
     Build an empty tree called e
    **********************************/
    e = new BST<>(0);
  }

  @Test
  public void testAdd0(){
	  a.add(new BST<Integer>(3));
	  assertEquals(new Integer(3), a.getRightChild().getRightChild().getValue());
  }

  @Test
  public void testAdd1(){
	  b.add(new BST<Integer>(2));
	  assertEquals(new Integer(2), b.getLeftChild().getLeftChild().getValue());
  }
  @Test
  public void testAdd2(){
	  b.add(new BST<Integer>(6));
	  assertEquals(new Integer(6), b.getRightChild().getLeftChild().getValue());
  }
  @Test
  public void testAdd3(){
	  b.add(new BST<Integer>(7));
	  assertEquals(new Integer(7), b.getRightChild().getRightChild().getLeftChild().getValue());
  }
  
  @Test
  public void testRemove0(){
	  assertEquals(new Integer(2), a.remove(new Integer(2)));
  }
  
  @Test
  public void testRemove1(){
	  b.remove(new Integer(7));
	  assertEquals(new Integer(8), b.getRightChild().getValue());
  }
  
}
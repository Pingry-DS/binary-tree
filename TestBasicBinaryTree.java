// Order is expected, actual

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class TestBasicBinaryTree {

  private BasicBinaryTree<String> a;
  private BasicBinaryTree<String> b;
  private BasicBinaryTree<String> c;
  private BasicBinaryTree<String> d;
  private BasicBinaryTree<String> e; // an empty one

  @Before
  public void setUp(){
    // Build an empty tree called e
    e = new BinaryTree();

    /*******************************
     Build a tree called a

                   a0
                  /
                 a1
                /
               a2
    **********************************/



    /*******************************
     Build a tree called b

                   b0
                  /  \
                b1   b2
               /       \
             b3        b4
    **********************************/


    /*******************************
     Build a tree called c

                   c0
                  /  \
                c1   c2
               / \  /  \
             c3 c4 c5   c6
    **********************************/



    /*******************************
     Build a tree called d

                   d0
                  /  \
                d1   d2
               / \
             c3 c4
    **********************************/

  }

  // Write tests hese
  @Test
  public void someTest(){
  }

}

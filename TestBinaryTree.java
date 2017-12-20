import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.Assert.*; // Order is expected, actual
import org.junit.Test;
import org.junit.Before;

public class TestBinaryTree {

  private BasicBinaryTree<String> a;
  private BasicBinaryTree<String> a1;
  private BasicBinaryTree<String> a2;

  private BasicBinaryTree<String> b;
  private BasicBinaryTree<String> b1;
  private BasicBinaryTree<String> b2;
  private BasicBinaryTree<String> b3;
  private BasicBinaryTree<String> b4;

  private BasicBinaryTree<String> c;
  private BasicBinaryTree<String> c1;
  private BasicBinaryTree<String> c2;
  private BasicBinaryTree<String> c3;
  private BasicBinaryTree<String> c4;
  private BasicBinaryTree<String> c5;
  private BasicBinaryTree<String> c6;

  private BasicBinaryTree<String> d;
  private BasicBinaryTree<String> d1;
  private BasicBinaryTree<String> d2;
  private BasicBinaryTree<String> d3;
  private BasicBinaryTree<String> d4;

  private BasicBinaryTree<String> e; // an empty one

  @Before
  public void setUp(){

    /*******************************
     Build a tree called a
                   a0
                  /
                 a1
                /
               a2
    **********************************/
    a = new BasicBinaryTree<>("a0");
    a1 = new BasicBinaryTree<>("a1");
    a2 = new BasicBinaryTree<>("a2");
    a.addLeftChild(a1);
    a1.addLeftChild(a2);


    /*******************************
     Build a tree called b
                   b0
                  /  \
                b1   b2
               /       \
             b3        b4
    **********************************/
    b = new BasicBinaryTree<>("b0");
    b1 = new BasicBinaryTree<>("b1");
    b2 = new BasicBinaryTree<>("b2");
    b3 = new BasicBinaryTree<>("b3");
    b4 = new BasicBinaryTree<>("b4");
    b1.addLeftChild(b3);
    b2.addRightChild(b4);
    b.addLeftChild(b1);
    b.addRightChild(b2);


    /*******************************
     Build a tree called c
                   c0
                  /  \
                c1   c2
               / \  /  \
             c3 c4 c5   c6
    **********************************/
    c = new BasicBinaryTree<>();
    c1 = new BasicBinaryTree<>("c1");
    c2 = new BasicBinaryTree<>("c2");
    c3 = new BasicBinaryTree<>("c3");
    c4 = new BasicBinaryTree<>("c4");
    c5 = new BasicBinaryTree<>("c5");
    c6 = new BasicBinaryTree<>("c6");
    c1.addLeftChild(c3);
    c1.addRightChild(c4);
    c2.addLeftChild(c5);
    c2.addRightChild(c6);
    c.addLeftChild(c1);
    c.addRightChild(c2);


    /*******************************
     Build a tree called d
                   d0
                  /  \
                d1   d2
               / \
             d3 d4
    **********************************/
    d = new BasicBinaryTree<>("d");
    d1 = new BasicBinaryTree<>("d1");
    d2 = new BasicBinaryTree<>("d2");
    d3 = new BasicBinaryTree<>("d3");
    d4 = new BasicBinaryTree<>("d4");
    d.addLeftChild(d1);
    d.addRightChild(d2);
    d1.addLeftChild(d3);
    d1.addRightChild(d4);

    /*******************************
     Build an empty tree called e
    **********************************/
    e = new BasicBinaryTree<>("e0");
  }

  @Test
  public void testIsFullTrue0(){
    assertTrue(c.isFull());
  }

  @Test
  public void testIsFullTrue1(){
    assertTrue(e.isFull());
  }

  @Test
  public void testIsFullFalse0(){
    assertFalse(a.isFull());
  }

  @Test
  public void testIsFullFalse1(){
    assertFalse(b.isFull());
  }

  @Test
  public void testIsFullFalse2(){
    assertFalse(d.isFull());
  }

  @Test
  public void testIsCompleteTrue0(){
    assertTrue(c.isComplete());
  }

  @Test
  public void testIsCompleteTrue1(){
    assertTrue(d.isComplete());
  }

  @Test
  public void testIsCompleteTrue2(){
    assertTrue(e.isComplete());
  }

  @Test
  public void testIsCompleteFalse0(){
    assertFalse(a.isComplete());
  }

  @Test
  public void testIsCompleteFalse1(){
    assertFalse(b.isComplete());
  }

  @Test
  public void testIsBalancedTrue0(){
    assertTrue(b.isBalanced());
  }

  @Test
  public void testIsBalancedTrue1(){
    assertTrue(c.isBalanced());
  }

  @Test
  public void testIsBalancedTrue2(){
    assertTrue(d.isBalanced());
  }

  @Test
  public void testIsBalancedTrue3(){
    assertTrue(e.isBalanced());
  }

  @Test
  public void testIsBalancedFalse0(){
    assertFalse(a.isBalanced());
  }


  @Test
  public void testTraversePreA()
  {
    ArrayList <BasicBinaryTree> preA = new ArrayList<>();
    preA.add(a); preA.add(a1); preA.add(a2);

    Iterator<String> aIterator = a.traversePre();
    int i = 0;
    while(aIterator.hasNext())
    {
      assertEquals(aIterator.next(), preA.get(i).getValue());
      i++;
    }
  }

  @Test
  public void testTraversePreD()
  {
    ArrayList<BasicBinaryTree> preD = new ArrayList<>();
    preD.add(d); preD.add(d1); preD.add(d3); preD.add(d4); preD.add(d2);

    Iterator<String> dIterator = d.traversePre();
    int i = 0;
    while(dIterator.hasNext())
    {
      assertEquals(dIterator.next(), preD.get(i).getValue());
      i++;
    }
  }

  @Test
  public void testTraverseinD()
  {
    ArrayList <BasicBinaryTree> inD = new ArrayList<>();
    inD.add(d3); inD.add(d1); inD.add(d4); inD.add(d); inD.add(d2);

    Iterator<String> dIterator = d.traverseIn();
    int i = 0;
    while(dIterator.hasNext())
    {
      assertEquals(dIterator.next(), inD.get(i).getValue());
      i++;
    }
  }

  @Test
  public void testTraverseinC(){
    ArrayList <BasicBinaryTree> inC = new ArrayList<>();
    inC.add(c3); inC.add(c1); inC.add(c4); inC.add(c); inC.add(c5); inC.add(c2); inC.add(c6);

    Iterator<String> cIterator = c.traverseIn();
    int i = 0;
    while(cIterator.hasNext())
    {
      assertEquals(cIterator.next(), inC.get(i).getValue());
      i++;
    }
  }


  @Test
  public void testTraversePostB(){
    ArrayList <BasicBinaryTree> postB = new ArrayList<>();
    postB.add(b3); postB.add(b1); postB.add(b4); postB.add(b2); postB.add(b);

    Iterator<String> bIterator = b.traversePost();
    int i = 0;
    while(bIterator.hasNext())
    {
      assertEquals(bIterator.next(), postB.get(i).getValue());
      i++;
    }
  }


  @Test
  public void testTraversePostE(){
    Iterator<String> eIterator = e.traversePost();

    assertEquals("e0", eIterator.next());
    assertFalse(eIterator.hasNext());
  }

  @Test
  public void testGetLeft(){
    assertEquals(c3, c.getLeftChild().getLeftChild());
  }

  @Test
  public void testGetRight(){
    assertEquals(d2, d.getRightChild());
  }

  @Test
  public void getValue(){
    assertEquals(d.getLeftChild().getValue(), "d1");
  }

  @Test
  public void getRightNull(){
    assertEquals(a.getRightChild(), null);
  }

  @Test
  public void testHasChildrenEmpty(){
   assertFalse(e.hasChildren());
  }

  @Test
  public void testHasChildrenBoth(){
    assertTrue(c.hasChildren());
  }

  @Test
  public void testHasChildrenOneChild(){
    assertTrue(a.hasChildren());
  }

  @Test
  public void testHeight0(){
    assertEquals(0, d.getRightChild().height());
  }

  @Test
  public void testHeightNonzero(){
    assertEquals(2, d.height());
  }

  @Test
  public void testDepth0(){
    assertEquals(0, d.depthOf(d));
  }

  @Test
  public void testDepthNonzero(){
    assertEquals(1, d.depthOf(d.getLeftChild()));
 }

  @Test
  public void testContainsTrue()
  {
    assertTrue(a.contains("a1"));
  }

  @Test
  public void testContainsFalse()
  {
    assertFalse(a.contains("rejection"));
  }

  @Test
  public void testSizeIsMin()
  {
    assertEquals(1, e.size());
  }

  @Test
  public void testSizeIsFive()
  {
    assertEquals(5, d.size());
  }
  
}

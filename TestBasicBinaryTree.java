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
    // Setup the example trees here
  }

  // Write tests hese
  @Test
  public void testNormalPut(){
    e.put("hello", "world");
    assertEquals("world", e.get("hello"));
    assertEquals(1, e.size());
  }

}

import static org.junit.Assert.assertEquals;
import java.util.*;
import org.junit.Test;

public class TreeProblemsTest {

  // =============================
  // Helper methods for Node trees
  // =============================

  /**
   * Builds an integer tree (using Node<Integer>) with non-sorted node values.
   * Structure:
   * 
   *             7
   *          /  |  \
   *        11   3    2
   *            / \
   *           5  -1
   *                \
   *                 9
   * 
   * Expected sum: 7 + 11 + 3 + 2 + 5 + (-1) + 9 = 36.
   */
  private Node<Integer> buildMixedIntegerTree() {
    Node<Integer> root = new Node<>(7);
    // Adding children in a mixed order
    Node<Integer> child1 = new Node<>(11);
    Node<Integer> child2 = new Node<>(3);
    Node<Integer> child3 = new Node<>(2);
    root.children.add(child1);
    root.children.add(child2);
    root.children.add(child3);

    // For node 3, add children (order is intentionally jumbled)
    Node<Integer> child2a = new Node<>(5);
    Node<Integer> child2b = new Node<>(-1);
    child2.children.add(child2b); // intentionally add -1 first
    child2.children.add(child2a);

    // For node -1, add one child
    Node<Integer> child2b_child = new Node<>(9);
    child2b.children.add(child2b_child);

    return root;
  }

  // ============================
  // sumTree (Node version) tests
  // ============================

  @Test
  public void testSumTreeNode_NullTree() {
    Node<Integer> nullNode = null;
    assertEquals("A null Node tree should yield 0", 0, TreeProblems.sumTree(nullNode));
  }

  @Test
  public void testSumTreeNode_SingleNode() {
    Node<Integer> single = new Node<>(42);
    assertEquals("A single-node tree should return its value", 42, TreeProblems.sumTree(single));
  }

  @Test
  public void testSumTreeNode_ComplexTree() {
    Node<Integer> root = buildMixedIntegerTree();
    assertEquals("Sum of nodes in a complex Node tree is incorrect", 36, TreeProblems.sumTree(root));
  }

  // ============================
  // sumTree (Map version) tests
  // ============================

  @Test
  public void testSumTreeMap_NullTree() {
    Map<Integer, List<Integer>> nullTree = null;
    assertEquals("A null Map tree should yield 0", 0, TreeProblems.sumTree(nullTree));
  }

  @Test
  public void testSumTreeMap_SingleNode() {
    Map<Integer, List<Integer>> tree = new HashMap<>();
    tree.put(42, List.of());
    assertEquals("A Map with a single key should return that key's value", 42, TreeProblems.sumTree(tree));
  }

  @Test
  public void testSumTreeMap_ComplexTree() {
    Map<Integer, List<Integer>> tree = new HashMap<>();
    tree.put(7, List.of(2, 11, 3));
    tree.put(3, List.of(-1, 5));
    tree.put(11, List.of());
    tree.put(2, List.of(8));
    tree.put(-1, List.of(9));
    tree.put(5, List.of());
    tree.put(8, List.of());
    tree.put(9, List.of());

    assertEquals("Sum of nodes in a complex Map tree is incorrect", 44, TreeProblems.sumTree(tree));
  }

  // ============================
  // findRoot tests
  // ============================

  @Test
  public void testFindRoot_SingleNode() {
    Map<Integer, List<Integer>> tree = new HashMap<>();
    tree.put(42, List.of());
    assertEquals("Single-node tree: root should be 42", 42, TreeProblems.findRoot(tree).intValue());
  }

  @Test
  public void testFindRoot_ProvidedExample() {
    Map<Integer, List<Integer>> tree = new HashMap<>();
    tree.put(20, List.of(40));
    tree.put(8, List.of());
    tree.put(30, List.of());
    tree.put(10, List.of(20, 30, 99));
    tree.put(40, List.of());
    tree.put(99, List.of(8));

    assertEquals("findRoot did not return the correct root for the provided example", 10, TreeProblems.findRoot(tree).intValue());
  }

  @Test
  public void testFindRoot_RandomOrder() {
    Map<Integer, List<Integer>> tree = new HashMap<>();
    tree.put(13, List.of(19, 7));
    tree.put(7, List.of(3));
    tree.put(19, List.of());
    tree.put(3, List.of(2, 11));
    tree.put(2, List.of());
    tree.put(11, List.of());

    assertEquals("findRoot did not identify the correct root in a mixed-order tree", 13, TreeProblems.findRoot(tree).intValue());
  }

  // ============================
  // maxDepth (Node version) tests
  // ============================

  @Test
  public void testMaxDepthNode_NullTree() {
    Node<Integer> nullNode = null;
    assertEquals("A null Node tree should have depth 0", 0, TreeProblems.maxDepth(nullNode));
  }

  @Test
  public void testMaxDepthNode_SingleNode() {
    Node<String> single = new Node<>("solo");
    assertEquals("A single-node tree should have depth 1", 1, TreeProblems.maxDepth(single));
  }

  @Test
  public void testMaxDepthNode_ComplexTree() {
    assertEquals("Tree with 4 levels should have a depth of 4", 4, TreeProblems.maxDepth(buildMixedIntegerTree()));
  }

  // ============================
  // maxDepth (Map version) tests
  // ============================

  @Test
  public void testMaxDepthMap_NullTree() {
    Map<String, List<String>> nullTree = null;
    assertEquals("A null Map tree should have depth 0", 0, TreeProblems.maxDepth(nullTree));
  }

  @Test
  public void testMaxDepthMap_SingleNode() {
    Map<String, List<String>> tree = new HashMap<>();
    tree.put("solo", List.of());
    assertEquals("A single-node Map tree should have depth 1", 1, TreeProblems.maxDepth(tree));
  }

  @Test
  public void testMaxDepthMap_ComplexTree() {
    Map<String, List<String>> tree = new HashMap<>();
    tree.put("t2", List.of("t1", "t3", "2child"));
    tree.put("t1", List.of("t4"));
    tree.put("t3", List.of());
    tree.put("2child", List.of());
    tree.put("t4", List.of("t6"));
    tree.put("t6", List.of());

    assertEquals("maxDepth (Map) did not compute the correct depth", 4, TreeProblems.maxDepth(tree));
  }
}

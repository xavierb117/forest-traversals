import java.util.List;
import java.util.Map;

public class TreeProblems {

  /*
   sumTree (Node Version)
   -----------
   Given a tree built with the Node class (with integer values), compute and return the sum of all the node values.
   Example:
   If the tree is:
          5
       /  |  \
      3   9   8
        / | \  
       4  1  2
   then the method should return 32.
  */
  public static int sumTree(Node<Integer> root) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /*
   sumTree (Map Version)
   -----------
   Given a tree represented as a map (where every node appears as a key and leaf nodes map to an empty list),
   compute the sum of all nodes.
   Example:
   For a tree represented as:
     5 -> [3, 9, 8]
     3 -> []
     9 -> [4, 1, 2]
     4 -> []
     1 -> []
     2 -> []
   the method should return 32.

   Hint: There's a simple way to do this!
  */
  public static int sumMapTreeValues(Map<Integer, List<Integer>> tree) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /*
   countLeafNodes (Node version)
   -----------
   Given a tree represented as a map where keys represent parent nodes and values are lists of children,
   count and return the number of leaf nodes. A leaf node is one that has an empty list as its value.
   Example:
   For a tree represented as:
        5
      / | \
     7  8  9
           |
           2

   the method should return 3 (nodes 2, 7, and 8 are leaves).
  */
  public static <T> int countLeafNodes(Node<T> root) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /*
   countLeafNodes (Map version)
   -----------
   Given a tree represented as a map where keys represent parent nodes and values are lists of children,
   count and return the number of leaf nodes. A leaf node is one that has an empty list as its value.
   Example:
   For a tree represented as:
     2 -> []
     5 -> [7, 8, 9]
     7 -> []
     8 -> []
     9 -> [2]
     
   the method should return 3 (nodes 2, 7, and 8 are leaves).

   Hint: There's a simple way to do this!
  */
  public static int countLeafNodes(Map<Integer, List<Integer>> tree) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /*
   findRoot
   -----------
   Given a tree represented as a map where each key is a parent node and the value is a list of its children,
   find the root of the tree. The root is the node with no parents.
   Example:
   If the tree is represented as:
     20 -> [40]
     8  -> []
     30 -> []
     10 -> [20, 30, 99]
     40 -> []
     99 -> [8]
   then the method should return 10.

   Hint: No recursion needed! Think about how you would do this by hand.
  */
  public static int findRoot(Map<Integer, List<Integer>> tree) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /*
   maxDepth (Node Version)
   -----------
   Compute the maximum depth of a tree using the Node class. The depth is the number of nodes along
   the longest path from the root down to the farthest leaf. The root is at depth 1. If the tree is null, return 0.
   Example:
   For a tree structured as:
          A
       /  |  \
      B   E   C
      |      / \
      E     D   Q
               /
              Z
   the maximum depth is 4.
  */
  public static <T> int maxDepth(Node<T> root) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /*
   maxDepth (Map Version)
   -----------
   Compute the maximum depth of a tree using the Node class. The depth is the number of nodes along
   the longest path from the root down to the farthest leaf. The root is at depth 1. If the tree is null, return 0.
   Example:
   For a tree structured as:
    A -> [B, E, C]
    B -> [E]
    E -> []
    C -> [D, Q]
    D -> []
    Q -> [Z]
    Z -> []
   the maximum depth is 4.

   Hint: Use findRoot to start. Then, make a recursive helper method.
  */
  public static int maxDepth(Map<String, List<String>> tree) {
    return -1;
  }
  

  /*
   findMax
   -----------
   Given a tree of integers using the Node class, find and return the maximum value in the tree.
   Example:
   For a tree:
          12
         /  \
        3    18
           /
          7
   the method should return 18.
  */
  public static int findMax(Node<Integer> root) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /*
   countNodesAtDepth
   -----------
   Count the number of nodes at a given depth in a tree using the Node class. The root node is at depth 0.
   Example:
   If the tree is:
         R
       / | \
      A  B  C
          |
          D
   then countNodesAtDepth(root, 1) should return 3 (nodes A, B, C) and countNodesAtDepth(root, 2) should return 1 (node D).
  */
  public static int countNodesAtDepth(Node<?> root, int depth) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /*
   treeDiameter
   -----------
   Compute the diameter of a tree using the Node class. The diameter is defined as the length (number of nodes)
   in the longest path between any two nodes in the tree. The tree can be n-ary.
   Example:
   For the tree:
           1
         /   \
        2     3
       / \
      4   5
   one longest path is 4 -> 2 -> 1 -> 3, so the diameter is 4.
  */
  public static int treeDiameter(Node<Integer> root) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /*
   lowestCommonAncestor
   -----------
   Given a tree (using the Node class with integer values) and two integer values, determine the lowest common
   ancestor (LCA) of the nodes with these values. The LCA is the deepest node that has both values as descendants.
   Assume both values exist in the tree.
   Example:
   For a tree:
          1
        /   \
       2     3
      / \
     4   5
   the lowest common ancestor of 4 and 5 is 2.
  */
  public static Node<Integer> lowestCommonAncestor(Node<Integer> root, int val1, int val2) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /*
   isBalanced
   -----------
   Determine if a tree represented as a map is balanced. A tree is balanced if for every node, the difference in
   height between its tallest subtree and its shortest subtree is at most 1. For this problem, consider the height
   of a leaf node as 0.
   Example:
   A tree where:
     10 -> [5, 15]
      5 -> []
     15 -> [20]
     20 -> []
   may be considered unbalanced if the height difference at node 10 exceeds 1.
  */
  public static boolean isBalanced(Map<Integer, List<Integer>> tree) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /*
   hasPathSum
   -----------
   Given a tree built with the Node class (with integer values) and a target sum, determine whether there exists
   a root-to-leaf path such that the sum of the node values along the path equals the target sum.
   Example:
   For the tree:
         5
        / \
       3   8
      /
     2
   if the target sum is 10, then the path 5 -> 3 -> 2 sums to 10 and the method should return true.
  */
  public static boolean hasPathSum(Node<Integer> root, int targetSum) {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}

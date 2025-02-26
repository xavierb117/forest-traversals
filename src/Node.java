import java.util.ArrayList;
import java.util.List;

public class Node<T> {
  T value;
  List<Node<T>> children;
  
  public Node(T value) {
    this(value, new ArrayList<>());
  }

  public Node(T value, List<Node<T>> children) {
    this.value = value;
    this.children = new ArrayList<>(children);
  }

  @Override
  public String toString() {
    return "Node(" + value + ")";
  }
}
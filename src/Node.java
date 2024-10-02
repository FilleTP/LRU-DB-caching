public class Node {
  Actor actor;
  Node prev;
  Node next;

  public Node(Actor actor) {
    this.actor = actor;
    this.prev = null;
    this.next = null;
  }
}

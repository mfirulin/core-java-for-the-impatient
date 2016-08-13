public class Queue {

  private static class Node {
  	String string;
    Node next;
  }
  
  private Node head;
  private Node tail;
  
  public void add(String string) {
  	Node node = new Node();
    node.string = string;
    
    if (head == null) // Add the first node in the queue
  	  head = tail = node;
          
    tail.next = node;
    tail = node;
  }
  
  public void remove() {
    if (head != null) {
        head = head.next;
    
        if (head == null) // The last node was just removed
            tail = null;
    }
  }
  
  public static void main(String[] args) {
  	Queue queue = new Queue();
    for (int i = 0; i < 5; i++)
      queue.add("String " + i);
    
    System.out.println(queue.head.string);
    System.out.println(queue.tail.string);
    
    for (int i = 0; i < 6; i++)
      queue.remove();
  }
}

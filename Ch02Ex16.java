
public class Queue {

  private static class Node {
  	String string;
    Node nextNode;
  }
  
  private Node firstNode;
  private Node lastNode;
  
  public void add(String string) {
  	Node node = new Node();
    node.string = string;
    
    if (firstNode == null) // Add the first node in the queue
  	  firstNode = lastNode = node;
          
    lastNode.nextNode = node;
    lastNode = node;
  }
  
  public void remove() {
    if (firstNode == null) return; // No nodes to remove
    
  	firstNode = firstNode.nextNode;
    
    if (firstNode == null) // The last node in the queue was just removed
      lastNode = null;
  }
  
  public static void main(String[] args) {
  	Queue queue = new Queue();
    for (int i = 0; i < 5; i++)
      queue.add("String " + i);
    
    System.out.println(queue.firstNode.string);
    System.out.println(queue.lastNode.string);
    
    for (int i = 0; i < 6; i++)
      queue.remove();
  }
}

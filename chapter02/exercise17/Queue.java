public class Queue {

    public static class Node {
        public String string;
        private Node next;
    }

    public class Iterator {
        Node next = head;

        public boolean hasNext() { return next != null; }

        public Node next() {
            Node node = next;
            if (next != null) next = next.next;
            return node;    
        }
    }

    private Node head;
    private Node tail;

    public void add(String string) {
        Node node = new Node();
        node.string = string;

        if (head == null) { // Add the first node in the queue
            head = tail = node;
        } else { // Add all other nodes
            tail.next = node;
            tail = node;
        }
    }

    public void remove() {
        if (head != null) {
            head = head.next;

            if (head == null) // The last node was just removed
                tail = null;
        }
    }

    public Iterator iterator() {
        return new Iterator(); 
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 0; i < 5; i++) queue.add("String " + i);

        Iterator iterator = queue.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next().string);

        for (int i = 0; i < 2; i++) queue.remove();

        iterator = queue.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next().string);
    }
}

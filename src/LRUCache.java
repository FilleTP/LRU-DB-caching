import java.util.HashMap;

class LRUCache {
    private HashMap<String, Node> map;
    private Node head, tail;
    private int capacity;
    private int size;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        map = new HashMap<>();
        head = null;
        tail = null;
    }

    // Get an actor by name (key)
    public Actor get(String name) {
        if (!map.containsKey(name)) {
            System.out.println(name + " is not in the cache.");
            return null;
        }

        // Move the accessed node to the front (most recently used)
        Node node = map.get(name);
        moveToFront(node);

        return node.actor;
    }

    // Add or update an actor in the cache
    public void put(String name, int age) {
        if (map.containsKey(name)) {
            // Update the existing actor and move to front
            Node node = map.get(name);
            node.actor.age = age;  // Update the actor's age
            moveToFront(node);
        } else {
            // Add a new actor
            Node newNode = new Node(new Actor(name, age));
            if (size == capacity) {
                // If the cache is full, remove the least recently used actor
                removeLast();
            }
            addToFront(newNode);
            map.put(name, newNode);
            size++;
        }
    }

    // Move the node to the front of the list
    private void moveToFront(Node node) {
        if (node == head) {
            return;  // It's already at the front
        }

        // Remove node from current position
        removeNode(node);

        // Add it to the front
        addToFront(node);
    }

    // Remove a node from its current position in the list
    private void removeNode(Node node) {
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }
    }

    // Add a node to the front of the list
    private void addToFront(Node node) {
        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }
        head = node;

        if (tail == null) {
            tail = node;  // If the list was empty, tail also points to this node
        }
    }

    // Remove the least recently used actor (from the tail of the list)
    private void removeLast() {
        if (tail == null) {
            return;
        }

        // Remove the node from the map and the linked list
        map.remove(tail.actor.name);
        removeNode(tail);
        size--;
    }

    // Utility function to print the cache contents
    public void printCache() {
        Node current = head;
        while (current != null) {
            System.out.print(current.actor.toString() + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

/**
 * The program simulates a LRU caching policy
 * LRUCache class creates a hashmap and nodes
 * Methods for keeping track of tail and head
 * and other relevant LRU methods are implemented
 * Nodes encapsulates logic for the Linked List
 */

public class Main {
  public static void main(String[] args) {
    LRUCache cache = new LRUCache(4);

    cache.put("Brad Pitt", 55);
    cache.put("Julia Roberts", 45);
    cache.put("Alexander Skaarsgard", 52);
    cache.put("Ryan Gosling", 39);

    cache.printCache();

    // Access an actor should move them to the front of the node list
    System.out.println("Accessing Brad Pitt\n");
    cache.get("Brad Pitt");
    cache.printCache();

    // Adding a new actor should evict the least recently used actor
    System.out.println("Adding Tom Cruise\n");
    cache.put("Tom Cruise", 60);
    cache.printCache();

    // Accessing an actor that is not in the cache
    System.out.println("Accessing an actor not present in cache");
    cache.get("Christopher Nolan");
    cache.printCache();
  }
}

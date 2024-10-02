# README

## LRU Caching Program

Overview: This Java program implements an LRU (Least Recently Used) Cache using a combination of HashMap and a doubly linked list. The cache supports adding, accessing, and automatically evicting the least recently used items when capacity is exceeded.

## Project Structure:
```
.
├── src
│   ├── Main.java       # Entry point of the program
│   ├── LRUCache.java   # LRU Cache implementation
│   ├── Actor.java      # Actor class representing cache data
│   └── Node.java       # Node class for the linked list
├── bin                 # Compiled .class files go here
├── Makefile            # Build and run commands
└── README.md           # Project documentation
```

## How to Build and Run:

1. **Compile the program**:
   `make compile`

2. **Run the program**:
   `make run`

3. **Clean compiled files**:
   `make clean`

## Classes:

Main: Contains the main() method to demonstrate cache usage.
Actor: Represents an actor with a name and age.
LRUCache: Implements the LRU caching mechanism with put() and get() methods.
Node: Helper class representing each node in the linked list.

## Requirements:

  - Java 8 or higher
  - Make

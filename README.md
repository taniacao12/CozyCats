## Deque
Created by: CozyCats (Tania Cao, Frank Chen, Puneet Johal)

### To-Do List
1. Write QQKachoo.java
   1. Copy over methods from interface
   2. Write addFirst/Last, removeFirst/Last, and getFirst/Last
   3. Write offerFirst/Last, pollFirst/Last, and peekFirst/Last
2. Test QQKachoo.java
3. Fix any errors
4. Repeat step 2 and 3 until there are no problems in the code

### Development Plan
1. Look in API to learn what deque does and how it functions
2. Add basic methods to add, remove, and peek at either end of the deque to the Deque interface
3. Implement addFirst, removeFirst, and getFirst in QQKachoo to ensure you can add, remove, and peek at one end. **Test**. These methods give the deque the FILO property.
4. Implement addLast, removeLast, and getLast to ensure you can add, remove, and peek at the other end. **Test**. The deque can now be used both as a FIFO and FILO data structure now.
5. Implement the parallel methods *offer*, *poll*, and *peek* that return special values instead of throwing exceptions. **Test**.
6. Add capacity restriction property to QQKachoo.
7. **Test, test, and test again**


### Method Selection
For our Deque, we decided to use a (doubly-linked) node-based architecture. This is because it is easier and faster to access both ends of the deque, since there are pointers to both head and tail.

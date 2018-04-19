public class QQKachoo<T> implements Deque<T> {
    // Instance Variables
    private DLLNode<D> _front, _end;
	
    // Default Constructor
    public QQKachoo() {
	_front = null;
	_end = null;
    }
	
    // Check if empty
    public boolean isEmpty() {
	if (_front == null)
	    return true;
	return false;
    }
    
    // Add the the front
    public void addFirst (T x) {
	if (_front == null) {
	    DLLNode<T> node = new DLLNode(x, null);
	    _front = node;
	    _end = node;
	}
	else {
	    DLLNode<T> node = new DLLNode(x, _front);
	    _front.setPrev(node);
	    _front = node;
	}
    }
    
    // Add to the end
    public void addLast (T x) {
	if (_front == null) {
	    DLLNode<T> node = new DLLNode(x, null);
	    _front = node;
	    _end = node;
	}
	else {
	    DLLNode<T> node = new DLLNode(x, null);
	    _end.setNext(node);
	    node.setPrev(_end);
	    _end = node;
	}
    }
	
    // 
    public boolean offerFirst (T x) {
	return false;
    }
    
    // 
    public boolean offerLast (T x) {
	return false;	
    }
	
    // Remove Front
    public T removeFirst() {
	if (isEmpty())
	    return null;
	T temp = (T) peekFirst();
	_front = _front.getNext();
	_front.setPrev(null);
	return temp;
    }

    // Remove Last
    public T removeLast() {
	if (isEmpty())
	    return null;
	T temp =  (T) peekLast();
	if (_front.equals(_end))
	    _front = _end = null;
	else {
	    _end = _end.getPrev();
	    _end.setNext(new DLLNode(null, null));
	}
	return temp;
    }

    // 
    public T pollFirst() {
		
    }
	
    // 
    public T pollLast() {
		
    }

    // 
    public T getFirst() {
		
    }

    // 
    public T getLast() {
		
    }

    // Look At First
    public T peekFirst() {
	if (!isEmpty())
	    return (T) _front.toString();
	return null;
    }

    // Look At Last
    public T peekLast() {
	if (!isEmpty())
	    return (T) _end.toString();
	return null;
    }
	
    // Main Method
    public static void main (String[] args) {
		
    } // end main
	
} // end class

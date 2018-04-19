public class QQKachoo<T> implements Deque<T> {
    // Instance Variables
    private DLLNode<D> _front, _end;
    private int _size, _maxSize;
    	
    // Default Constructor
    public QQKachoo() {
	_front = null;
	_end = null;
	_size = 0;
    }

    // Overloaded Constructor for Limited Capacity Deque
    public QQKachoo (int max) {
	this();
	_maxSize = max;
    }
	
    // Check If Empty
    public boolean isEmpty() {
        return _size == 0;
    }
    
    // Add Front
    public void addFirst (T x) {
	if (_size == _maxSize)
	    throw new IllegalStateException();
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
	_size++;
    }
	
    // Add End
    public void addLast (T x) {
	if (_size == _maxSize){
	    throw new IllegalStateException();
	}
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
	
    // Remove and return the first element
    public boolean offerFirst (T x) {
	return false;
    }
    
    // Remove and return the last element
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

    // return 
    public T pollFirst() {
		
    }
	
    // 
    public T pollLast() {
		
    }

    // return first element
    public T getFirst() {
		
    }

    // return last element
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

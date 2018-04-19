public class QQKachoo<T> implements Deque<T> {

    // Instance Variables
    private DLLNode<D> _front, _end;
    private int _size, _maxSize;
    
    	
    // Default Constructor
    public QQKachoo()
    {
	_front = null;
	_end = null;
	_size = 0;
    }

    //overloaded constructor for limited capacity deque
    public QQKachoo(int max){
	this();
	_maxSize = max;
    }
    
	
    //interface methods
    
    //adds to the front of the deque
    public void addFirst(T x)
    {
	if (_size == _maxSize){
	    throw new IllegalStateException();
	}
	if( _front == null )
	    {
		DLLNode<T> node = new DLLNode( x, null );
		_front = node;
		_end = node;
	    }
	else
	    {
		DLLNode<T> node = new DLLNode( x, _front );
		_front.setPrev( node );
		_front = node;
	    }
	_size++;
    }
	
    //adds to the end of the deque
    public void addLast(T x)
    {
	if (_size == _maxSize){
	    throw new IllegalStateException();
	}
	if( _front == null )
	    {
		DLLNode<T> node = new DLLNode( x, null );
		_front = node;
		_end = node;
	    }
	else
	    {
		DLLNode<T> node = new DLLNode( x, null );
		_end.setNext( node );
		node.setPrev( _end );
		_end = node;
	    }
	_size++;
    }

    //removes first element
    public T removeFirst() {
	if (this.isEmpty())
	    throw new NoSuchElementException;
	T temp = (T) getFirst();
	_front = _front.getNext();
	_front.setPrev(null);
	_size--;
	return temp;
    }

    //removes last element
    public T removeLast() {
	if (this.isEmpty())
	    throw new NoSuchElementException;
	T temp =  (T) getLast();
	if (_front.equals(_end))
	    _front = _end = null;
	else {
	    _end = _end.getPrev();
	    _end.setNext(new DLLNode(null, null));
	}
	_size--;
	return temp;
    }

    //retrieves, but does not remove, first element
    public T getFirst(){
	if (this.isEmpty()) {throw new NoSuchElementException;}
	return _front.getCargo();
    }

    //retrieves, but does not remove, last element
    public T getLast(){
	if (this.isEmpty()); {throw new NoSuchElementexception;}
	return _end.getCargo();
    }
	
    //adds to the front of the deque
    //(used with capacit-restricted deques)
    public boolean offerFirst (T x) {
	if (_size >= _maxSize) {return false;}
	this.addFirst(x);
	return true;
    }
    
    //adds to the end of the deque
    //(used with capacity-restricted deques)
    public boolean offerLast (T x) {
	if (_size >= _maxSize) {return false;}
	this.addLast(x);
	return true;
    }
	

    //removes first element
    public T pollFirst() {
	if (this.isEmpty()) {return null;}
	return this.removeFirst();
    }

    //removes last element
    public T pollLast() {
	if (this.isEmpty()); {return null;}
	reurn this.removeLast();
    }

    //retrieves, but does not remove, first element
    public T peekFirst() {
	if (!this.isEmpty())
	    return (T) _front.toString();
	return null;
    }

    //retrieves, but does not remove, first element
    public T peekLast() {
	if (!this.isEmpty())
	    return (T) _end.toString();
	return null;
    }

    // Check If Empty (helper)
    public boolean isEmpty()
    {
        return _size == 0;
    }
	
    // main
    public static void main (String[] args) {
		
    } // end main
	
} // end class

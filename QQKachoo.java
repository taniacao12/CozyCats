import java.util.NoSuchElementException;

public class QQKachoo<T> implements Deque<T> {

    // Instance Variables
    private DLLNode<T> _front, _end;
    private int _size, _maxSize;


    // Default Constructor
    public QQKachoo()
    {
	_front = null;
	_end = null;
	_size = 0;
    }

    // Overloaded Constructor for Limited Capacity Deque
    public QQKachoo(int max){
	this();
	_maxSize = max;
    }

	// Overwritten toString
	public String toString() {
		String retStr = "";
		DLLNode<T> iter = _front;
		while( iter != null ) {
			if( iter.getCargo() != null ) {
				retStr += iter.getCargo() + " ";
			}
			iter = iter.getNext();
		}
		return retStr;
	}

  // Accessor for Size
  public int size(){
    return _size;
  }

    // Interface Methods

    // Adds to the Front of the Deque
    public void addFirst(T x)
    {
	try { _size = _maxSize; }
	catch ( IllegalStateException e ) {
		System.out.println( "Error: Exceeding Capacity! " );
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

    // Adds to the End of the Deque
    public void addLast(T x)
    {
	try { _size = _maxSize; }
	catch ( IllegalStateException e ) {
		System.out.println( "Error: Exceeding Capacity! " );
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

    // Removes First Element
    public T removeFirst() {
	try { this.isEmpty(); }
	catch ( NoSuchElementException e ) {
		System.out.println( "Error: No Element Found! " );
	}
	T temp = (T) getFirst();
	_front = _front.getNext();
	_front.setPrev(null);
	_size--;
	return temp;
    }

    // Removes Last Element
    public T removeLast() {
	try { this.isEmpty(); }
	catch ( NoSuchElementException e ) {
		System.out.println( "Error: No Element Found! " );
	}
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

    // Retrieves, but Does not Remove, First Element
    public T getFirst(){
	try { this.isEmpty(); }
	catch ( NoSuchElementException e ) {
		System.out.println( "Error: No Element Found! " );
	}
	return _front.getCargo();
    }

    // Retrieves, but Does not Remove, Last Element
    public T getLast(){
	try { this.isEmpty(); }
	catch ( NoSuchElementException e ) {
		System.out.println( "Error: No Element Found! " );
	}
	return _end.getCargo();
    }

    // Adds to the Front of the Deque
    // (used with capacit-restricted deques)
    public boolean offerFirst (T x) {
	if (_size >= _maxSize) {return false;}
	this.addFirst(x);
	return true;
    }

    // Adds to the End of the Deque
    // (used with capacity-restricted deques)
    public boolean offerLast (T x) {
	if (_size >= _maxSize) {return false;}
	this.addLast(x);
	return true;
    }


    //Removes First Element
    public T pollFirst() {
	if (this.isEmpty()) {return null;}
	return this.removeFirst();
    }

    //Removes Last Element
    public T pollLast() {
	if (this.isEmpty()) {return null;}
	return this.removeLast();
    }

    //Retrieves, but Does not Remove, First Element
    public T peekFirst() {
	if (!this.isEmpty())
	    return (T) _front.toString();
	return null;
    }

    //Retrieves, but Does not Remove, Last element
    public T peekLast() {
	if (!this.isEmpty())
	    return (T) _end.toString();
	return null;
    }

    // Check If Empty (helper)
    public boolean isEmpty()
    {
        return (this.size() == 0);
    }

    // Main Method
    public static void main (String[] args) {
		QQKachoo<String> test = new QQKachoo();
		test.addFirst( "computer" );
		test.offerFirst( "hello" );
		test.addLast( "cozy" );
		test.offerLast( "cats" );
		System.out.println( test );
    } // end main

} // end class

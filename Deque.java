public interface Deque<T>{
    
    //adds to front
    public void addFirst(T x);

    public void addLast(T x);

    public void offerFirst(T x);

    public void offerLast(T x);

    public T removeFirst();

    public T removeLast();

    public T pollFirst();

    public T pollLast();

    public T getFirst();

    public T getLast();

    public T peekFirst();

    public T peekLast();
    
}

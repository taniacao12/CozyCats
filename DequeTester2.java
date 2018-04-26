public class DequeTester2 {

    public static void main( String args[] ) {
	QQKachoo<String> que = new QQKachoo();

	for( int i = 5; i > 0; i-- )
	    que.addFirst( "" + i );

	for( int i = 6; i < 11; i++ )
	    que.addLast( "" + i );

	for( int i = 0; i < 5; i++ ) {
	    System.out.println( que.getFirst() );
	    System.out.println( que.removeFirst() );
	}

	for( int i = 0; i < 5; i++ ) {
	    System.out.println( que.getLast() );
	    System.out.println( que.removeLast() );
	}

	System.out.println( que.isEmpty() );
	    
    }
    
}
    

package singleton;

public class SimpleSingleton {
	
	private static SimpleSingleton foo = new SimpleSingleton();
	
	private SimpleSingleton(){
		if (foo!=null) {
			throw new IllegalStateException("Already Instantiated");
		}
	}
	
	public static SimpleSingleton getInstance(){
		return foo;
	}
	
}

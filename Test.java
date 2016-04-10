package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		SimpleSingleton singleton = SimpleSingleton.getInstance();
		System.out.println(singleton);
		
		Constructor<SimpleSingleton> constructor = SimpleSingleton.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		SimpleSingleton newSingleton = constructor.newInstance();
		System.out.println(newSingleton);
		
	}
}

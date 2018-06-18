/**
 * 
 */
package lab;

/**
 * @author tildev
 * @date 2018. 6. 17.
 */
public class Singleton {
//	private static Singleton singleton;
//	
//	private Singleton() {};
//	
//	public static Singleton getSingleton() {
//		if(singleton==null) {
//			singleton = new Singleton();
//		}
//		return singleton;
//	}
	private Singleton() {}
	
	private static class SingletonHolder {
		public static final Singleton INSTANCE = new Singleton();
	}
	
	public static Singleton getSingleton() {
		return SingletonHolder.INSTANCE;
	}
}

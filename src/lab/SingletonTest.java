/**
 * 
 */
package lab;

/**
 * @author tildev
 * @date 2018. 6. 17.
 */
public class SingletonTest {
	public static void main(String[] args) {
		Singleton s = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		
		System.out.println(s);
		System.out.println(s2);
	
		System.out.println("20180618");
	}
}

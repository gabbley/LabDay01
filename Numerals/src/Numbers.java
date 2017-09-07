import java.util.Scanner;

/**
 * 
 */

/**
 * @author baniquedg
 *
 */
public class Numbers {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		
		int x = keyboard.nextInt();
		int y = keyboard.nextInt();
		
		System.out.printf("Adding %d and %d results in %d\n", x, y, (x+y));
		keyboard.close();
	}

}

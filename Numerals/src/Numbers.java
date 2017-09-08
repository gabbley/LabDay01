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
		System.out.printf("SUM: %d + %d = %d\n", x, y, sum(x,y) +
				"DIFFERENCE: %d - %d = %d\n ", x, y, sum(x,y) +
				"PRODUCT: %d * %d = %d\n ", x, y, sum(x,y) + 
				"QUOTIENT: %d / %d = %d\n ", x, y, sum(x,y) +
				"MODULUS: %d % %d = %d\n ", x, y, sum(x,y)
				);
		keyboard.close();
		
	}
	
	public int sum(int x, int y){
		return x+y;
	}
	
	public int diff(int x, int y){
		return x-y;
	}
	
	public int prod(int x, int y){
		return x*y;
	}
	
	public int quot(int x, int y){
		return x/y;
	}
	
	public int mod(int x, int x){
		return x%y;
	}
	
	

}

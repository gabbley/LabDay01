import java.util.Scanner;

/**
 * 
 */

/**
 * @author MurphyPOne
 * weird issue with the Ant build...
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
				"DIFFERENCE: %d - %d = %d\n ", x, y, diff(x,y) +
				"PRODUCT: %d * %d = %d\n ", x, y, prod(x,y) + 
				"QUOTIENT: %d / %d = %d\n ", x, y, quot(x,y) +
				"MODULUS: %d % %d = %d\n ", x, y, mod(x,y) + 
				"REVMODULUS: %d % %d = %d\n ", x, y, revmod(x,y)	//Added this bad boy to the print statement
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
	
	//Fixed some of the parameters 
	public int mod(int x, int y){
		return x%y;
	}
	
	//New method which really doesn't do much
	public int revmod(int x, int y){
		return y%x;
	}
	
	

}

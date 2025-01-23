package cs101;

/*
 * Final Output should be:
 * 	9 + -3 = 6
 * 	9 * -3 = -27
 * 	9 / -3 = -3
 * 	9 % -3 = 0
 *  
 *  10 + -3 = 7
 * 	10 * -3 = -30
 * 	10 / -3 = -3
 * 	10 % -3 = 1
 * 
 * You should be adding lines of code, NOT deleting or editing existing code
 * 
 */

public class IntOps {

	public static void main(String[] args) {
		int a = 9;
		int b = -3;
		int sum = a + b;
		int prod = a * b;
		int quot = a / b;
		int rem = a % b;

		System.out.println(a + " + " + b + " = " + sum);
		// TODO: print out 3 more lines that describe the operations
		// done to create prod, quot, and rem (like the one above to create add)
		System.out.println(a + " * " + b + " = " + prod);
		System.out.println(a + " / " + b + " = " + quot);
		System.out.println(a + " % " + b + " = " + rem);
		// Break, please leave this in
		System.out.println("");

		// TODO: reassign a to be 10 below (do NOT change it on line 6).
		// Write four more print statements.
		a = 10;
		sum = a + b;
		prod = a * b;
		quot = a / b;
		rem = a % b;

		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " * " + b + " = " + prod);
		System.out.println(a + " / " + b + " = " + quot);
		System.out.println(a + " % " + b + " = " + rem);

	}

}

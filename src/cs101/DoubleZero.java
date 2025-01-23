package cs101;

public class DoubleZero {

	public static void main(String[] args) {
		double zero = 0.0;

		// TODO: what is the type of the expression `zero * 4`?
		// Write it here: double
		System.out.println(zero * 4);
		System.out.println(4 * zero);

		double a = 4.567;

		// TODO: declare a new double `b` and initialize it to `a` divided by `zero`.
		// If you print `b`, what do you think you will get?

		double b = a / zero;

		// TODO: Print `b`.
		System.out.println(b);
		// TODO: Add `b` to a positive constant and print the result.
		System.out.println(b + 5);
		// TODO: Subtract `b` from a positive constant and print the result.

		System.out.println(5 - b);

		// TODO: declare a new double `c` and initialize it to 17.0;
		int c = 17;

		// TODO: uncomment the following lines and run the code
		int sqroot = (int) Math.sqrt(c);
		System.out.println("c is " + c);
		System.out.println("sqroot is " + sqroot);

		// TODO: Change the type of `c` to int and run the code.
		// What prints out? Why?
		// Write your answer here: It fails because you cant covert an interger into a
		// double

		// TODO: Change the type of `c` to int and 17.0 to 17 and run the code.
		// What prints out? Why?
		// Write your answer here: It succeeds and prints " c is 17 " because it is an
		// interger

		// TODO: Change the type of `c` to int and 17.0 to 17 and
		// change the type of `sqroot` to int. You should get an error. Why?
		// Write your answer here: Math.sqrt() returns a double

		// TODO: Hover over the error. You should see a an option to
		// `Add cast to 'int'`. Click this. Run the code.
		// What prints out? What do you think is happening?
		// Write your answer here: Casting out the decmial point

	}

}

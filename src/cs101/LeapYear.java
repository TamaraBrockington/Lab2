package cs101;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2000;
		boolean isLeapYear;

		// divisible by 4
		isLeapYear = (year % 4 == 0);

		// divisible by 4 and not 100
		isLeapYear = isLeapYear && (year % 100 != 0);

		// divisible by 4 and not 100 unless divisible by 400
		isLeapYear = isLeapYear || (year % 400 == 0);

		System.out.println(isLeapYear);

		// TODO: declare a boolean variable called `isNotLeapYear`
		boolean isNotLeapYear;
		// initialize `isNotLeapYear` to determine when a year is not a leap year
		isNotLeapYear = !isLeapYear;
		// you can do this any way you would like, but you MUST use an EXPRESSION (or
		// expressions)
		// (not just set it to the literal `true` or `false`)
		// print out `isNotLeapYear`

		// TODO: test your expression by changing 2025 to 2002 (false), 2023 (false),
		// 2000 (true), and your birth year

	}

}

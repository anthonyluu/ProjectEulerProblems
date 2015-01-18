import java.util.*;

/*
Sum square difference
Problem 6
The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

public class Main {
	public static void main(String[] args) {
		System.out.println("This will find the difference between the sum of squares and the square of sums");
		System.out.println("Enter a max value");
		int number = new Scanner(System.in).nextInt();

		int sumOfSquaresValue = sumOfSquares(number);
		int squareOfSumsValue = squareOfSums(number);
		int difference = diff(sumOfSquaresValue, squareOfSumsValue);
		System.out.println("The absolute difference is: " + difference);

	}

	public static int sumOfSquares(int number) {
		int sum = 0;
		for(int i = 1; i <= number; i ++) {
			sum += i*i;
		}
		return sum;
	}

	public static int squareOfSums(int number) {
		int sum = 0;
		for(int i = 1; i <= number; i ++) {
			sum += i;
		}
		return sum*sum;
	}

	public static int diff(int first, int second) {
		return Math.abs(first - second);
	}
}
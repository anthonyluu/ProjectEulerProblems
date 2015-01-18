import java.util.*;

/*
10001st prime
Problem 7
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/

public class Main {
	public static void main(String[] args) {
		System.out.println("Input the number of primes you want to count up to");
		int number = new Scanner(System.in).nextInt();

		int primeAtNumber = nthPrimeNumber(number);
		System.out.println("The " + number + "'th number is " + primeAtNumber);

	}

	public static int nthPrimeNumber(int number) {
		int count = 0;
		int i = 1;
		int currentPrimeNumber = 1;

		do {
			if(isPrime(i)) {
				// System.out.println(i);
				count++;
			}
			currentPrimeNumber = i;
			i++;
		}
		while(count != number);
		return currentPrimeNumber;
	}

	public static boolean isPrime(int number) {
		if(number == 0 || number == 1) {
			return false;
		}
		for(int i = 2; i <= number/2; i ++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
import java.util.*;

/*
Summation of primes
Problem 10
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.

Ans: 142913828922
*/

public class Main {
	public static void main(String[] args) {
		System.out.println("We're going to count the sum of all the primes below a number you put in:");
		long number = new Scanner(System.in).nextLong();
		long sum = sumPrimes(number);
		System.out.println("The sum is: " + sum);

	}

	public static long sumPrimes(long numberOfPrimes) {
		long sum = 2;
		for(long i = 3; i < numberOfPrimes; i += 2) {
			if(isPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}

	public static boolean isPrime(long num) {
		if(num == 0 || num == 1) {
			return false;
		}
		if(num == 2) {
			return true;
		}
		long end = (long) Math.sqrt(num);
		for(long i = 3; i <= end; i ++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
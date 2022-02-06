package getttingStarted;

import java.util.Scanner;

/*
 Prime Factorisation Of A Number
Easy

  1. You are required to display the prime factorization of a number.
    2. Take as input a number n.
    3. Print all its prime factors from smallest to largest.
                               
                               

Constraints
2 &lt;= n &lt; 10 ^ 9

Format
Input
n, an integer

Output
p1  p2  p3  p4.. all prime factors of n

Example
Sample Input

1440

Sample Output
2 2 2 2 2 3 3 5


 */
public class PrimeFactorization {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int div = 2; div < n; div++) {
			while (n % div == 0) {
				n = n / div;
				System.out.print(div + " ");
			}
		}
		// If after division remaining n value is not 1, it means it last prime factor
		// for ex - 46 prime factors are 2 , 23 this 23 is last prime
		if (n != 1) {
			System.out.println(n);
		}

	}
}

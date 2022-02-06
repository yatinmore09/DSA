package getttingStarted;

import java.util.Scanner;

public class GcdLcm {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int tmp1 = num1;
		int tmp2 = num2;
		int rem;

		while (num1 > 0) {
			rem = num2 % num1;
			num2 = num1;
			num1 = rem;
			
		}
		int gcd = num2;
		int lcm = (tmp1 * tmp2) / gcd;
		
		System.out.println("GCD=" + gcd+ " LCM "+ lcm);
	}

}

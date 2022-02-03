package getttingStarted;

import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int digit ;
		while (n != 0) {
			digit = n % 10;
			System.out.print(digit);
			n = n / 10;
		}
	}
}
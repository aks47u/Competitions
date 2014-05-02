package MiNDS_Programathon_Practice_2014;

import java.util.Scanner;

public class Q4_Fizz_Buzz_Woof {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		String result = "";

		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
				result += "FizzBuzzWoof, ";
			} else if (i % 3 == 0 && i % 5 == 0) {
				result += "FizzBuzz, ";
			} else if (i % 3 == 0 && i % 7 == 0) {
				result += "FizzWoof, ";
			} else if (i % 5 == 0 && i % 7 == 0) {
				result += "BuzzWoof, ";
			} else if (i % 3 == 0) {
				result += "Fizz, ";
			} else if (i % 5 == 0) {
				result += "Buzz, ";
			} else if (i % 7 == 0) {
				result += "Woof, ";
			} else {
				result += i + ", ";
			}
		}
		System.out.println(result.substring(0, result.length() - 2));
	}
}

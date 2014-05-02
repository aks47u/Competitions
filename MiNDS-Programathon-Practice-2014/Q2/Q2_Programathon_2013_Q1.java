package MiNDS_Programathon_Practice_2014;

import java.util.Scanner;

public class Q02_Programathon_2013_Q1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i = scn.nextInt();

		String results = "";
		long a;

		a = i;
		while (a != 1) {
			a = ((a & 1) == 1) ? (3 * a + 1) : (a >> 1);
			results += a + " ";
		}
		
		System.out.println(results.trim());
	}
}

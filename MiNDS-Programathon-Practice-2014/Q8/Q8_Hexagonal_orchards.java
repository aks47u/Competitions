package General;

import java.util.Scanner;

public class Q8_Hexagonal_orchards {
	private static int len;
	private static int[] phi;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		len = scn.nextInt();
		phi_sieve();
		long sum = 0;

		for (int i = 1; i <= len; i++) {
			sum += i - phi[i];
		}

		long result = sum * 6;
		System.out.println(result);
	}

	private static void phi_sieve() {
		phi = new int[len + 1];

		for (int i = 0; i <= len; i++) {
			phi[i] = i;
		}

		for (int i = 2; i <= len; i++) {
			if (phi[i] == i) {
				phi[i] = i - 1;

				for (int j = i + i; j <= len; j += i) {
					phi[j] /= i;
					phi[j] *= i - 1;
				}
			}
		}
	}
}

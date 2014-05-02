package MiNDS_Programathon_Practice_2014;

public class Q7_Coin_partitions {
	private static long[] pp = new long[60001];
	private static long mln = 1000000;

	public static void main(String[] args) {
		for (int k = 0; k < pp.length; k++) {
			pp[k] = -1;
		}

		int result = 1;

		while (true) {
			calc_p(result);

			if (pp[result] == 0) {
				break;
			}

			result++;
		}

		System.out.println(result);
	}

	private static long calc_p(long nn) {
		if (nn < 0) {
			return 0;
		}

		if (nn == 0) {
			return pp[0] = 1;
		}

		if (nn == 1) {
			return pp[1] = 1;
		}

		if (nn == 2) {
			return pp[2] = 2;
		}

		int n = (int) nn;

		if (pp[n] != -1) {
			return pp[n];
		}

		long sign = 1, sum = 0;
		long d1 = -1, d2 = -1;

		for (long k = 1; k <= n; k++) {
			sign = ((k & 1) == 1) ? 1 : -1;
			d1 = k * (3 * k - 1) / 2;
			d2 = k * (3 * k + 1) / 2;

			if (d1 == n) {
				sum += sign * 1;
				sum %= mln;
			} else if (d1 < n) {
				sum += sign * (pp[(int) (n - d1)]);
				sum %= mln;
			}

			if (d2 == n) {
				sum += sign * 1;
				sum %= mln;
			} else if (d2 < n) {
				sum += sign * (pp[(int) (n - d2)]);
				sum %= mln;
			}

			while (sum < 0) {
				sum += mln;
			}

			if (d1 > n) {
				break;
			}
		}

		pp[n] = sum;
		return pp[n];
	}
}

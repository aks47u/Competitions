package MiNDS_Programathon_Practice_2014;

import java.util.Scanner;

public class Q3_The_Proclaimers_Im_Gonna_Be_500_Miles {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double lat = scn.nextDouble();
		double lng = scn.nextDouble();

		System.out.println((int) getDistance(53.385, -6.602, lat, lng));
	}

	private static double getDistance(double lat1, double lon1, double lat2,
			double lon2) {
		final double RADIUS = 6378.1;
		double dLat = Math.toRadians(lat2 - lat1);
		double dLon = Math.toRadians(lon2 - lon1);
		double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
				+ Math.cos(Math.toRadians(lat1))
				* Math.cos(Math.toRadians(lat2)) * Math.sin(dLon / 2)
				* Math.sin(dLon / 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double d = RADIUS * c;
		return d;
	}
}

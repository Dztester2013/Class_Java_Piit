package com.onlineclass;

public class kk {

	public static void main(String[] args) {
		int m;
		int p = 10;
		int n = 10;

		boolean test =false;

		for(m = n/2; m < n ; ++m) {
			if (test && ((m+n) % 2 == 0)) {
				System.out.print( m + " ");
			}
			else {
				System.out.print( (m + 1) + " ");
				test = !test;
			}
		}

		if (m > p) {
			System.out.print( (m - p) + " ");
		}
		else {
			System.out.print( (m + p) + " ");
		}
	}

}

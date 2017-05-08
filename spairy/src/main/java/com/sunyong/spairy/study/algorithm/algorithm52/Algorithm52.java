package com.sunyong.spairy.study.algorithm.algorithm52;

import java.util.Scanner;

public class Algorithm52 {
	
	public static void main(String[] args) {
		
		int n, x, y, xmin = 0, xmax = 0, ymin = 0, ymax = 0, a;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			if (i == 0) {
				xmin = x; 
				xmax = x; 
				ymin = y; 
				ymax = y;
			} else {
				if (x < xmin) {
					xmin = x;
				}
				if (x > xmax) {
					xmax = x;
				}
				if (y < ymin) {
					ymin = y;
				}
				if (y > ymax) {
					ymax = y;
				}
			}
		}
		
		a = Math.max(xmax - xmin, ymax - ymin);
		
		System.out.println(a * a);
		
	}
}

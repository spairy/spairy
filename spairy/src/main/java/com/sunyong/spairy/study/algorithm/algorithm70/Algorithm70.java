package com.sunyong.spairy.study.algorithm.algorithm70;

import java.util.Scanner;

public class Algorithm70 {

	public static void main(String[] args) {
		int totleNumber = 0;
		int avgAge = 0;
		double rate = 0d;
		int year = 0;
		final int newAge = 21;
		
		String[] data = null;
		
		if (null == args || args.length < 4) {
			data = new String[4];
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			data[0] = sc.next();
			data[1] = sc.next();
			data[2] = sc.next();
			data[3] = sc.next();
		} else {
			data = args;
		}
		
		try {
			totleNumber = Integer.parseInt(data[0]);
			avgAge = Integer.parseInt(data[1]);
			rate = Double.parseDouble(data[2]);
			year = Integer.parseInt(data[3]);
		} catch (Exception e) {
			System.out.println("输入信息有误：" + e);
			return;
		}
		
		if (rate <= 0d || rate >= 1) {
			System.out.println("输入Rate信息有误.");
			return;
		}
		
		int rateNumber = (int)Math.ceil(totleNumber * rate);
		double totleAge = totleNumber * avgAge;
		
		for (int i = 0; i <= year; i++) {
			totleAge = totleAge + rateNumber * newAge - totleAge * rate;
		}
		
		System.out.print("输出第" + year + "年后的平均年龄：");
		System.out.println((int)Math.ceil(totleAge / totleNumber));
		System.out.println(totleAge / totleNumber);
	}
	
}

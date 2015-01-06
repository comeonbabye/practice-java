package com.util;

import java.util.Random;

public class RandomUtil {
	
	public static int[] getRandomInt(int size) {
		
		return getRandomInt(size, 100);
	}
	
	public static int[] getRandomInt(int size, int seed) {
		Random r = new Random();
		int[] a = new int[size];
		
		for(int i=0; i<a.length; i++) {
			a[i] = r.nextInt(seed);
		}
		
		return a;
	}
}

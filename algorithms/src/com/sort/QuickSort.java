package com.sort;

import java.util.Random;

public class QuickSort {

	private static int count1 = 0;
	private static int count2 = 0;

	public static void main(String[] args) {

		System.out.println("==============第一种排序方式==============");
		System.out.println("排序前...........");
		Random r = new Random();
		int[] a = new int[20];
		for(int i=0; i<a.length; i++) {
			a[i] = r.nextInt(100);
			System.out.print(a[i] + "\t");
		}

		quickSort(a, 0, a.length - 1);

		System.out.println("\n比较次数：" + count1);
		System.out.println("交换次数：" + count2);

		System.out.println("\n排序后...........");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	public static void quickSort(int[] a, int l, int r) {

		if(l >= r) return;

		int i = l;	//从左到右的游标
		int j = r + 1;//从右到左的游标
		int t, temp = a[l];//以a[l]为支点

		while(true) {
			while(a[++i] < temp && i < r) {
				count1++; //从左边找>=temp的元素
			}
			while(a[--j] > temp && j > l) {
				count1++;//从右边找<=temp的元素
			}

			if(i >= j) break; //如果未找到交换对，退出循环

			t = a[i];
			a[i] = a[j];
			a[j] = t;
			count2+=3;
		}

		//将支点a[l]与a[j]交换
		a[l] = a[j];
		a[j] = temp;
		count2+=2;

		quickSort(a, l, j - 1); //左段快速排序
		quickSort(a, j + 1, r); //右段快速排序

	}
}

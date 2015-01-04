package com.sort;

import java.util.Random;

/**
 * 选择排序<br/>
 * <li>首先找出最大的元素，将其与a[n-1]位置交换</li>
 * <li>然后在余下的n-1个元素中寻找最大的元素，将其与a[n-2]位置交换</li>
 * <li>如此进行下去直至n个元素排序完毕</li>
 *
 * 比较次数多，交换次数少
 * @author tony
 */
public class SelectSort {

	public static void main(String[] args) {

		System.out.println("排序前...........");
		Random r = new Random();
		int[] a = new int[20];
		for(int i=0; i<a.length; i++) {
			a[i] = r.nextInt(100);
			System.out.print(a[i] + "\t");
		}

		sort1(a);

		System.out.println("\n排序后...........");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	public static void sort1(int[] a) {

		int i,j,k,t;
		int count1 = 0, count2 = 0;

		for(i=0; i<a.length-1; i++) {
			for(k=i,j=i+1; j<a.length; j++) {
				if(a[k] > a[j]) {
					k = j;

				}
				count1++;
			}

			if(k != j) {
				t = a[k];
				a[k] = a[i];
				a[i] = t;
				count2+=3;
			}
		}

		System.out.println("\n比较次数：" + count1);
		System.out.println("交换次数：" + count2);
	}

}

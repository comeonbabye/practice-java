package com.sort;

import java.util.Random;

/**
 * 插入排序<br/>
 * <li>每步将一个待排序元素，插入到前面已经排好序的一组元素的适当位置上，直到全部元素插入为止</li>
 * <ul>
 * <li>从第一个元素开始，该元素可以认为已经被排序</li>
 * <li>取出下一个元素，在已经排序的元素序列中从后向前扫描</li>
 * <li>如果该元素（已排序）大于新元素，将该元素移到下一位置</li>
 * <li>重复步骤3，直到找到已排序的元素小于或者等于新元素的位置</li>
 * <li>将新元素插入到该位置中</li>
 * <li>重复步骤2</li>
 * 直接插入排序是稳定的排序算法，也是三种简单排序算法最快的
 * @author tony
 */
public class InsertSort {

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

		int i,j,t;
		int count1 = 0, count2 = 0;

		for(i=1; i<a.length; i++) {
			t = a[i];
			for(j =i-1; j>=0&&a[j]>t; j--) {//因为前面的已经排好序，依次比较，大于它的依次完后移动一位，最后插入到合适的位置
				a[j+1] = a[j];
				count2++;
				count1++;
			}
			a[j+1] = t;
			count2++;
		}

		System.out.println("\n比较次数：" + count1);
		System.out.println("交换次数：" + count2);
	}

}

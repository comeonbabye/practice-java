package com.sort;
import java.util.Random;


/**
 *冒泡排序：时间复杂度O(n2)<br/>
 * <li>比较相邻的元素。如果第一个比第二个大，就交换他们两个。</li>
 * <li>对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。</li>
 * <li>针对所有的元素重复以上的步骤，除了最后一个。</li>
 * <li>持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。</li>
 *
 * 比较次数多，交换次数也多
 * @author tony
 *
 */
public class Bubbling {


	public static void main(String[] args) {

		System.out.println("==============第一种排序方式==============");
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

		int temp, count1 = 0, count2 = 0;
		for(int i=0; i<a.length - 1; i++) {
			for(int j= i + 1; j<a.length; j++) {
				if(a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					count2+=3;
				}
				count1++;
			}
		}

		System.out.println("\n比较次数：" + count1);
		System.out.println("交换次数：" + count2);

	}

}

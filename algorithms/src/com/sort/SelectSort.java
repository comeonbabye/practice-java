package com.sort;

import java.util.Random;

/**
 * ѡ������<br/>
 * <li>�����ҳ�����Ԫ�أ�������a[n-1]λ�ý���</li>
 * <li>Ȼ�������µ�n-1��Ԫ����Ѱ������Ԫ�أ�������a[n-2]λ�ý���</li>
 * <li>��˽�����ȥֱ��n��Ԫ���������</li>
 *
 * �Ƚϴ����࣬����������
 * @author tony
 */
public class SelectSort {

	public static void main(String[] args) {

		System.out.println("����ǰ...........");
		Random r = new Random();
		int[] a = new int[20];
		for(int i=0; i<a.length; i++) {
			a[i] = r.nextInt(100);
			System.out.print(a[i] + "\t");
		}

		sort1(a);

		System.out.println("\n�����...........");
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

		System.out.println("\n�Ƚϴ�����" + count1);
		System.out.println("����������" + count2);
	}

}

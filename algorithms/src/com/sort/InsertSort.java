package com.sort;

import java.util.Random;

/**
 * ��������<br/>
 * <li>ÿ����һ��������Ԫ�أ����뵽ǰ���Ѿ��ź����һ��Ԫ�ص��ʵ�λ���ϣ�ֱ��ȫ��Ԫ�ز���Ϊֹ</li>
 * <ul>
 * <li>�ӵ�һ��Ԫ�ؿ�ʼ����Ԫ�ؿ�����Ϊ�Ѿ�������</li>
 * <li>ȡ����һ��Ԫ�أ����Ѿ������Ԫ�������дӺ���ǰɨ��</li>
 * <li>�����Ԫ�أ������򣩴�����Ԫ�أ�����Ԫ���Ƶ���һλ��</li>
 * <li>�ظ�����3��ֱ���ҵ��������Ԫ��С�ڻ��ߵ�����Ԫ�ص�λ��</li>
 * <li>����Ԫ�ز��뵽��λ����</li>
 * <li>�ظ�����2</li>
 * ֱ�Ӳ����������ȶ��������㷨��Ҳ�����ּ������㷨����
 * @author tony
 */
public class InsertSort {

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

		int i,j,t;
		int count1 = 0, count2 = 0;

		for(i=1; i<a.length; i++) {
			t = a[i];
			for(j =i-1; j>=0&&a[j]>t; j--) {//��Ϊǰ����Ѿ��ź������αȽϣ�����������������ƶ�һλ�������뵽���ʵ�λ��
				a[j+1] = a[j];
				count2++;
				count1++;
			}
			a[j+1] = t;
			count2++;
		}

		System.out.println("\n�Ƚϴ�����" + count1);
		System.out.println("����������" + count2);
	}

}

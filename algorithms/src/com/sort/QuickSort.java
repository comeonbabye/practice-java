package com.sort;

import java.util.Random;

public class QuickSort {

	private static int count1 = 0;
	private static int count2 = 0;

	public static void main(String[] args) {

		System.out.println("==============��һ������ʽ==============");
		System.out.println("����ǰ...........");
		Random r = new Random();
		int[] a = new int[20];
		for(int i=0; i<a.length; i++) {
			a[i] = r.nextInt(100);
			System.out.print(a[i] + "\t");
		}

		quickSort(a, 0, a.length - 1);

		System.out.println("\n�Ƚϴ�����" + count1);
		System.out.println("����������" + count2);

		System.out.println("\n�����...........");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	public static void quickSort(int[] a, int l, int r) {

		if(l >= r) return;

		int i = l;	//�����ҵ��α�
		int j = r + 1;//���ҵ�����α�
		int t, temp = a[l];//��a[l]Ϊ֧��

		while(true) {
			while(a[++i] < temp && i < r) {
				count1++; //�������>=temp��Ԫ��
			}
			while(a[--j] > temp && j > l) {
				count1++;//���ұ���<=temp��Ԫ��
			}

			if(i >= j) break; //���δ�ҵ������ԣ��˳�ѭ��

			t = a[i];
			a[i] = a[j];
			a[j] = t;
			count2+=3;
		}

		//��֧��a[l]��a[j]����
		a[l] = a[j];
		a[j] = temp;
		count2+=2;

		quickSort(a, l, j - 1); //��ο�������
		quickSort(a, j + 1, r); //�Ҷο�������

	}
}

package com.sort;
import java.util.Random;


/**
 *ð������ʱ�临�Ӷ�O(n2)<br/>
 * <li>�Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������</li>
 * <li>��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ�����һ�㣬����Ԫ��Ӧ�û�����������</li>
 * <li>������е�Ԫ���ظ����ϵĲ��裬�������һ����</li>
 * <li>����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚϡ�</li>
 *
 * �Ƚϴ����࣬��������Ҳ��
 * @author tony
 *
 */
public class Bubbling {


	public static void main(String[] args) {

		System.out.println("==============��һ������ʽ==============");
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

		System.out.println("\n�Ƚϴ�����" + count1);
		System.out.println("����������" + count2);

	}

}

package com.design_pattern;

/**
 * ����ģʽһ
 * ��������Ƚϰ�ȫ�ͼ򵥣����ǻ���һ��ʼ�͵��ù��캯����ʼ��
 * @author tony
 *
 */
public class Singleton {

	private static final Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}
}

package com.design_pattern;

/**
 * ����ģʽ��
 * �ڵ�һ�ε��õ�ʱ��ų�ʼ�������Ƕ��߳����а�ȫ���⣬
 * synchronized�Է�������ͬ��������˰�ȫ���⣬����ÿ�ζ����������ں����Ĳ��������£������������
 * @author tony
 *
 */
public class Singleton4 {

	private static Singleton4 instance = null;

	private Singleton4() {
	}

	public static synchronized Singleton4 getInstance() {

		if(instance == null) {
			instance = new Singleton4();
		}
		return instance;
	}
}

package com.design_pattern;

/**
 * ����ģʽ��
 * ͨ���ڲ����ڵ�һ�ε��õ�ʱ�����SingletonContainer��̬�࣬��̬��ʼ��instance��
 * �����߳�֮������⣬��������������ģʽ������һ��ʼ�ͳ�ʼ�����ù��캯��
 * @author tony
 *
 */
public class Singleton3 {

	private Singleton3() {

	}

	public static Singleton3 getInstance() {

		return SingletonContainer.instance;
	}

	private static class SingletonContainer {

		private static Singleton3 instance = new Singleton3();
	}
}

package com.design_pattern;

/**
 * ����ģʽ��
 * �ӳټ���ģʽ����һ�ε��õ�ʱ��ų�ʼ����
 * ����ģʽ�����ڷ���������ͬ��������������ߣ�
 * ����JVM���ԣ���ִ�е���һ����Javaָ���Javaָ���д�������͸�ֵ�����Ƿֿ����еģ�Ҳ����˵instance = new Singleton();����Ƿ�����ִ�еġ�
 * ����JVM������֤�������������Ⱥ�˳��Ҳ����˵�п���JVM��Ϊ�µ�Singletonʵ������ռ䣬Ȼ��ֱ�Ӹ�ֵ��instance��Ա��Ȼ����ȥ��ʼ�����Singletonʵ����������ʹ�����Ϊ�˿���
 * ��������ٺ�������������¿��ܻᷢ�ʹ���һ�㲻�ᷢ�ʹ���
 * @author tony
 *
 */
public class Singleton2 {

	private static Singleton2 instance = null;

	private Singleton2() {
	}

	public static Singleton2 getInstance() {

		if(instance == null) {
			synchronized(Singleton2.class) {
				if(instance == null) {
					instance = new Singleton2();
				}
			}
		}
		return instance;
	}
}

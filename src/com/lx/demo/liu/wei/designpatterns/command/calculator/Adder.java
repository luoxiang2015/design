//designpatterns.command.calculator.Adder.java
package com.lx.demo.liu.wei.designpatterns.command.calculator;

//�ӷ��ࣺ���������
public class Adder {
	private int num=0; //�����ʼֵΪ0
	
  //�ӷ�������ÿ�ν������ֵ��num���ӷ����㣬�ٽ��������
	public int add(int value) {
		num += value;
		return num;
	}
}
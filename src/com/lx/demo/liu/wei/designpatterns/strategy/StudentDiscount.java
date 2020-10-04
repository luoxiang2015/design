//designpatterns.strategy.StudentDiscount.java
package com.lx.demo.liu.wei.designpatterns.strategy;

//ѧ��Ʊ�ۿ��ࣺ���������
public class StudentDiscount implements Discount {
	private final double DISCOUNT = 0.8;
	public double calculate(double price) {
		System.out.println("ѧ��Ʊ��");
		return price * DISCOUNT;
	}
}
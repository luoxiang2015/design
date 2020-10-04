//designpatterns.strategy.ChildrenDiscount.java
package com.lx.demo.liu.wei.designpatterns.strategy;

//��ͯƱ�ۿ��ࣺ���������
public class ChildrenDiscount implements Discount {
	private final double DISCOUNT = 10;
	public double calculate(double price) {
		System.out.println("��ͯƱ��");
		if(price>=20) {
			return price - DISCOUNT;
		}
		else {
			return price;
		}
	}
} 
//designpatterns.simplefactory.PieChart.java
package com.lx.demo.liu.wei.designpatterns.simplefactory;

//��״ͼ�࣬�䵱�����Ʒ��
public class PieChart implements Chart {
	public PieChart() {
		System.out.println("������״ͼ��");
	}
	
	public void display() {
		System.out.println("��ʾ��״ͼ��");
	}
}
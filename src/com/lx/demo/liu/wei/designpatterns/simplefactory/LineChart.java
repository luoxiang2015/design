//designpatterns.simplefactory.LineChart.java
package com.lx.demo.liu.wei.designpatterns.simplefactory;

//����ͼ�࣬�䵱�����Ʒ��
public class LineChart implements Chart {
	public LineChart() {
		System.out.println("��������ͼ��");
	}
	
	public void display() {
		System.out.println("��ʾ����ͼ��");
	}
}
//designpatterns.simplefactory.HistogramChart.java
package com.lx.demo.liu.wei.designpatterns.simplefactory;

//��״ͼ�࣬�䵱�����Ʒ��
public class HistogramChart implements Chart {
	public HistogramChart() {
		System.out.println("������״ͼ��");
	}
	
	public void display() {
		System.out.println("��ʾ��״ͼ��");
	}
}
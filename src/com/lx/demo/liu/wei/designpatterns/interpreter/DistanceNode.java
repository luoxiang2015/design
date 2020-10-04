//designpatterns.interpreter.DistanceNode.java
package com.lx.demo.liu.wei.designpatterns.interpreter;

//������ͣ��ս�����ʽ
public class DistanceNode extends AbstractNode {
	private String distance;
	
	public DistanceNode(String distance) {
		this.distance = distance;
	}
	
	//������ʽ�Ľ��Ͳ���
	public String interpret() {
		return this.distance;
	}	
}
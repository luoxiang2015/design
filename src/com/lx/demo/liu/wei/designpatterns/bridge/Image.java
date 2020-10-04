//designpatterns.bridge.Image.java
package com.lx.demo.liu.wei.designpatterns.bridge;

//����ͼ���࣬�䵱������
public abstract class Image {
	protected ImageImp imp;

    //ע��ʵ����ӿڶ���
	public void setImageImp(ImageImp imp) {
		this.imp = imp;
	} 

	public abstract void parseFile(String fileName);
}
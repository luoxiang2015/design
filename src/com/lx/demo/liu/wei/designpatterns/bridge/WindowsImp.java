//designpatterns.bridge.WindowsImp.java
package com.lx.demo.liu.wei.designpatterns.bridge;

//Windows����ϵͳʵ���࣬�䵱����ʵ����
public class WindowsImp implements ImageImp {
  public void doPaint(Matrix m) {
  	//����Windowsϵͳ�Ļ��ƺ����������ؾ���
  	System.out.print("��Windows����ϵͳ����ʾͼ��");
  }
}
//designpatterns.bridge.UnixImp.java
package com.lx.demo.liu.wei.designpatterns.bridge;

//Unix����ϵͳʵ���࣬�䵱����ʵ����
public class UnixImp implements ImageImp {
  public void doPaint(Matrix m) {
  	//����Unixϵͳ�Ļ��ƺ����������ؾ���
  	System.out.print("��Unix����ϵͳ����ʾͼ��");
  }
}
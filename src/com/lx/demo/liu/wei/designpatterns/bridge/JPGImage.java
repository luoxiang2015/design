//designpatterns.bridge.JPGImage.java
package com.lx.demo.liu.wei.designpatterns.bridge;

//JPG��ʽͼ���࣬�䵱���������
public class JPGImage extends Image {
	public void parseFile(String fileName) {
      //ģ�����JPG�ļ������һ�����ؾ������m;
      Matrix m = new Matrix(); 
      imp.doPaint(m);
      System.out.println(fileName + "����ʽΪJPG��");
  }
}

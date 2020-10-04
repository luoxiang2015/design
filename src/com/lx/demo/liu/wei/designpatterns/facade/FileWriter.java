//designpatterns.facade.FileWriter.java
package com.lx.demo.liu.wei.designpatterns.facade;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//�ļ������ࣺ��ϵͳ��
public class FileWriter {
	public void write(String encryptStr,String fileNameDes) {
		System.out.println("�������ģ�д���ļ���");
		try{
   		FileOutputStream outFS = new FileOutputStream(fileNameDes);
    		outFS.write(encryptStr.getBytes());
    		outFS.close();
		}	
		catch(FileNotFoundException e) {
			System.out.println("�ļ������ڣ�");
		}
		catch(IOException e) {
			System.out.println("�ļ���������");
		}		
	}
}
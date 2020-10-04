//designpatterns.factorymethod.FileLoggerFactory.java
package com.lx.demo.liu.wei.designpatterns.factorymethod;

//�ļ���־��¼�������࣬�䵱���幤����ɫ
public class FileLoggerFactory implements LoggerFactory {
	public Logger createLogger() {
        //�����ļ���־��¼������
		Logger logger = new FileLogger(); 
		//�����ļ�������ʡ��
		return logger;
	}	
}
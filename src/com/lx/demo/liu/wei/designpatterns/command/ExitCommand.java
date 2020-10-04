//designpatterns.command.ExitCommand.java
package com.lx.demo.liu.wei.designpatterns.command;

public class ExitCommand extends Command{
	private SystemExitClass seObj;  //ά�ֶ���������ߵ�����
	
	public ExitCommand() {
		seObj = new SystemExitClass();
	}
	
	//����ִ�з�������������������ߵ�ҵ�񷽷�
	public void execute() {
		seObj.exit();
	}
}
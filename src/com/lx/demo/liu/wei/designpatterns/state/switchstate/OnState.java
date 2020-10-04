//designpatterns.state.switchstate.OnState.java
package com.lx.demo.liu.wei.designpatterns.state.switchstate;

//��״̬��
public class OnState extends SwitchState{
	public void on(Switch s) {
		System.out.println("�Ѿ��򿪣�");
	}
	
	public void off(Switch s) {
		System.out.println("�رգ�");
		s.setState(Switch.getState("off"));
	}
}

//designpatterns.state.screen.Client.java
package com.lx.demo.liu.wei.designpatterns.state.screen;

public class Client {
	public static void main(String args[]) {
		Screen screen = new Screen();
		screen.onClick();
		screen.onClick();
		screen.onClick();
	}
}
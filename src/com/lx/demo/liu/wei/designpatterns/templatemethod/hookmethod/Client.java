//designpatterns.templatemethod.hookmethod.Client.java
package com.lx.demo.liu.wei.designpatterns.templatemethod.hookmethod;

public class Client {
	public static void main(String args[]) {
		DataViewer dv;
		dv = new XMLDataViewer();
		dv.process();
	}
}

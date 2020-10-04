//designpatterns.abstractfactory.SkinFactory.java
package com.lx.demo.liu.wei.designpatterns.abstractfactory;

public interface SkinFactory {
	public Button createButton();
	public TextField createTextField();
	public ComboBox createComboBox();
}
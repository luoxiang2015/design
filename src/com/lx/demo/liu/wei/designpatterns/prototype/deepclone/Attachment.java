//designpatterns.prototype.deepclone.Attachment.java
package com.lx.demo.liu.wei.designpatterns.prototype.deepclone;

import java.io.Serializable;

public class Attachment implements Serializable {
	private String name; //������

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void download() {
		System.out.println("���ظ������ļ���Ϊ" + name);	
	}
}
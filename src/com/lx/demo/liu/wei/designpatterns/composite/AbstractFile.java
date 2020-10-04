//designpatterns.composite.AbstractFile.java
package com.lx.demo.liu.wei.designpatterns.composite;

public abstract class AbstractFile {
	public abstract void add(AbstractFile file);
	public abstract void remove(AbstractFile file);
	public abstract AbstractFile getChild(int i);
	public abstract void killVirus();
}
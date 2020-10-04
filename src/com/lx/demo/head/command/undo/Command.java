package com.lx.demo.head.command.undo;

public interface Command {
	public void execute();
	public void undo();
}

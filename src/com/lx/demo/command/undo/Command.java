package com.lx.demo.command.undo;

public interface Command {
	public void execute();
	public void undo();
}

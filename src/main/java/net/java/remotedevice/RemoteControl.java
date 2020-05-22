package net.java.remotedevice;

import net.java.commandobjects.CommandBase;

public class RemoteControl {
	CommandBase getCommand, postCommand, deleteCommand;

	public void get(CommandBase getCommand) {
		this.getCommand = getCommand;
		getCommand.execute();
	}

	public void post(CommandBase postCommand) {
		this.postCommand = postCommand;
		postCommand.execute();
	}

	public void delete(CommandBase deleteCommand) {
		this.deleteCommand = deleteCommand;
		deleteCommand.execute();
	}
}